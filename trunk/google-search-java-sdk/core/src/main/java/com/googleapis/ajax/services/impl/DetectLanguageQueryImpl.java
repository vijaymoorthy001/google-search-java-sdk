/**
 * 
 */
package com.googleapis.ajax.services.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.googleapis.ajax.schema.DetectLanguageResult;
import com.googleapis.ajax.services.DetectLanguageQuery;
import com.googleapis.ajax.services.constant.GoogleSearchApiUrls;

/**
 * The Class DetectLanguageQueryImpl.
 */
public class DetectLanguageQueryImpl extends BaseGoogleSearchApiQuery<DetectLanguageResult> implements
	DetectLanguageQuery {
	
	/**
	 * Instantiates a new detect language query impl.
	 * 
	 * @param applicationId the application id
	 */
	public DetectLanguageQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.LANGUAGE_DETECT_URL);
	}

	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected DetectLanguageResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, DetectLanguageResult.class);
	}
}
