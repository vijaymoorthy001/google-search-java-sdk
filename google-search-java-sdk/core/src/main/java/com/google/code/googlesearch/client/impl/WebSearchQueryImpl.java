/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.WebSearchQuery;
import com.google.code.googlesearch.common.PagedList;
import com.google.code.googlesearch.schema.WebResult;

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
	protected PagedList<WebResult> unmarshall(JSONObject json) {
		// TODO-NM: Implement this method
		return null;
	}
	

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}
}
