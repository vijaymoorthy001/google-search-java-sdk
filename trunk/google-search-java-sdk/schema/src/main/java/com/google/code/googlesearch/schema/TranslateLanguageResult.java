package com.google.code.googlesearch.schema;

/**
 * The Interface TranslateLanguageResult.
 */
public interface TranslateLanguageResult {

	/**
	 * Gets the translated text.
	 * 
	 * @return the translated text
	 */
	public String getTranslatedText();

	/**
	 * Sets the translated text.
	 * 
	 * @param translatedText the new translated text
	 */
	public void setTranslatedText(String translatedText);

	/**
	 * Gets the detected source language.
	 * 
	 * @return the detected source language
	 */
	public String getDetectedSourceLanguage();

	/**
	 * Sets the detected source language.
	 * 
	 * @param detectedSourceLanguage the new detected source language
	 */
	public void setDetectedSourceLanguage(String detectedSourceLanguage);

}