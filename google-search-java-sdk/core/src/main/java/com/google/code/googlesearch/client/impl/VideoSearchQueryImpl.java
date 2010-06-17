/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.VideoSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.VideoSortOrder;
import com.google.code.googlesearch.schema.VideoResult;
import com.google.code.googlesearch.schema.adapter.json.VideoResultImpl;

/**
 * The Class VideoSearchQueryImpl.
 */
public class VideoSearchQueryImpl extends BaseGoogleSearchApiQuery<VideoResult> implements
		VideoSearchQuery {
	
	/**
	 * Instantiates a new video search query impl.
	 * 
	 * @param applicationId the application id
	 */
	public VideoSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_VIDEO_URL);
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.VideoSearchQuery#withOrder(com.google.code.googlesearch.client.enumeration.VideoSortOrder)
	 */
	@Override
	public VideoSearchQuery withOrder(VideoSortOrder order) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SCORING, order);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected VideoResult unmarshall(JSONObject json) {
		VideoResultImpl result = new VideoResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
