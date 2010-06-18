/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import com.google.code.googlesearch.schema.TranslateLanguageResult;

/**
 * The Class TranslateLanguageResultImpl.
 */
public class TranslateLanguageResultImpl extends BaseJsonAdapter implements TranslateLanguageResult {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7036808295558563537L;
	
	/** The translated text. */
	private String translatedText;
	
	/** The detected source language. */
	private String detectedSourceLanguage;
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.TranslateLanguageResult#getTranslatedText()
	 */
	public String getTranslatedText() {
		return translatedText;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.TranslateLanguageResult#setTranslatedText(java.lang.String)
	 */
	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.TranslateLanguageResult#getDetectedSourceLanguage()
	 */
	public String getDetectedSourceLanguage() {
		return detectedSourceLanguage;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.TranslateLanguageResult#setDetectedSourceLanguage(java.lang.String)
	 */
	public void setDetectedSourceLanguage(String detectedSourceLanguage) {
		this.detectedSourceLanguage = detectedSourceLanguage;
	}
}
