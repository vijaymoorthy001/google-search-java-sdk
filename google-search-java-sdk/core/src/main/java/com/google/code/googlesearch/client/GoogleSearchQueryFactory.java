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
 * A factory for creating StackExchangeApiQuery objects.
 */
public class GoogleSearchQueryFactory {

    /** The application key. */
    private String applicationKey;

    /**
     * Instantiates a new stack exchange api query factory.
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
     * @return the stack exchange api query factory
     */
    public static GoogleSearchQueryFactory newInstance(String applicationKey) {
        return new GoogleSearchQueryFactory(applicationKey);
    }
    
    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public BlogSearchQuery newBlogSearchQuery() {
    	return new BlogSearchQueryImpl(applicationKey);
    }
    
    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public BookSearchQuery newBookSearchQuery() {
    	return new BookSearchQueryImpl(applicationKey);
    }
    
    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public ImageSearchQuery newImageSearchQuery() {
    	return new ImageSearchQueryImpl(applicationKey);
    }
    
    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public LocalSearchQuery newLocalSearchQuery() {
    	return new LocalSearchQueryImpl(applicationKey);
    }

    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public NewsSearchQuery newNewsSearchQuery() {
    	return new NewsSearchQueryImpl(applicationKey);
    }
    
    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public PatentSearchQuery newPatentSearchQuery() {
    	return new PatentSearchQueryImpl(applicationKey);
    }
    
    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public VideoSearchQuery newVideoSearchQuery() {
    	return new VideoSearchQueryImpl(applicationKey);
    }
    
    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public WebSearchQuery newWebSearchQuery() {
    	return new WebSearchQueryImpl(applicationKey);
    }
    
    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public TranslateLanguageQuery newTranslateLanguageQuery() {
    	return new TranslateLanguageQueryImpl(applicationKey);
    }

    /**
     * New answer api query.
     * 
     * @return the answer api query
     */
    public DetectLanguageQuery newDetectLanguageQuery() {
    	return new DetectLanguageQueryImpl(applicationKey);
    }
    
}
