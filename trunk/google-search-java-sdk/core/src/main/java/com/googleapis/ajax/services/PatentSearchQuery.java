/**
 * 
 */
package com.googleapis.ajax.services;

import com.googleapis.ajax.schema.PatentResult;
import com.googleapis.ajax.services.enumeration.PatentSearchType;
import com.googleapis.ajax.services.enumeration.PatentSortOrder;

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
