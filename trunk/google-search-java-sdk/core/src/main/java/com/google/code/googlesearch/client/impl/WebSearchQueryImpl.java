/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import java.util.Locale;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.DuplicateContentFilter;
import com.google.code.googlesearch.client.SafetyLevel;
import com.google.code.googlesearch.client.WebSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.schema.WebResult;
import com.google.code.googlesearch.schema.adapter.json.WebResultImpl;

/**
 * @author nmukhtar
 *
 */
public class WebSearchQueryImpl extends BaseGoogleSearchApiQuery<WebResult> implements
		WebSearchQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public WebSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_WEB_URL);
	}


	@Override
	public WebSearchQuery withCountry(Locale country) {
		apiUrlBuilder.withParameter(ParameterNames.COUNTRY_RESTRICTION, country.getCountry());
		return this;
	}


	@Override
	public WebSearchQuery withCustomeSearchEngineId(String cx) {
		apiUrlBuilder.withParameter(ParameterNames.CUSTOM_SEARCH_ID, cx);
		return this;
	}


	@Override
	public WebSearchQuery withCustomeSearchEngineUrl(String cx) {
		apiUrlBuilder.withParameter(ParameterNames.CUSTOM_SEARCH_URL, cx);
		return this;
	}


	@Override
	public WebSearchQuery withDuplicateFilter(DuplicateContentFilter filter) {
		apiUrlBuilder.withParameterEnum(ParameterNames.DUPLICATE_FILTER, filter);
		return this;
	}


	@Override
	public WebSearchQuery withLanguage(Locale language) {
		apiUrlBuilder.withParameter(ParameterNames.LANGUAGE_RESTRICTION, language.getLanguage());
		return this;
	}


	@Override
	public WebSearchQuery withSafetyLevel(SafetyLevel safe) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SAFETY_LEVEL, safe);
		return this;
	}
	
	@Override
	protected WebResult unmarshall(JSONObject json) {
		WebResultImpl result = new WebResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
