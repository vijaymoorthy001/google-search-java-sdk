/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import com.google.code.googlesearch.client.VideoSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.VideoSortOrder;
import com.google.code.googlesearch.schema.VideoResult;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

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
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected VideoResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, VideoResult.class);
	}
}
