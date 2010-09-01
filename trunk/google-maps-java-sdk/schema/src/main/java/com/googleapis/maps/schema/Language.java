/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.googleapis.maps.schema;

import java.util.HashMap;
import java.util.Map;


/**
 * The Enum Language.
 */
public enum Language implements ValueEnum  {
	ARABIC("ar"),
	BASQUE("eu"),
	BULGARIAN("bg"),
	BENGALI("bn"),
	CATALAN("ca"),
	CZECH("cs"),
	DANISH("da"),
	GERMAN("de"),
	GREEK("el"),
	ENGLISH("en"),
	ENGLISH_AUSTRALIAN("en-AU"),
	ENGLISH_GREAT_BRITAIN("en-GB"),
	SPANISH("es"),
	FARSI("fa"),
	FINNISH("fi"),
	FILIPINO("fil"),
	FRENCH("fr"),
	GALICIAN("gl"),
	GUJARATI("gu"),
	HINDI("hi"),
	CROATIAN("hr"),
	HUNGARIAN("hu"),
	INDONESIAN("id"),
	ITALIAN("it"),
	HEBREW("iw"),
	JAPANESE("ja"),
	KANNADA("kn"),
	KOREAN("ko"),
	LITHUANIAN("lt"),
	LATVIAN("lv"),
	MALAYALAM("ml"),
	MARATHI("mr"),
	DUTCH("nl"),
	NORWEGIAN_NYNORSK("nn"),
	NORWEGIAN("no"),
	ORIYA("or"),
	POLISH("pl"),
	PORTUGUESE("pt"),
	PORTUGUESE_BRAZIL("pt-BR"),
	PORTUGUESE_PORTUGAL("pt-PT"),
	ROMANSCH("rm"),
	ROMANIAN("ro"),
	RUSSIAN("ru"),
	SLOVAK("sk"),
	SLOVENIAN("sl"),
	SERBIAN("sr"),
	SWEDISH("sv"),
	TAGALOG("tl"),
	TAMIL("ta"),
	TELUGU("te"),
	THAI("th"),
	TURKISH("tr"),
	UKRAINIAN("uk"),
	VIETNAMESE("vi"),
	CHINESE_SIMPLIFIED("zh-CN"),
	CHINESE_TRADITIONAL("zh-TW");
	
    /** The Constant stringToEnum. */
	private static final Map<String, Language> stringToEnum = new HashMap<String, Language>();

	static { // Initialize map from constant name to enum constant
		for (Language op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new language.
     * 
     * @param value the value
     */
    Language(String value) {
        this.value = value;
    }

	/* (non-Javadoc)
	 * @see com.googleapis.maps.schema.ValueEnum#value()
	 */
	@Override
	public String value() {
		return value;
	}
	
	/**
	 * From value.
	 * 
	 * @param value the value
	 * 
	 * @return the language
	 */
	public static Language fromValue(String value) {
		return stringToEnum.get(value);
	}

}
