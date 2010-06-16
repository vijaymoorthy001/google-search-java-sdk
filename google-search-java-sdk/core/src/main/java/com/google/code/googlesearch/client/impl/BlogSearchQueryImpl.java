/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.BlogSearchQuery;
import com.google.code.googlesearch.client.BlogSortOrder;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.common.PagedList;
import com.google.code.googlesearch.schema.BlogResult;
import com.google.code.googlesearch.schema.adapter.json.BlogResultImpl;

/**
 * @author nmukhtar
 *
 */
public class BlogSearchQueryImpl extends BaseGoogleSearchApiQuery<BlogResult> implements
		BlogSearchQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public BlogSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_BLOG_URL);
	}


	@Override
	public BlogSearchQuery withOrder(BlogSortOrder order) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SCORING, order);
		return this;
	}


	@Override
	protected BlogResult unmarshall(JSONObject json) {
		BlogResultImpl result = new BlogResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
