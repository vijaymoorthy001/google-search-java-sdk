/**
 * 
 */
package com.googleapis.ajax.services;

import java.util.Locale;

import com.googleapis.ajax.common.PagedList;
import com.googleapis.ajax.services.enumeration.ResultSetSize;



/**
 * The Interface GoogleSearchQuery.
 */
public interface GoogleSearchQuery<T> extends GoogleSearchAuthenticationClient {
	
	/**
	 * With query.
	 * 
	 * @param query the query
	 * 
	 * @return the google search query< t>
	 */
	public GoogleSearchQuery<T> withQuery(String query);
	
	/**
	 * With result set size.
	 * 
	 * @param rsz the rsz
	 * 
	 * @return the google search query< t>
	 */
	public GoogleSearchQuery<T> withResultSetSize(ResultSetSize rsz);

	/**
	 * With locale.
	 * 
	 * @param locale the locale
	 * 
	 * @return the google search query< t>
	 */
	public GoogleSearchQuery<T> withLocale(Locale locale);
	
	/**
	 * With start index.
	 * 
	 * @param startIndex the start index
	 * 
	 * @return the google search query< t>
	 */
	public GoogleSearchQuery<T> withStartIndex(int startIndex);
	
	/**
	 * With callback.
	 * 
	 * @param callback the callback
	 * 
	 * @return the google search query< t>
	 */
	public GoogleSearchQuery<T> withCallback(String callback);

	/**
	 * With context.
	 * 
	 * @param context the context
	 * 
	 * @return the google search query< t>
	 */
	public GoogleSearchQuery<T> withContext(String context);
	
	/**
	 * With site search.
	 * 
	 * @param site the site
	 * 
	 * @return the google search query< t>
	 */
	public GoogleSearchQuery<T> withSiteRestriction(String site);	
	
	/**
	 * With site search.
	 * 
	 * @param site the site
	 * 
	 * @return the google search query< t>
	 */
	public GoogleSearchQuery<T> withRelatedSite(String site);
	
	/**
	 * Single result.
	 * 
	 * @return the t
	 */
	public T singleResult();

	/**
	 * List.
	 * 
	 * @return the paged list< t>
	 */
	public PagedList<T> list();
	
	/**
	 * Adds the resonse handler.
	 * 
	 * @param handler the handler
	 */
	public void addResonseHandler(AsyncResponseHandler<PagedList<T>> handler);
	
	/**
	 * Reset.
	 */
	public void reset();
}
