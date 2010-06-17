package com.google.code.googlesearch.schema;

/**
 * The Interface DetectLanguageResult.
 */
public interface DetectLanguageResult {

	/**
	 * Gets the language.
	 * 
	 * @return the language
	 */
	public String getLanguage();

	/**
	 * Sets the language.
	 * 
	 * @param language the new language
	 */
	public void setLanguage(String language);

	/**
	 * Checks if is reliable.
	 * 
	 * @return true, if is reliable
	 */
	public boolean isReliable();

	/**
	 * Sets the reliable.
	 * 
	 * @param isReliable the new reliable
	 */
	public void setReliable(boolean isReliable);

	/**
	 * Gets the confidence.
	 * 
	 * @return the confidence
	 */
	public String getConfidence();

	/**
	 * Sets the confidence.
	 * 
	 * @param confidence the new confidence
	 */
	public void setConfidence(String confidence);

}