/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.TranslationFormat;
import com.google.code.googlesearch.schema.TranslateLanguageResult;

/**
 * @author nmukhtar
 *
 */
public interface TranslateLanguageQuery extends GoogleSearchQuery<TranslateLanguageResult> {
	public TranslateLanguageQuery withLanguagePair(String sourceLanguage, String targetLanguage);
	public TranslateLanguageQuery withFormat(TranslationFormat format);
}
