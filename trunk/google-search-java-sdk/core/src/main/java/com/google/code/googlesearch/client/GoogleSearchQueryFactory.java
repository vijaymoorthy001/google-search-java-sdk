/**
 *
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.impl.BlogSearchQueryImpl;
import com.google.code.googlesearch.client.impl.BookSearchQueryImpl;
import com.google.code.googlesearch.client.impl.DetectLanguageQueryImpl;
import com.google.code.googlesearch.client.impl.ImageSearchQueryImpl;
import com.google.code.googlesearch.client.impl.LocalSearchQueryImpl;
import com.google.code.googlesearch.client.impl.NewsSearchQueryImpl;
import com.google.code.googlesearch.client.impl.PatentSearchQueryImpl;
import com.google.code.googlesearch.client.impl.TranslateLanguageQueryImpl;
import com.google.code.googlesearch.client.impl.VideoSearchQueryImpl;
import com.google.code.googlesearch.client.impl.WebSearchQueryImpl;



/**
 * A factory for creating GoogleSearchQuery objects.
 */
public class GoogleSearchQueryFactory {

    /** The application key. */
    private String applicationKey;

    /**
     * Instantiates a new google search query factory.
     * 
     * @param applicationKey the application key
     */
	private GoogleSearchQueryFactory(String applicationKey) {
        this.applicationKey = applicationKey;
    }
	
    /**
     * New instance.
     * 
     * @param applicationKey the application key
     * 
     * @return the google search query factory
     */
    public static GoogleSearchQueryFactory newInstance(String applicationKey) {
        return new GoogleSearchQueryFactory(applicationKey);
    }
    
    /**
     * New blog search query.
     * 
     * @return the blog search query
     */
    public BlogSearchQuery newBlogSearchQuery() {
    	return new BlogSearchQueryImpl(applicationKey);
    }
    
    /**
     * New book search query.
     * 
     * @return the book search query
     */
    public BookSearchQuery newBookSearchQuery() {
    	return new BookSearchQueryImpl(applicationKey);
    }
    
    /**
     * New image search query.
     * 
     * @return the image search query
     */
    public ImageSearchQuery newImageSearchQuery() {
    	return new ImageSearchQueryImpl(applicationKey);
    }
    
    /**
     * New local search query.
     * 
     * @return the local search query
     */
    public LocalSearchQuery newLocalSearchQuery() {
    	return new LocalSearchQueryImpl(applicationKey);
    }

    /**
     * New news search query.
     * 
     * @return the news search query
     */
    public NewsSearchQuery newNewsSearchQuery() {
    	return new NewsSearchQueryImpl(applicationKey);
    }
    
    /**
     * New patent search query.
     * 
     * @return the patent search query
     */
    public PatentSearchQuery newPatentSearchQuery() {
    	return new PatentSearchQueryImpl(applicationKey);
    }
    
    /**
     * New video search query.
     * 
     * @return the video search query
     */
    public VideoSearchQuery newVideoSearchQuery() {
    	return new VideoSearchQueryImpl(applicationKey);
    }
    
    /**
     * New web search query.
     * 
     * @return the web search query
     */
    public WebSearchQuery newWebSearchQuery() {
    	return new WebSearchQueryImpl(applicationKey);
    }
    
    /**
     * New translate language query.
     * 
     * @return the translate language query
     */
    public TranslateLanguageQuery newTranslateLanguageQuery() {
    	return new TranslateLanguageQueryImpl(applicationKey);
    }

    /**
     * New detect language query.
     * 
     * @return the detect language query
     */
    public DetectLanguageQuery newDetectLanguageQuery() {
    	return new DetectLanguageQueryImpl(applicationKey);
    }
    
}
