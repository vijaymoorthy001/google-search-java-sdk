/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.VideoSearchQuery;
import com.google.code.googlesearch.common.PagedList;
import com.google.code.googlesearch.schema.VideoResult;

/**
 * @author nmukhtar
 *
 */
public class VideoSearchQueryImpl extends BaseGoogleSearchApiQuery<VideoResult> implements
		VideoSearchQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public VideoSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	protected PagedList<VideoResult> unmarshall(JSONObject json) {
		// TODO-NM: Implement this method
		return null;
	}
	

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}
}
