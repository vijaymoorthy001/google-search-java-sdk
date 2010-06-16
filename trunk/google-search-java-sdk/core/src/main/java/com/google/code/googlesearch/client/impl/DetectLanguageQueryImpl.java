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
 * @author nmukhtar
 *
 */
public class DetectLanguageQueryImpl extends BaseGoogleSearchApiQuery<DetectLanguageResult> implements
	DetectLanguageQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public DetectLanguageQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.LANGUAGE_DETECT_URL);
	}


	
	@Override
	protected DetectLanguageResult unmarshall(JSONObject json) {
		DetectLanguageResultImpl result = new DetectLanguageResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
