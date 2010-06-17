/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.TranslateLanguageQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.TranslationFormat;
import com.google.code.googlesearch.schema.TranslateLanguageResult;
import com.google.code.googlesearch.schema.adapter.json.TranslateLanguageResultImpl;

/**
 * The Class TranslateLanguageQueryImpl.
 */
public class TranslateLanguageQueryImpl extends BaseGoogleSearchApiQuery<TranslateLanguageResult> implements
	TranslateLanguageQuery {
	
	/**
	 * Instantiates a new translate language query impl.
	 * 
	 * @param applicationId the application id
	 */
	public TranslateLanguageQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.LANGUAGE_TRANSLATE_URL);
	}


	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected TranslateLanguageResult unmarshall(JSONObject json) {
		TranslateLanguageResultImpl result = new TranslateLanguageResultImpl();
		result.adaptFrom(json);
		return result;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.TranslateLanguageQuery#withFormat(com.google.code.googlesearch.client.enumeration.TranslationFormat)
	 */
	@Override
	public TranslateLanguageQuery withFormat(TranslationFormat format) {
		apiUrlBuilder.withParameterEnum(ParameterNames.FORMAT, format);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.TranslateLanguageQuery#withLanguagePair(java.lang.String, java.lang.String)
	 */
	@Override
	public TranslateLanguageQuery withLanguagePair(String sourceLanguage,
			String targetLanguage) {
		String languagePair = "|" + targetLanguage;
		if (sourceLanguage != null) {
			languagePair = sourceLanguage + languagePair;
		}
		apiUrlBuilder.withParameter(ParameterNames.LANGUAGE_PAIR, languagePair);
		return this;
	}
}
