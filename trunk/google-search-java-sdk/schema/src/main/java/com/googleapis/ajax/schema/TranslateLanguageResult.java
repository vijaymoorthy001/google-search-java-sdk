/**
 * 
 */
package com.googleapis.ajax.schema;

import com.googleapis.ajax.services.enumeration.Language;


/**
 * The Class TranslateLanguageResult.
 */
public class TranslateLanguageResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7036808295558563537L;
	
	/** The translated text. */
	private String translatedText;
	
	/** The detected source language. */
	private Language detectedSourceLanguage;
	
	/**
	 * Gets the translated text.
	 * 
	 * @return the translated text
	 */
	public String getTranslatedText() {
		return translatedText;
	}
	
	/**
	 * Sets the translated text.
	 * 
	 * @param translatedText the new translated text
	 */
	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}
	
	/**
	 * Gets the detected source language.
	 * 
	 * @return the detected source language
	 */
	public Language getDetectedSourceLanguage() {
		return detectedSourceLanguage;
	}
	
	/**
	 * Sets the detected source language.
	 * 
	 * @param detectedSourceLanguage the new detected source language
	 */
	public void setDetectedSourceLanguage(Language detectedSourceLanguage) {
		this.detectedSourceLanguage = detectedSourceLanguage;
	}
}
