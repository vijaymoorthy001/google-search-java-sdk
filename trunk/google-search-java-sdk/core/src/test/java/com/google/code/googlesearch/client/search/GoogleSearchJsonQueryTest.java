/**
 * 
 */
package com.google.code.googlesearch.client.search;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.code.googlesearch.client.BlogSearchQuery;
import com.google.code.googlesearch.client.BookSearchQuery;
import com.google.code.googlesearch.client.DetectLanguageQuery;
import com.google.code.googlesearch.client.GoogleSearchQueryFactory;
import com.google.code.googlesearch.client.ImageSearchQuery;
import com.google.code.googlesearch.client.LocalSearchQuery;
import com.google.code.googlesearch.client.NewsSearchQuery;
import com.google.code.googlesearch.client.PatentSearchQuery;
import com.google.code.googlesearch.client.TranslateLanguageQuery;
import com.google.code.googlesearch.client.VideoSearchQuery;
import com.google.code.googlesearch.client.WebSearchQuery;
import com.google.code.googlesearch.client.constant.TestConstants;
import com.google.code.googlesearch.common.PagedList;
import com.google.code.googlesearch.schema.BlogResult;
import com.google.code.googlesearch.schema.BookResult;
import com.google.code.googlesearch.schema.DetectLanguageResult;
import com.google.code.googlesearch.schema.ImageResult;
import com.google.code.googlesearch.schema.LocalResult;
import com.google.code.googlesearch.schema.NewsResult;
import com.google.code.googlesearch.schema.PatentResult;
import com.google.code.googlesearch.schema.TranslateLanguageResult;
import com.google.code.googlesearch.schema.VideoResult;
import com.google.code.googlesearch.schema.WebResult;

/**
 * The Class GoogleSearchJsonQueryTest.
 */
public class GoogleSearchJsonQueryTest extends BaseGoogleSearchClientTest {
	
	/** The factory. */
	private GoogleSearchQueryFactory factory;
	

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		factory = GoogleSearchQueryFactory.newInstance(TestConstants.TEST_API_KEY);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		factory = null;
	}

	/**
	 * Test search blogs.
	 */
	@Test
	public void testSearchBlogs() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		BlogSearchQuery query = factory.newBlogSearchQuery();
		PagedList<BlogResult> result = query.withQuery(TestConstants.TEST_QUERY).list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	/**
	 * Test search books.
	 */
	@Test
	public void testSearchBooks() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		BookSearchQuery query = factory.newBookSearchQuery();
		PagedList<BookResult> result = query.withQuery(TestConstants.TEST_QUERY).list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	/**
	 * Test search images.
	 */
	@Test
	public void testSearchImages() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		ImageSearchQuery query = factory.newImageSearchQuery();
		PagedList<ImageResult> result = query.withQuery(TestConstants.TEST_QUERY).list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	/**
	 * Test search local.
	 */
	@Test
	public void testSearchLocal() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		LocalSearchQuery query = factory.newLocalSearchQuery();
		PagedList<LocalResult> result = query.withQuery(TestConstants.TEST_QUERY).list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	/**
	 * Test search news.
	 */
	@Test
	public void testSearchNews() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		NewsSearchQuery query = factory.newNewsSearchQuery();
		PagedList<NewsResult> result = query.withQuery(TestConstants.TEST_QUERY).list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	/**
	 * Test search patents.
	 */
	@Test
	public void testSearchPatents() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		PatentSearchQuery query = factory.newPatentSearchQuery();
		PagedList<PatentResult> result = query.withQuery(TestConstants.TEST_QUERY).list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	/**
	 * Test search videos.
	 */
	@Test
	public void testSearchVideos() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		VideoSearchQuery query = factory.newVideoSearchQuery();
		PagedList<VideoResult> result = query.withQuery(TestConstants.TEST_QUERY).list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	/**
	 * Test search web.
	 */
	@Test
	public void testSearchWeb() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		WebSearchQuery query = factory.newWebSearchQuery();
		PagedList<WebResult> result = query.withQuery(TestConstants.TEST_QUERY).list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	/**
	 * Test detect language.
	 */
	@Test
	public void testDetectLanguage() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		DetectLanguageQuery query = factory.newDetectLanguageQuery();
		DetectLanguageResult result = query.withQuery(TestConstants.TEST_QUERY).singleResult();
		assertNotNull("Search result should not be null or empty.", result);
	}

	/**
	 * Test translate language.
	 */
	@Test
	public void testTranslateLanguage() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Query."), TestConstants.TEST_QUERY);
		TranslateLanguageQuery query = factory.newTranslateLanguageQuery();
		TranslateLanguageResult result = query.withLanguagePair(null, "de").withQuery(TestConstants.TEST_QUERY).singleResult();
		assertNotNull("Search result should not be null or empty.", result);
	}
}
