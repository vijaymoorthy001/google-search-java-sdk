package com.google.code.googlesearch.client.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.code.googlesearch.client.AsyncResponseHandler;
import com.google.code.googlesearch.client.GoogleSearchQuery;
import com.google.code.googlesearch.client.GoogleSearchException;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls.GoogleSearchApiUrlBuilder;
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
        		PagedList<T> responseList = unmarshall((JSONObject) response);
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
        	if (response instanceof JSONObject) {
        		PagedList<T> responseList = unmarshall((JSONObject) response);
        		notifyObservers(responseList);
				return getFirstElement(responseList);
        	}
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
	protected abstract PagedList<T> unmarshall(JSONObject json);
	
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
}
