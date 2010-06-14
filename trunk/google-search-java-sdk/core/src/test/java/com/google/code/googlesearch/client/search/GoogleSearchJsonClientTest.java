/**
 * 
 */
package com.google.code.googlesearch.client.search;

import java.util.concurrent.Future;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.code.googlesearch.client.enumeration.ApiProtocol;
import com.google.code.googlesearch.schema.SearchResponse;

/**
 * @author nmukhtar
 *
 */
public class GoogleSearchJsonClientTest extends BaseGoogleSearchClientTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		client = factory.createBingSearchClient(ApiProtocol.JSON);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		client = null;
	}

	/**
	 * Test method for {@link com.google.code.googlesearch.client.impl.BaseGoogleSearchApiClient#search(com.microsoft.schemas.livesearch._2008._03.search.SearchRequest)}.
	 */
	@Test
	public void testSearch() {
		SearchResponse response = client.search(createSearchRequest());
		assertNotNull("Response should never be null.", response);
	}

	/**
	 * Test method for {@link com.google.code.googlesearch.client.impl.BaseGoogleSearchApiClient#searchAsync(com.microsoft.schemas.livesearch._2008._03.search.SearchRequest)}.
	 */
	@Test
	public void testSearchAsync() {
		Future<SearchResponse> response = client.searchAsync(createSearchRequest());
		try {
			assertNotNull("Response should never be null.", response.get());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
