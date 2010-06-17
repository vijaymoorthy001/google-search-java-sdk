/**
 * 
 */
package com.google.code.googlesearch.client;

import java.util.Locale;

import com.google.code.googlesearch.client.enumeration.DuplicateContentFilter;
import com.google.code.googlesearch.client.enumeration.SafetyLevel;
import com.google.code.googlesearch.schema.WebResult;

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
	public WebSearchQuery withLanguage(Locale language);
	
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
