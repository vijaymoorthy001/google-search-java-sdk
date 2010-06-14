/**
 * 
 */
package com.google.code.googlesearch.client.search;

import junit.framework.TestCase;

import com.google.code.googlesearch.client.GoogleSearchClient;
import com.google.code.googlesearch.client.GoogleSearchServiceClientFactory;
import com.google.code.googlesearch.client.GoogleSearchClient.SearchRequestBuilder;
import com.google.code.googlesearch.schema.SearchRequest;

/**
 * @author nmukhtar
 *
 */
public class BaseGoogleSearchClientTest extends TestCase {
    /** Field description */
	protected GoogleSearchServiceClientFactory factory;
	
    /** Field description */
	protected GoogleSearchClient client;

	/**
	 * 
	 */
	protected SearchRequest createSearchRequest() {
		SearchRequestBuilder requestBuilder = client.newSearchRequestBuilder();
		// TODO-NM: Populate request with test data.
		return requestBuilder.getResult();
	}
	
	/**
	 * 
	 */
	protected static void assertNotNullOrEmpty(String message, String value) {
		assertNotNull(message, value);
		assertFalse(message, "".equals(value));
	}
}
