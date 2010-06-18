/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import com.google.code.googlesearch.client.LocalSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.LocalSearchType;
import com.google.code.googlesearch.schema.LocalResult;
import com.google.code.googlesearch.schema.adapter.json.LocalResultImpl;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * The Class LocalSearchQueryImpl.
 */
public class LocalSearchQueryImpl extends BaseGoogleSearchApiQuery<LocalResult> implements
		LocalSearchQuery {
	
	/**
	 * Instantiates a new local search query impl.
	 * 
	 * @param applicationId the application id
	 */
	public LocalSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_LOCAL_URL);
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.LocalSearchQuery#withBoundingBox(double, double)
	 */
	@Override
	public LocalSearchQuery withBoundingBox(double x, double y) {
		apiUrlBuilder.withParameter(ParameterNames.BOUNDING_BOX, x + "," + y);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.LocalSearchQuery#withLocalSearchType(com.google.code.googlesearch.client.enumeration.LocalSearchType)
	 */
	@Override
	public LocalSearchQuery withLocalSearchType(LocalSearchType type) {
		apiUrlBuilder.withParameterEnum(ParameterNames.TYPE_OF_LISTING, type);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.LocalSearchQuery#withLocation(double, double)
	 */
	@Override
	public LocalSearchQuery withLocation(double latitude, double longitude) {
		apiUrlBuilder.withParameter(ParameterNames.SEARCH_CENTER_POINT, latitude + "," + longitude);
		return this;
	}
	
	@Override
	protected LocalResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, LocalResultImpl.class);
	}
}
