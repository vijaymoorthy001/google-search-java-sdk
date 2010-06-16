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
 * @author nmukhtar
 *
 */
public class TranslateLanguageQueryImpl extends BaseGoogleSearchApiQuery<TranslateLanguageResult> implements
	TranslateLanguageQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public TranslateLanguageQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.LANGUAGE_TRANSLATE_URL);
	}


	
	@Override
	protected TranslateLanguageResult unmarshall(JSONObject json) {
		TranslateLanguageResultImpl result = new TranslateLanguageResultImpl();
		result.adaptFrom(json);
		return result;
	}


	@Override
	public TranslateLanguageQuery withFormat(TranslationFormat format) {
		apiUrlBuilder.withParameterEnum(ParameterNames.FORMAT, format);
		return this;
	}


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
