/**
 * 
 */
package com.google.code.googlesearch.client.search;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.code.googlesearch.client.BlogSearchQuery;
import com.google.code.googlesearch.client.BookSearchQuery;
import com.google.code.googlesearch.client.GoogleSearchQueryFactory;
import com.google.code.googlesearch.client.ImageSearchQuery;
import com.google.code.googlesearch.client.LocalSearchQuery;
import com.google.code.googlesearch.client.NewsSearchQuery;
import com.google.code.googlesearch.client.PatentSearchQuery;
import com.google.code.googlesearch.client.VideoSearchQuery;
import com.google.code.googlesearch.client.WebSearchQuery;
import com.google.code.googlesearch.common.PagedList;
import com.google.code.googlesearch.schema.BlogResult;
import com.google.code.googlesearch.schema.BookResult;
import com.google.code.googlesearch.schema.ImageResult;
import com.google.code.googlesearch.schema.LocalResult;
import com.google.code.googlesearch.schema.NewsResult;
import com.google.code.googlesearch.schema.PatentResult;
import com.google.code.googlesearch.schema.VideoResult;
import com.google.code.googlesearch.schema.WebResult;

/**
 * @author nmukhtar
 *
 */
public class GoogleSearchJsonQueryTest extends BaseGoogleSearchClientTest {
	
	GoogleSearchQueryFactory factory = GoogleSearchQueryFactory.newInstance(null);
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearchBlogs() {
		BlogSearchQuery query = factory.newBlogSearchQuery();
		PagedList<BlogResult> result = query.list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	@Test
	public void testSearchBooks() {
		BookSearchQuery query = factory.newBookSearchQuery();
		PagedList<BookResult> result = query.list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	@Test
	public void testSearchImages() {
		ImageSearchQuery query = factory.newImageSearchQuery();
		PagedList<ImageResult> result = query.list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	@Test
	public void testSearchLocal() {
		LocalSearchQuery query = factory.newLocalSearchQuery();
		PagedList<LocalResult> result = query.list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	@Test
	public void testSearchNews() {
		NewsSearchQuery query = factory.newNewsSearchQuery();
		PagedList<NewsResult> result = query.list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	@Test
	public void testSearchPatents() {
		PatentSearchQuery query = factory.newPatentSearchQuery();
		PagedList<PatentResult> result = query.list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	@Test
	public void testSearchVideos() {
		VideoSearchQuery query = factory.newVideoSearchQuery();
		PagedList<VideoResult> result = query.list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
	
	@Test
	public void testSearchWeb() {
		WebSearchQuery query = factory.newWebSearchQuery();
		PagedList<WebResult> result = query.list();
		assertNotNullOrEmpty("Search result should not be null or empty.", result);
	}
}
