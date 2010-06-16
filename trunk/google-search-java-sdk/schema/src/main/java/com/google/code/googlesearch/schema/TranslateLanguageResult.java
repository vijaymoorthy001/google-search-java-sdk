package com.google.code.googlesearch.schema;

public interface TranslateLanguageResult {

	/**
	 * @return the translatedText
	 */
	public String getTranslatedText();

	/**
	 * @param translatedText the translatedText to set
	 */
	public void setTranslatedText(String translatedText);

	/**
	 * @return the detectedSourceLanguage
	 */
	public String getDetectedSourceLanguage();

	/**
	 * @param detectedSourceLanguage the detectedSourceLanguage to set
	 */
	public void setDetectedSourceLanguage(String detectedSourceLanguage);

}