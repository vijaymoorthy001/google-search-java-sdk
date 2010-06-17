/**
 * 
 */
package com.google.code.googlesearch.client.search;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class GoogleSearchJsonClientTest.
 */
public class GoogleSearchJsonClientTest extends BaseGoogleSearchClientTest {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		client = factory.createGoogleSearchClient();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		client = null;
	}

	/**
	 * Test search blogs.
	 */
	@Test
	public void testSearchBlogs() {
	}
	
	/**
	 * Test search books.
	 */
	@Test
	public void testSearchBooks() {
	}
	
	/**
	 * Test search images.
	 */
	@Test
	public void testSearchImages() {
	}
	
	/**
	 * Test search local.
	 */
	@Test
	public void testSearchLocal() {
	}
	
	/**
	 * Test search news.
	 */
	@Test
	public void testSearchNews() {
	}
	
	/**
	 * Test search patents.
	 */
	@Test
	public void testSearchPatents() {
	}
	
	/**
	 * Test search videos.
	 */
	@Test
	public void testSearchVideos() {
	}
	
	/**
	 * Test search web.
	 */
	@Test
	public void testSearchWeb() {
	}
}
