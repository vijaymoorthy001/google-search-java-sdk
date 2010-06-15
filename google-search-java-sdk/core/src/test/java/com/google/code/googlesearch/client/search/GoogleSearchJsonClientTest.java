/**
 * 
 */
package com.google.code.googlesearch.client.search;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		client = factory.createGoogleSearchClient();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		client = null;
	}

	@Test
	public void testSearchBlogs() {
	}
	
	@Test
	public void testSearchBooks() {
	}
	
	@Test
	public void testSearchImages() {
	}
	
	@Test
	public void testSearchLocal() {
	}
	
	@Test
	public void testSearchNews() {
	}
	
	@Test
	public void testSearchPatents() {
	}
	
	@Test
	public void testSearchVideos() {
	}
	
	@Test
	public void testSearchWeb() {
	}
}
