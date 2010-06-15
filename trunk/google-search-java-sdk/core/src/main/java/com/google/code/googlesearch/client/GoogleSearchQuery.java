/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.common.PagedList;



/**
 * The Interface StackExchangeApiQuery.
 */
public interface GoogleSearchQuery<T> extends GoogleSearchAuthenticationClient {
	
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
