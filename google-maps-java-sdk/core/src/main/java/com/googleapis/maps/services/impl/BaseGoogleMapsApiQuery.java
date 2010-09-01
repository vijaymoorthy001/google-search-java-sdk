/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.googleapis.maps.services.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.googleapis.maps.schema.AddressComponentType;
import com.googleapis.maps.schema.GeoLocation;
import com.googleapis.maps.schema.LocationType;
import com.googleapis.maps.schema.TravelMode;
import com.googleapis.maps.services.AsyncResponseHandler;
import com.googleapis.maps.services.GoogleMapsException;
import com.googleapis.maps.services.GoogleMapsQuery;
import com.googleapis.maps.services.InvalidRequestException;
import com.googleapis.maps.services.NotFoundException;
import com.googleapis.maps.services.OverQueryLimitsException;
import com.googleapis.maps.services.RequestDeniedException;
import com.googleapis.maps.services.constant.ApplicationConstants;
import com.googleapis.maps.services.constant.GoogleMapsApiUrls.GoogleMapsApiUrlBuilder;

/**
 * The Class BaseGoogleMapsApiQuery.
 */
public abstract class BaseGoogleMapsApiQuery<T> extends GoogleMapsApiGateway implements GoogleMapsQuery<T> {
	
	/** The Constant UTF_8_CHAR_SET. */
	protected static final Charset UTF_8_CHAR_SET = Charset.forName(ApplicationConstants.CONTENT_ENCODING);

	/** The api url builder. */
	protected GoogleMapsApiUrlBuilder apiUrlBuilder;
    
    /** The parser. */
    protected final JsonParser parser = new JsonParser();
    
    /** The handlers. */
    private List<AsyncResponseHandler<List<T>>> handlers = new ArrayList<AsyncResponseHandler<List<T>>>();
	
	/**
	 * Instantiates a new base google maps api query.
	 * 
	 * @param applicationId the application id
	 */
	public BaseGoogleMapsApiQuery(String applicationId) {
		super.setApplicationKey(applicationId);
        requestHeaders = new HashMap<String, String>();

        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
        this.reset();
	}

	/**
	 * Instantiates a new base google maps api query.
	 * 
	 * @param applicationId the application id
	 * @param apiVersion the api version
	 */
	public BaseGoogleMapsApiQuery(String applicationId, String apiVersion) {
		this(applicationId);
		super.setApiVersion(apiVersion);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#list()
	 */
	@Override
	public List<T> list() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiGet(apiUrlBuilder.buildUrl());
        	JsonElement response = parser.parse(new InputStreamReader(jsonContent, UTF_8_CHAR_SET));
        	if (response.isJsonObject()) {
        		List<T> responseList = unmarshallList(response.getAsJsonObject());
        		notifyObservers(responseList);
    			return responseList;
        	}
        	throw new GoogleMapsException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new GoogleMapsException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}

	/**
	 * Unmarshall list.
	 * 
	 * @param response the response
	 * 
	 * @return the list< t>
	 */
	protected List<T> unmarshallList(JsonObject response) {
		String status = response.get("status").getAsString();
		if (!"OK".equals(status) && !"ZERO_RESULTS".equals(status)) {
			throw createGoogleMapsException(status);
		}
		ArrayList<T> list = new ArrayList<T>();
		JsonArray results = response.get("results").getAsJsonArray();
		for (JsonElement object : results) {
			T element = unmarshall(object);
			list.add(element);
		}
		return list;
	}

	/**
	 * Unmarshall.
	 * 
	 * @param object the object
	 * 
	 * @return the t
	 */
	protected abstract T unmarshall(JsonElement object);

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#singleResult()
	 */
	@Override
	public T singleResult() {
		List<T> list = list();
		return (list == null || list.isEmpty())? null : list.get(0);
	}
	
	/**
	 * Notify observers.
	 * 
	 * @param response the response
	 */
	protected void notifyObservers(List<T> response) {
		for(AsyncResponseHandler<List<T>> handler : handlers) {
			handler.handleResponse(response);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackExchangeApiQuery#addResonseHandler(com.google.code.stackexchange.client.AsyncResponseHandler)
	 */
	public void addResonseHandler(AsyncResponseHandler<List<T>> handler) {
		handlers.add(handler);
	}
	
    /* (non-Javadoc)
     * @see com.google.code.stackexchange.client.impl.StackOverflowApiGateway#marshallObject(java.lang.Object)
     */
    protected String marshallObject(Object element) {
    	return null;
    }
    
	/**
	 * Gets the gson builder.
	 * 
	 * @return the gson builder
	 */
	protected GsonBuilder getGsonBuilder() {
		GsonBuilder builder = new GsonBuilder();
		builder.setDateFormat(ApplicationConstants.RFC822DATEFORMAT);
		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
		builder.registerTypeAdapter(LocationType.class, new JsonDeserializer<LocationType>() {
			@Override
			public LocationType deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return LocationType.fromValue(arg0.getAsString());
			}
		});
		builder.registerTypeAdapter(AddressComponentType.class, new JsonDeserializer<AddressComponentType>() {
			@Override
			public AddressComponentType deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return AddressComponentType.fromValue(arg0.getAsString());
			}
		});
		builder.registerTypeAdapter(TravelMode.class, new JsonDeserializer<TravelMode>() {
			@Override
			public TravelMode deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return TravelMode.fromValue(arg0.getAsString());
			}
		});
		
		return builder;
	}
    
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.GoogleSearchApiGateway#unmarshallObject(java.lang.Class, java.io.InputStream)
	 */
	@Override
	protected <V> V unmarshallObject(Class<V> clazz, InputStream xmlContent) {
		return null;
	}
	
	/**
	 * Creates the google search api url builder.
	 * 
	 * @param urlFormat the url format
	 * 
	 * @return the google maps api url builder
	 */
	protected GoogleMapsApiUrlBuilder createGoogleSearchApiUrlBuilder(String urlFormat) {
		return new GoogleMapsApiUrlBuilder(urlFormat);
	}
	
	/**
	 * To parameter string.
	 * 
	 * @param locations the locations
	 * 
	 * @return the string
	 */
	protected String toParameterString(GeoLocation... locations) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < locations.length; i++) {
			builder.append(locations[i].getLat());
			builder.append(",");
			builder.append(locations[i].getLng());
			if (i < locations.length - 1) {
				builder.append("|");
			}
		}
		return builder.toString();
	}
	
	/**
	 * Creates the google maps exception.
	 * 
	 * @param statusCode the status code
	 * 
	 * @return the google maps exception
	 */
	protected GoogleMapsException createGoogleMapsException(String statusCode) {
		if ("OVER_QUERY_LIMIT".equals(statusCode)) {
			return new OverQueryLimitsException("indicates that you are over your quota.");
		} else if ("REQUEST_DENIED".equals(statusCode)) {
			return new RequestDeniedException("indicates that your request was denied, generally because of lack of a sensor parameter.");
		} else if ("INVALID_REQUEST".equals(statusCode)) {
			return new InvalidRequestException("generally indicates that the query (address or latlng) is missing.");
		} else if ("NOT_FOUND".equals(statusCode)) {
			return new NotFoundException("indicates at least one of the locations specified in the requests's origin, destination, or waypoints could not be geocoded.");
		} else if ("MAX_WAYPOINTS_EXCEEDED".equals(statusCode)) {
			return new NotFoundException("indicates that too many waypointss were provided in the request The maximum allowed waypoints is 8, plus the origin, and destination.");
		} else if ("UNKNOWN_ERROR".equals(statusCode)) {
			return new NotFoundException("indicates a directions request could not be processed due to a server error. The request may succeed if you try again.");
		} else {
			return null;
		}
	}
}
