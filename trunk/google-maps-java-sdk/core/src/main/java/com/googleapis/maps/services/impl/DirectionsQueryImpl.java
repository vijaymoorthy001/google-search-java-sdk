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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.googleapis.maps.schema.DirectionsResult;
import com.googleapis.maps.schema.GeoLocation;
import com.googleapis.maps.schema.Language;
import com.googleapis.maps.schema.RouteType;
import com.googleapis.maps.schema.TravelMode;
import com.googleapis.maps.schema.UnitSystem;
import com.googleapis.maps.services.DirectionsQuery;
import com.googleapis.maps.services.constant.GoogleMapsApiUrls;
import com.googleapis.maps.services.constant.ParameterNames;

/**
 * The Class DetectLanguageQueryImpl.
 */
public class DirectionsQueryImpl extends BaseGoogleMapsApiQuery<DirectionsResult> implements
	DirectionsQuery {
	
	/**
	 * Instantiates a new detect language query impl.
	 * 
	 * @param applicationId the application id
	 */
	public DirectionsQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleMapsApiUrls.DIRECTIONS_URL);
	}

	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected DirectionsResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, DirectionsResult.class);
	}


	@Override
	public DirectionsQuery withAlternatives(boolean alternatives) {
		apiUrlBuilder.withParameter(ParameterNames.ALTERNATIVES, String.valueOf(alternatives));
		return this;
	}


	@Override
	public DirectionsQuery withAvoid(RouteType avoid) {
		apiUrlBuilder.withParameterEnum(ParameterNames.AVOID, avoid);
		return this;
	}


	@Override
	public DirectionsQuery withDestination(String destination) {
		apiUrlBuilder.withParameter(ParameterNames.DESTINATION, destination);
		return this;
	}


	@Override
	public DirectionsQuery withDestination(GeoLocation destination) {
		apiUrlBuilder.withParameter(ParameterNames.DESTINATION, toParameterString(destination));
		return this;
	}


	@Override
	public DirectionsQuery withLanguage(Language language) {
		apiUrlBuilder.withParameterEnum(ParameterNames.LANGUAGE, language);
		return this;
	}


	@Override
	public DirectionsQuery withMode(TravelMode mode) {
		apiUrlBuilder.withParameterEnum(ParameterNames.MODE, mode);
		return this;
	}


	@Override
	public DirectionsQuery withOrigin(String origin) {
		apiUrlBuilder.withParameter(ParameterNames.ORIGIN, origin);
		return this;
	}


	@Override
	public DirectionsQuery withOrigin(GeoLocation origin) {
		apiUrlBuilder.withParameter(ParameterNames.ORIGIN, toParameterString(origin));
		return this;
	}


	@Override
	public DirectionsQuery withSensor(boolean sensor) {
		apiUrlBuilder.withParameter(ParameterNames.SENSOR, String.valueOf(sensor));
		return this;
	}


	@Override
	public DirectionsQuery withUnits(UnitSystem units) {
		apiUrlBuilder.withParameterEnum(ParameterNames.UNITS, units);
		return this;
	}


	@Override
	public DirectionsQuery withWaypoints(String... waypoints) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < waypoints.length; i++) {
			builder.append(waypoints[i]);
			if (i < waypoints.length - 1) {
				builder.append("|");
			}
		}
		apiUrlBuilder.withParameter(ParameterNames.WAYPOINTS, builder.toString());
		return this;
	}


	@Override
	public DirectionsQuery withWaypoints(GeoLocation... waypoints) {
		apiUrlBuilder.withParameter(ParameterNames.WAYPOINTS, toParameterString(waypoints));
		return this;
	}
	
	/**
	 * Unmarshall list.
	 * 
	 * @param response the response
	 * 
	 * @return the paged list< t>
	 */
	protected List<DirectionsResult> unmarshallList(JsonObject response) {
		String status = response.get("status").getAsString();
		if (!"OK".equals(status) && !"ZERO_RESULTS".equals(status)) {
			throw createGoogleMapsException(status);
		}
		ArrayList<DirectionsResult> list = new ArrayList<DirectionsResult>();
		JsonArray results = response.get("routes").getAsJsonArray();
		for (JsonElement object : results) {
			DirectionsResult element = unmarshall(object);
			list.add(element);
		}
		return list;
	}
}
