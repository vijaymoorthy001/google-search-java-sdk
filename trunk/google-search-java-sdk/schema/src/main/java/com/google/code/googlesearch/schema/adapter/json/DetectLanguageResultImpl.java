/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.DetectLanguageResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class DetectLanguageResultImpl extends BaseJsonAdapter implements DetectLanguageResult , Adaptable<DetectLanguageResult, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7595223844163364948L;
	
	private String language;
	private boolean isReliable;
	private String confidence;
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the isReliable
	 */
	public boolean isReliable() {
		return isReliable;
	}
	/**
	 * @param isReliable the isReliable to set
	 */
	public void setReliable(boolean isReliable) {
		this.isReliable = isReliable;
	}
	/**
	 * @return the confidence
	 */
	public String getConfidence() {
		return confidence;
	}
	/**
	 * @param confidence the confidence to set
	 */
	public void setConfidence(String confidence) {
		this.confidence = confidence;
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
