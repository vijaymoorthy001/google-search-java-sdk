/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.DetectLanguageQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.schema.DetectLanguageResult;
import com.google.code.googlesearch.schema.adapter.json.DetectLanguageResultImpl;

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
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected DetectLanguageResult unmarshall(JSONObject json) {
		DetectLanguageResultImpl result = new DetectLanguageResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
