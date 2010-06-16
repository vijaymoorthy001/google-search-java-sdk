/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.PatentSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.PatentSearchType;
import com.google.code.googlesearch.client.enumeration.PatentSortOrder;
import com.google.code.googlesearch.schema.PatentResult;
import com.google.code.googlesearch.schema.adapter.json.PatentResultImpl;

/**
 * @author nmukhtar
 *
 */
public class PatentSearchQueryImpl extends BaseGoogleSearchApiQuery<PatentResult> implements
		PatentSearchQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public PatentSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_PATENT_URL);
	}


	@Override
	public PatentSearchQuery withOrder(PatentSortOrder order) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SCORING, order);
		return this;
	}


	@Override
	public PatentSearchQuery withSearchType(PatentSearchType type) {
		if (type.value() != null) {
			apiUrlBuilder.withParameter(type.value(), "1");
		}
		return this;
	}
	
	@Override
	protected PatentResult unmarshall(JSONObject json) {
		PatentResultImpl result = new PatentResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
