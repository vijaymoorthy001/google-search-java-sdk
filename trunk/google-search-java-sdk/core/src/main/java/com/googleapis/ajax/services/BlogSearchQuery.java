/**
 * 
 */
package com.googleapis.ajax.services;

import com.googleapis.ajax.schema.BlogResult;
import com.googleapis.ajax.services.enumeration.BlogSortOrder;

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
