/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.NewsSearchQuery;
import com.google.code.googlesearch.common.PagedList;
import com.google.code.googlesearch.schema.NewsResult;

/**
 * @author nmukhtar
 *
 */
public class NewsSearchQueryImpl extends BaseGoogleSearchApiQuery<NewsResult> implements
		NewsSearchQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public NewsSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	protected PagedList<NewsResult> unmarshall(JSONObject json) {
		// TODO-NM: Implement this method
		return null;
	}
	

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}
}
