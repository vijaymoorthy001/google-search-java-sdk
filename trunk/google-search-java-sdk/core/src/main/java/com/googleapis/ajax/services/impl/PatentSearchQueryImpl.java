/**
 * 
 */
package com.googleapis.ajax.services.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.googleapis.ajax.schema.PatentResult;
import com.googleapis.ajax.services.PatentSearchQuery;
import com.googleapis.ajax.services.constant.GoogleSearchApiUrls;
import com.googleapis.ajax.services.constant.ParameterNames;
import com.googleapis.ajax.services.enumeration.PatentSearchType;
import com.googleapis.ajax.services.enumeration.PatentSortOrder;

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
