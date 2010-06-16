/**
 * 
 */
package com.google.code.googlesearch.client;

import java.util.Locale;

import com.google.code.googlesearch.client.enumeration.ResultSetSize;
import com.google.code.googlesearch.common.PagedList;



/**
 * The Interface StackExchangeApiQuery.
 */
public interface GoogleSearchQuery<T> extends GoogleSearchAuthenticationClient {
	
	public GoogleSearchQuery<T> withQuery(String query);
	
	public GoogleSearchQuery<T> withResultSetSize(ResultSetSize rsz);

	public GoogleSearchQuery<T> withLocale(Locale locale);
	
	public GoogleSearchQuery<T> withStartIndex(int startIndex);
	
	public GoogleSearchQuery<T> withCallback(String callback);

	public GoogleSearchQuery<T> withContext(String context);
	
	public GoogleSearchQuery<T> withSiteSearch(String site);	
	
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
