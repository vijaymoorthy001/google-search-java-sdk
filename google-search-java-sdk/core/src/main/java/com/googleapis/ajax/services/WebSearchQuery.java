/**
 * 
 */
package com.googleapis.ajax.services;

import java.util.Locale;

import com.googleapis.ajax.schema.WebResult;
import com.googleapis.ajax.services.enumeration.DuplicateContentFilter;
import com.googleapis.ajax.services.enumeration.LanguageFilter;
import com.googleapis.ajax.services.enumeration.SafetyLevel;

/**
 * The Interface WebSearchQuery.
 */
public interface WebSearchQuery extends GoogleSearchQuery<WebResult> {
	
	/**
	 * With custome search engine id.
	 * 
	 * @param cx the cx
	 * 
	 * @return the web search query
	 */
	public WebSearchQuery withCustomeSearchEngineId(String cx);
	
	/**
	 * With custome search engine url.
	 * 
	 * @param cx the cx
	 * 
	 * @return the web search query
	 */
	public WebSearchQuery withCustomeSearchEngineUrl(String cx);

	/**
	 * With safety level.
	 * 
	 * @param safe the safe
	 * 
	 * @return the web search query
	 */
	public WebSearchQuery withSafetyLevel(SafetyLevel safe);
	
	/**
	 * With language.
	 * 
	 * @param language the language
	 * 
	 * @return the web search query
	 */
	public WebSearchQuery withLanguage(LanguageFilter language);
	
	/**
	 * With country.
	 * 
	 * @param country the country
	 * 
	 * @return the web search query
	 */
	public WebSearchQuery withCountry(Locale country);
	
	/**
	 * With duplicate filter.
	 * 
	 * @param filter the filter
	 * 
	 * @return the web search query
	 */
	public WebSearchQuery withDuplicateFilter(DuplicateContentFilter filter);
}
