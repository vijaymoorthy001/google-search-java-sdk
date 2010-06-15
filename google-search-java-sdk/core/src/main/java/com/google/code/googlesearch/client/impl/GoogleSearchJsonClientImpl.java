/**
 *
 */
package com.google.code.googlesearch.client.impl;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.code.googlesearch.client.GoogleSearchException;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls.GoogleSearchApiUrlBuilder;
import com.google.code.googlesearch.schema.SchemaEntity;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author Nabeel Mukhtar
 *
 */
public class GoogleSearchJsonClientImpl extends BaseGoogleSearchApiClient {

    /** Field description */
    private final JSONParser parser = new JSONParser();
    
    /** Field description */
	private static final Map<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>> ADAPTER_CLASSES_MAP = new HashMap<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>>();
	
	static {
//		ADAPTER_CLASSES_MAP.put(SearchResponse.class, SearchResponseImpl.class);
	}
    
    /**
     * Method description
     *
     *
     * @param xmlContent
     * @param <T>
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    protected <T> T unmarshallObject(Class<T> clazz, InputStream jsonContent) {
        try {
        	Object response = parser.parse(new InputStreamReader(jsonContent));
        	if (response instanceof JSONObject) {
        		if (((JSONObject) response).get("SearchResponse") != null) {
            		Adaptable<?, JSONObject> adaptable = (Adaptable<?, JSONObject>) ADAPTER_CLASSES_MAP.get(clazz).newInstance();
            		adaptable.adaptFrom((JSONObject) ((JSONObject) response).get("SearchResponse"));
            		return (T) adaptable;
        		}
        	}
        	throw new GoogleSearchException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new GoogleSearchException(e);
        }
    }

    /**
     * Method description
     *
     *
     * @param element
     *
     * @return
     */
    protected String marshallObject(Object element) {
        try {
            StringWriter writer = new StringWriter();
            
            // TODO-NM: Implement this method.
            return writer.toString();
        } catch (Exception e) {
            throw new GoogleSearchException(e);
        }
    }

    /**
     * Method description
     *
     *
     * @param urlFormat
     *
     * @return
     */
    protected GoogleSearchApiUrlBuilder createBingSearchApiUrlBuilder(String urlFormat) {
        return new GoogleSearchApiUrlBuilder(urlFormat);
    }
}
