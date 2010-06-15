/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.ImageSearchQuery;
import com.google.code.googlesearch.common.PagedList;
import com.google.code.googlesearch.schema.ImageResult;

/**
 * @author nmukhtar
 *
 */
public class ImageSearchQueryImpl extends BaseGoogleSearchApiQuery<ImageResult> implements
		ImageSearchQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public ImageSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	protected PagedList<ImageResult> unmarshall(JSONObject json) {
		// TODO-NM: Implement this method
		return null;
	}
	

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}
}
