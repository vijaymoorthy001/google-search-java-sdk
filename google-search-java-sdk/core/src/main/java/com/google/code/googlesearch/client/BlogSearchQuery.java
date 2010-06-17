/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.BlogSortOrder;
import com.google.code.googlesearch.schema.BlogResult;

/**
 * The Interface BlogSearchQuery.
 */
public interface BlogSearchQuery extends GoogleSearchQuery<BlogResult> {
	
	/**
	 * With order.
	 * 
	 * @param order the order
	 * 
	 * @return the blog search query
	 */
	public BlogSearchQuery withOrder(BlogSortOrder order);

}
