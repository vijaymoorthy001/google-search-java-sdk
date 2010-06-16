/**
 * 
 */
package com.google.code.googlesearch.client;

import java.util.Locale;

import com.google.code.googlesearch.schema.WebResult;

/**
 * @author nmukhtar
 *
 */
public interface WebSearchQuery extends GoogleSearchQuery<WebResult> {
	public WebSearchQuery withCustomeSearchEngineId(String cx);
	
	public WebSearchQuery withCustomeSearchEngineUrl(String cx);

	public WebSearchQuery withSafetyLevel(SafetyLevel safe);
	
	public WebSearchQuery withLanguage(Locale language);
	
	public WebSearchQuery withCountry(Locale country);
	
	public WebSearchQuery withDuplicateFilter(DuplicateContentFilter filter);
}
