package com.google.code.googlesearch.client.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.code.googlesearch.client.AsyncResponseHandler;
import com.google.code.googlesearch.client.GoogleSearchException;
import com.google.code.googlesearch.client.GoogleSearchQuery;
import com.google.code.googlesearch.client.ResultSetSize;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls.GoogleSearchApiUrlBuilder;
import com.google.code.googlesearch.common.PagedArrayList;
import com.google.code.googlesearch.common.PagedList;

/**
 * The Class BaseStackOverflowApiQuery.
 */
public abstract class BaseGoogleSearchApiQuery<T> extends GoogleSearchApiGateway implements GoogleSearchQuery<T> {
	
	/** The api url builder. */
	protected GoogleSearchApiUrlBuilder apiUrlBuilder;
    
    /** The parser. */
    private final JSONParser parser = new JSONParser();
    
    /** The handlers. */
    private List<AsyncResponseHandler<PagedList<T>>> handlers = new ArrayList<AsyncResponseHandler<PagedList<T>>>();
	
	/**
	 * Instantiates a new base stack overflow api query.
	 * 
	 * @param applicationId the application id
	 */
	public BaseGoogleSearchApiQuery(String applicationId) {
		super.setApplicationKey(applicationId);
        requestHeaders = new HashMap<String, String>();

        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
        this.reset();
	}

	/**
	 * Instantiates a new base stack overflow api query.
	 * 
	 * @param applicationId the application id
	 * @param apiVersion the api version
	 */
	public BaseGoogleSearchApiQuery(String applicationId, String apiVersion) {
		this(applicationId);
		super.setApiVersion(apiVersion);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#list()
	 */
	@Override
	public PagedList<T> list() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiMethod(apiUrlBuilder.buildUrl());
        	Object response = parser.parse(new InputStreamReader(jsonContent));
        	if (response instanceof JSONObject) {
        		PagedList<T> responseList = unmarshallList((JSONObject) response);
        		notifyObservers(responseList);
				return responseList;
        	}
        	throw new GoogleSearchException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new GoogleSearchException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#singleResult()
	 */
	@Override
	public T singleResult() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiMethod(apiUrlBuilder.buildUrl());
        	Object response = parser.parse(new InputStreamReader(jsonContent));
//        	if (response instanceof JSONObject) {
//        		PagedList<T> responseList = unmarshall((JSONObject) response);
//        		notifyObservers(responseList);
//				return getFirstElement(responseList);
//        	}
        	throw new GoogleSearchException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new GoogleSearchException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}
	
	/**
	 * Notify observers.
	 * 
	 * @param response the response
	 */
	protected void notifyObservers(PagedList<T> response) {
		for(AsyncResponseHandler<PagedList<T>> handler : handlers) {
			handler.handleResponse(response);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackExchangeApiQuery#addResonseHandler(com.google.code.stackexchange.client.AsyncResponseHandler)
	 */
	public void addResonseHandler(AsyncResponseHandler<PagedList<T>> handler) {
		handlers.add(handler);
	}
	
    /* (non-Javadoc)
     * @see com.google.code.stackexchange.client.impl.StackOverflowApiGateway#marshallObject(java.lang.Object)
     */
    protected String marshallObject(Object element) {
    	return null;
    }
	
	/**
	 * Unmarshall.
	 * 
	 * @param json the json
	 * 
	 * @return the paged list< t>
	 */
	protected PagedList<T> unmarshallList(JSONObject json) {
		int status = ((Long) json.get("responseStatus")).intValue();
		if (status != 200) {
			throw new GoogleSearchException(String.valueOf(json.get("responseDetails")));
		}
		JSONObject data = (JSONObject) json.get("responseData");
		PagedList<T> list = new PagedArrayList<T>();
		if (data != null) { 
			JSONArray results = (JSONArray) data.get("results");
			if (results != null) {
				for (Object object : results) {
					T element = unmarshall((JSONObject) object);
					list.add(element);
				}
			}
			JSONObject cursor = (JSONObject) data.get("cursor");
			// TODO-NM: Set cursor
		} 
		return list;
	}
	
	protected abstract T unmarshall(JSONObject json);
	
	/**
	 * Gets the first element.
	 * 
	 * @param list the list
	 * 
	 * @return the first element
	 */
	private T getFirstElement(List<T> list) {
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
	
	@Override
	protected <V> V unmarshallObject(Class<V> clazz, InputStream xmlContent) {
		return null;
	}
	
	protected GoogleSearchApiUrlBuilder createGoogleSearchApiUrlBuilder(String urlFormat) {
		return new GoogleSearchApiUrlBuilder(urlFormat);
	}

	@Override
	public GoogleSearchQuery<T> withCallback(String callback) {
		apiUrlBuilder.withParameter(ParameterNames.CALLBACK, callback);
		return this;
	}

	@Override
	public GoogleSearchQuery<T> withContext(String context) {
		apiUrlBuilder.withParameter(ParameterNames.CONTEXT, context);
		return this;
	}

	@Override
	public GoogleSearchQuery<T> withLocale(Locale locale) {
		apiUrlBuilder.withParameter(ParameterNames.HOST_LANGUAGE, locale.getLanguage());
		return this;
	}

	@Override
	public GoogleSearchQuery<T> withQuery(String query) {
		apiUrlBuilder.withParameter(ParameterNames.QUERY, query);
		return this;
	}

	@Override
	public GoogleSearchQuery<T> withResultSetSize(ResultSetSize rsz) {
		apiUrlBuilder.withParameterEnum(ParameterNames.RESULTSET_SIZE, rsz);
		return this;
	}

	@Override
	public GoogleSearchQuery<T> withSiteSearch(String site) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public GoogleSearchQuery<T> withStartIndex(int startIndex) {
		apiUrlBuilder.withParameter(ParameterNames.START, String.valueOf(startIndex));
		return this;
	}
}
