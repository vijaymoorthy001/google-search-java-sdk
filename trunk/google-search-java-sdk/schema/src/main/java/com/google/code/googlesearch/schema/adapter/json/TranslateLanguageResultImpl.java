/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.TranslateLanguageResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class TranslateLanguageResultImpl extends BaseJsonAdapter implements TranslateLanguageResult, Adaptable<TranslateLanguageResult, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7036808295558563537L;
	
	private String translatedText;
	private String detectedSourceLanguage;
	/**
	 * @return the translatedText
	 */
	public String getTranslatedText() {
		return translatedText;
	}
	/**
	 * @param translatedText the translatedText to set
	 */
	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}
	/**
	 * @return the detectedSourceLanguage
	 */
	public String getDetectedSourceLanguage() {
		return detectedSourceLanguage;
	}
	/**
	 * @param detectedSourceLanguage the detectedSourceLanguage to set
	 */
	public void setDetectedSourceLanguage(String detectedSourceLanguage) {
		this.detectedSourceLanguage = detectedSourceLanguage;
	}
	
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}
	
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}
}
