/**
 * 
 */
package com.google.code.googlesearch.schema;


/**
 * The Class DetectLanguageResult.
 */
public class DetectLanguageResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	
	/** The language. */
	private String language;
	
	/** The reliable. */
	private boolean reliable;
	
	/** The confidence. */
	private double confidence;
	
	/**
	 * Gets the language.
	 * 
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	
	/**
	 * Sets the language.
	 * 
	 * @param language the new language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/**
	 * Checks if is reliable.
	 * 
	 * @return true, if is reliable
	 */
	public boolean isReliable() {
		return reliable;
	}
	
	/**
	 * Sets the reliable.
	 * 
	 * @param reliable the new reliable
	 */
	public void setReliable(boolean reliable) {
		this.reliable = reliable;
	}
	
	/**
	 * Gets the confidence.
	 * 
	 * @return the confidence
	 */
	public double getConfidence() {
		return confidence;
	}
	
	/**
	 * Sets the confidence.
	 * 
	 * @param confidence the new confidence
	 */
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
}
