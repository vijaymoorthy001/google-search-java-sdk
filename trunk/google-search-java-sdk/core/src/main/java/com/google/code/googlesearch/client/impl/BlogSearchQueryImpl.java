/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import com.google.code.googlesearch.client.BlogSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.BlogSortOrder;
import com.google.code.googlesearch.schema.BlogResult;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

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

	@Override
	protected BlogResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, BlogResult.class);
	}
}
