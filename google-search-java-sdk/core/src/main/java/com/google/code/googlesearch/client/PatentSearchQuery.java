/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.PatentSearchType;
import com.google.code.googlesearch.client.enumeration.PatentSortOrder;
import com.google.code.googlesearch.schema.PatentResult;

/**
 * @author nmukhtar
 *
 */
public interface PatentSearchQuery extends GoogleSearchQuery<PatentResult> {
	public PatentSearchQuery withSearchType(PatentSearchType type);
	public PatentSearchQuery withOrder(PatentSortOrder order);
	
}
