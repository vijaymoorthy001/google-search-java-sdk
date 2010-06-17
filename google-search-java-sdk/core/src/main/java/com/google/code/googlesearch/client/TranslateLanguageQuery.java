/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.TranslationFormat;
import com.google.code.googlesearch.schema.TranslateLanguageResult;

/**
 * The Interface TranslateLanguageQuery.
 */
public interface TranslateLanguageQuery extends GoogleSearchQuery<TranslateLanguageResult> {
	
	/**
	 * With language pair.
	 * 
	 * @param sourceLanguage the source language
	 * @param targetLanguage the target language
	 * 
	 * @return the translate language query
	 */
	public TranslateLanguageQuery withLanguagePair(String sourceLanguage, String targetLanguage);
	
	/**
	 * With format.
	 * 
	 * @param format the format
	 * 
	 * @return the translate language query
	 */
	public TranslateLanguageQuery withFormat(TranslationFormat format);
}
