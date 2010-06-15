/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.PatentSearchQuery;
import com.google.code.googlesearch.common.PagedList;
import com.google.code.googlesearch.schema.PatentResult;

/**
 * @author nmukhtar
 *
 */
public class PatentSearchQueryImpl extends BaseGoogleSearchApiQuery<PatentResult> implements
		PatentSearchQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public PatentSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	protected PagedList<PatentResult> unmarshall(JSONObject json) {
		// TODO-NM: Implement this method
		return null;
	}
	

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}
}
