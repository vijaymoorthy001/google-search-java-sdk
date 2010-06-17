/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import java.util.Locale;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.WebSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.DuplicateContentFilter;
import com.google.code.googlesearch.client.enumeration.SafetyLevel;
import com.google.code.googlesearch.schema.WebResult;
import com.google.code.googlesearch.schema.adapter.json.WebResultImpl;

/**
 * The Class WebSearchQueryImpl.
 */
public class WebSearchQueryImpl extends BaseGoogleSearchApiQuery<WebResult> implements
		WebSearchQuery {
	
	/**
	 * Instantiates a new web search query impl.
	 * 
	 * @param applicationId the application id
	 */
	public WebSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_WEB_URL);
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.WebSearchQuery#withCountry(java.util.Locale)
	 */
	@Override
	public WebSearchQuery withCountry(Locale country) {
		apiUrlBuilder.withParameter(ParameterNames.COUNTRY_RESTRICTION, country.getCountry());
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.WebSearchQuery#withCustomeSearchEngineId(java.lang.String)
	 */
	@Override
	public WebSearchQuery withCustomeSearchEngineId(String cx) {
		apiUrlBuilder.withParameter(ParameterNames.CUSTOM_SEARCH_ID, cx);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.WebSearchQuery#withCustomeSearchEngineUrl(java.lang.String)
	 */
	@Override
	public WebSearchQuery withCustomeSearchEngineUrl(String cx) {
		apiUrlBuilder.withParameter(ParameterNames.CUSTOM_SEARCH_URL, cx);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.WebSearchQuery#withDuplicateFilter(com.google.code.googlesearch.client.enumeration.DuplicateContentFilter)
	 */
	@Override
	public WebSearchQuery withDuplicateFilter(DuplicateContentFilter filter) {
		apiUrlBuilder.withParameterEnum(ParameterNames.DUPLICATE_FILTER, filter);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.WebSearchQuery#withLanguage(java.util.Locale)
	 */
	@Override
	public WebSearchQuery withLanguage(Locale language) {
		apiUrlBuilder.withParameter(ParameterNames.LANGUAGE_RESTRICTION, language.getLanguage());
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.WebSearchQuery#withSafetyLevel(com.google.code.googlesearch.client.enumeration.SafetyLevel)
	 */
	@Override
	public WebSearchQuery withSafetyLevel(SafetyLevel safe) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SAFETY_LEVEL, safe);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected WebResult unmarshall(JSONObject json) {
		WebResultImpl result = new WebResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
