/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.NewsSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.NewsEdition;
import com.google.code.googlesearch.client.enumeration.NewsSortOrder;
import com.google.code.googlesearch.client.enumeration.NewsTopic;
import com.google.code.googlesearch.schema.NewsResult;
import com.google.code.googlesearch.schema.adapter.json.NewsResultImpl;

/**
 * @author nmukhtar
 *
 */
public class NewsSearchQueryImpl extends BaseGoogleSearchApiQuery<NewsResult> implements
		NewsSearchQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public NewsSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_NEWS_URL);
	}


	@Override
	public NewsSearchQuery withEdition(NewsEdition edition) {
		apiUrlBuilder.withParameterEnum(ParameterNames.NEWS_EDITION, edition);
		return this;
	}


	@Override
	public NewsSearchQuery withLocation(String location) {
		apiUrlBuilder.withParameter(ParameterNames.GEO, location);
		return this;
	}


	@Override
	public NewsSearchQuery withOrder(NewsSortOrder order) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SCORING, order);
		return this;
	}


	@Override
	public NewsSearchQuery withQuoteTypeId(String qsid) {
		apiUrlBuilder.withParameter(ParameterNames.QSID, qsid);
		return this;
	}


	@Override
	public NewsSearchQuery withTopic(NewsTopic topic) {
		apiUrlBuilder.withParameterEnum(ParameterNames.TOPIC, topic);
		return this;
	}
	
	@Override
	protected NewsResult unmarshall(JSONObject json) {
		NewsResultImpl result = new NewsResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
