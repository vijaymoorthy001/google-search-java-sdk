/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import com.google.code.googlesearch.client.NewsSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.NewsEdition;
import com.google.code.googlesearch.client.enumeration.NewsSortOrder;
import com.google.code.googlesearch.client.enumeration.NewsTopic;
import com.google.code.googlesearch.schema.NewsResult;
import com.google.code.googlesearch.schema.adapter.json.NewsResultImpl;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * The Class NewsSearchQueryImpl.
 */
public class NewsSearchQueryImpl extends BaseGoogleSearchApiQuery<NewsResult> implements
		NewsSearchQuery {
	
	/**
	 * Instantiates a new news search query impl.
	 * 
	 * @param applicationId the application id
	 */
	public NewsSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_NEWS_URL);
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.NewsSearchQuery#withEdition(com.google.code.googlesearch.client.enumeration.NewsEdition)
	 */
	@Override
	public NewsSearchQuery withEdition(NewsEdition edition) {
		apiUrlBuilder.withParameterEnum(ParameterNames.NEWS_EDITION, edition);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.NewsSearchQuery#withLocation(java.lang.String)
	 */
	@Override
	public NewsSearchQuery withLocation(String location) {
		apiUrlBuilder.withParameter(ParameterNames.GEO, location);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.NewsSearchQuery#withOrder(com.google.code.googlesearch.client.enumeration.NewsSortOrder)
	 */
	@Override
	public NewsSearchQuery withOrder(NewsSortOrder order) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SCORING, order);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.NewsSearchQuery#withQuoteTypeId(java.lang.String)
	 */
	@Override
	public NewsSearchQuery withQuoteTypeId(String qsid) {
		apiUrlBuilder.withParameter(ParameterNames.QSID, qsid);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.NewsSearchQuery#withTopic(com.google.code.googlesearch.client.enumeration.NewsTopic)
	 */
	@Override
	public NewsSearchQuery withTopic(NewsTopic topic) {
		apiUrlBuilder.withParameterEnum(ParameterNames.TOPIC, topic);
		return this;
	}
	
	@Override
	protected NewsResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, NewsResultImpl.class);
	}
}
