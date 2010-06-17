/**
 * 
 */
package com.google.code.googlesearch.client.search;

import java.util.Collection;

import junit.framework.TestCase;

import com.google.code.googlesearch.client.GoogleSearchClient;
import com.google.code.googlesearch.client.GoogleSearchServiceClientFactory;

/**
 * The Class BaseGoogleSearchClientTest.
 */
public class BaseGoogleSearchClientTest extends TestCase {
    
    /** The factory. */
	protected GoogleSearchServiceClientFactory factory;
	
    /** The client. */
	protected GoogleSearchClient client;

	/**
	 * Assert not null or empty.
	 * 
	 * @param message the message
	 * @param value the value
	 */
	protected static void assertNotNullOrEmpty(String message, String value) {
		assertNotNull(message, value);
		assertFalse(message, "".equals(value));
	}
	
	/**
	 * Assert not null or empty.
	 * 
	 * @param message the message
	 * @param value the value
	 */
	protected static void assertNotNullOrEmpty(String message, Collection<?> value) {
		assertNotNull(message, value);
		assertFalse(message, value.isEmpty());
	}
}
