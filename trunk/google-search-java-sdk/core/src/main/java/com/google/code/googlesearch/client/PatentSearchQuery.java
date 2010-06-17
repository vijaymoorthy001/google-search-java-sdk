/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.PatentSearchType;
import com.google.code.googlesearch.client.enumeration.PatentSortOrder;
import com.google.code.googlesearch.schema.PatentResult;

/**
 * The Interface PatentSearchQuery.
 */
public interface PatentSearchQuery extends GoogleSearchQuery<PatentResult> {
	
	/**
	 * With search type.
	 * 
	 * @param type the type
	 * 
	 * @return the patent search query
	 */
	public PatentSearchQuery withSearchType(PatentSearchType type);
	
	/**
	 * With order.
	 * 
	 * @param order the order
	 * 
	 * @return the patent search query
	 */
	public PatentSearchQuery withOrder(PatentSortOrder order);
	
}
