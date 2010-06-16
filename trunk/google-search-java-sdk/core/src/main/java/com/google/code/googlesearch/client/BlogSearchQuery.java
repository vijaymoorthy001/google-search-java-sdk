/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.schema.BlogResult;

/**
 * @author nmukhtar
 *
 */
public interface BlogSearchQuery extends GoogleSearchQuery<BlogResult> {
	public BlogSearchQuery withOrder(BlogSortOrder order);

}
