/**
 * 
 */
package com.googleapis.ajax.services;

import com.googleapis.ajax.schema.Language;
import com.googleapis.ajax.schema.TranslateLanguageResult;
import com.googleapis.ajax.services.enumeration.TranslationFormat;

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
	public TranslateLanguageQuery withLanguagePair(Language sourceLanguage, Language targetLanguage);
	
	/**
	 * With format.
	 * 
	 * @param format the format
	 * 
	 * @return the translate language query
	 */
	public TranslateLanguageQuery withFormat(TranslationFormat format);
}
