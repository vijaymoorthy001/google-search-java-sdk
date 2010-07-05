/**
 * 
 */
package com.googleapis.ajax.services.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.googleapis.ajax.schema.TranslateLanguageResult;
import com.googleapis.ajax.services.TranslateLanguageQuery;
import com.googleapis.ajax.services.constant.GoogleSearchApiUrls;
import com.googleapis.ajax.services.constant.ParameterNames;
import com.googleapis.ajax.services.enumeration.TranslationFormat;

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


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected TranslateLanguageResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, TranslateLanguageResult.class);
	}
}
