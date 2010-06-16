/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.NewsEdition;
import com.google.code.googlesearch.client.enumeration.NewsSortOrder;
import com.google.code.googlesearch.client.enumeration.NewsTopic;
import com.google.code.googlesearch.schema.NewsResult;

/**
 * @author nmukhtar
 *
 */
public interface NewsSearchQuery extends GoogleSearchQuery<NewsResult> {
	public NewsSearchQuery withOrder(NewsSortOrder order);
	public NewsSearchQuery withLocation(String location);
	public NewsSearchQuery withQuoteTypeId(String qsid);
	public NewsSearchQuery withTopic(NewsTopic topic);
	public NewsSearchQuery withEdition(NewsEdition edition);
}
