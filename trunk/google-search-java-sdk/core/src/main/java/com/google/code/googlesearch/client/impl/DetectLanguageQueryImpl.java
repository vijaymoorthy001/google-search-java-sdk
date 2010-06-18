/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import com.google.code.googlesearch.client.DetectLanguageQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.schema.DetectLanguageResult;
import com.google.code.googlesearch.schema.adapter.json.DetectLanguageResultImpl;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

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

	@Override
	protected DetectLanguageResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, DetectLanguageResultImpl.class);
	}
}
