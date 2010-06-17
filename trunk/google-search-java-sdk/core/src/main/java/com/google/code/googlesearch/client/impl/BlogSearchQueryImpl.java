/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.BlogSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.BlogSortOrder;
import com.google.code.googlesearch.schema.BlogResult;
import com.google.code.googlesearch.schema.adapter.json.BlogResultImpl;

/**
 * The Class BlogSearchQueryImpl.
 */
public class BlogSearchQueryImpl extends BaseGoogleSearchApiQuery<BlogResult> implements
		BlogSearchQuery {
	
	/**
	 * Instantiates a new blog search query impl.
	 * 
	 * @param applicationId the application id
	 */
	public BlogSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_BLOG_URL);
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.BlogSearchQuery#withOrder(com.google.code.googlesearch.client.enumeration.BlogSortOrder)
	 */
	@Override
	public BlogSearchQuery withOrder(BlogSortOrder order) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SCORING, order);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected BlogResult unmarshall(JSONObject json) {
		BlogResultImpl result = new BlogResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
