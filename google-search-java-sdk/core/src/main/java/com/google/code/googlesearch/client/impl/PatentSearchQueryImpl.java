/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import com.google.code.googlesearch.client.PatentSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.PatentSearchType;
import com.google.code.googlesearch.client.enumeration.PatentSortOrder;
import com.google.code.googlesearch.schema.PatentResult;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * The Class PatentSearchQueryImpl.
 */
public class PatentSearchQueryImpl extends BaseGoogleSearchApiQuery<PatentResult> implements
		PatentSearchQuery {
	
	/**
	 * Instantiates a new patent search query impl.
	 * 
	 * @param applicationId the application id
	 */
	public PatentSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_PATENT_URL);
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.PatentSearchQuery#withOrder(com.google.code.googlesearch.client.enumeration.PatentSortOrder)
	 */
	@Override
	public PatentSearchQuery withOrder(PatentSortOrder order) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SCORING, order);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.PatentSearchQuery#withSearchType(com.google.code.googlesearch.client.enumeration.PatentSearchType)
	 */
	@Override
	public PatentSearchQuery withSearchType(PatentSearchType type) {
		if (type.value() != null) {
			apiUrlBuilder.withParameter(type.value(), "1");
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected PatentResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, PatentResult.class);
	}
}
