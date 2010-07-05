/**
 * 
 */
package com.googleapis.ajax.services.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.googleapis.ajax.schema.NewsResult;
import com.googleapis.ajax.services.NewsSearchQuery;
import com.googleapis.ajax.services.constant.GoogleSearchApiUrls;
import com.googleapis.ajax.services.constant.ParameterNames;
import com.googleapis.ajax.services.enumeration.NewsEdition;
import com.googleapis.ajax.services.enumeration.NewsSortOrder;
import com.googleapis.ajax.services.enumeration.NewsTopic;

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
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected NewsResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, NewsResult.class);
	}
}
