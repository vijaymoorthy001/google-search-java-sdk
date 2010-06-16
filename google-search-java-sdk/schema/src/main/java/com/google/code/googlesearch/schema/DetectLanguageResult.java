package com.google.code.googlesearch.schema;

public interface DetectLanguageResult {

	/**
	 * @return the language
	 */
	public String getLanguage();

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language);

	/**
	 * @return the isReliable
	 */
	public boolean isReliable();

	/**
	 * @param isReliable the isReliable to set
	 */
	public void setReliable(boolean isReliable);

	/**
	 * @return the confidence
	 */
	public String getConfidence();

	/**
	 * @param confidence the confidence to set
	 */
	public void setConfidence(String confidence);

}