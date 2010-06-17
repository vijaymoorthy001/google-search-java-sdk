/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.NewsEdition;
import com.google.code.googlesearch.client.enumeration.NewsSortOrder;
import com.google.code.googlesearch.client.enumeration.NewsTopic;
import com.google.code.googlesearch.schema.NewsResult;

/**
 * The Interface NewsSearchQuery.
 */
public interface NewsSearchQuery extends GoogleSearchQuery<NewsResult> {
	
	/**
	 * With order.
	 * 
	 * @param order the order
	 * 
	 * @return the news search query
	 */
	public NewsSearchQuery withOrder(NewsSortOrder order);
	
	/**
	 * With location.
	 * 
	 * @param location the location
	 * 
	 * @return the news search query
	 */
	public NewsSearchQuery withLocation(String location);
	
	/**
	 * With quote type id.
	 * 
	 * @param qsid the qsid
	 * 
	 * @return the news search query
	 */
	public NewsSearchQuery withQuoteTypeId(String qsid);
	
	/**
	 * With topic.
	 * 
	 * @param topic the topic
	 * 
	 * @return the news search query
	 */
	public NewsSearchQuery withTopic(NewsTopic topic);
	
	/**
	 * With edition.
	 * 
	 * @param edition the edition
	 * 
	 * @return the news search query
	 */
	public NewsSearchQuery withEdition(NewsEdition edition);
}
