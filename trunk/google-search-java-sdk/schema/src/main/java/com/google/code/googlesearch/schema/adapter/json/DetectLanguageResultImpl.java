/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.DetectLanguageResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * The Class DetectLanguageResultImpl.
 */
public class DetectLanguageResultImpl extends BaseJsonAdapter implements DetectLanguageResult , Adaptable<DetectLanguageResult, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	
	/** The language. */
	private String language;
	
	/** The is reliable. */
	private boolean reliable;
	
	/** The confidence. */
	private double confidence;
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.DetectLanguageResult#getLanguage()
	 */
	public String getLanguage() {
		return language;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.DetectLanguageResult#setLanguage(java.lang.String)
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.DetectLanguageResult#isReliable()
	 */
	public boolean isReliable() {
		return reliable;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.DetectLanguageResult#setReliable(boolean)
	 */
	public void setReliable(boolean reliable) {
		this.reliable = reliable;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.DetectLanguageResult#getConfidence()
	 */
	public double getConfidence() {
		return confidence;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.DetectLanguageResult#setConfidence(java.lang.String)
	 */
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}
}
