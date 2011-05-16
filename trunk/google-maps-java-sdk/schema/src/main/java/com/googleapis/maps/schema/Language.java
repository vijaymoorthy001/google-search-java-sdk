/*
 * Copyright 2010-2011 Nabeel Mukhtar 
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
	
	/** The ARABIC. */
	ARABIC("ar"),
	
	/** The BASQUE. */
	BASQUE("eu"),
	
	/** The BULGARIAN. */
	BULGARIAN("bg"),
	
	/** The BENGALI. */
	BENGALI("bn"),
	
	/** The CATALAN. */
	CATALAN("ca"),
	
	/** The CZECH. */
	CZECH("cs"),
	
	/** The DANISH. */
	DANISH("da"),
	
	/** The GERMAN. */
	GERMAN("de"),
	
	/** The GREEK. */
	GREEK("el"),
	
	/** The ENGLISH. */
	ENGLISH("en"),
	
	/** The ENGLIS h_ australian. */
	ENGLISH_AUSTRALIAN("en-AU"),
	
	/** The ENGLIS h_ grea t_ britain. */
	ENGLISH_GREAT_BRITAIN("en-GB"),
	
	/** The SPANISH. */
	SPANISH("es"),
	
	/** The FARSI. */
	FARSI("fa"),
	
	/** The FINNISH. */
	FINNISH("fi"),
	
	/** The FILIPINO. */
	FILIPINO("fil"),
	
	/** The FRENCH. */
	FRENCH("fr"),
	
	/** The GALICIAN. */
	GALICIAN("gl"),
	
	/** The GUJARATI. */
	GUJARATI("gu"),
	
	/** The HINDI. */
	HINDI("hi"),
	
	/** The CROATIAN. */
	CROATIAN("hr"),
	
	/** The HUNGARIAN. */
	HUNGARIAN("hu"),
	
	/** The INDONESIAN. */
	INDONESIAN("id"),
	
	/** The ITALIAN. */
	ITALIAN("it"),
	
	/** The HEBREW. */
	HEBREW("iw"),
	
	/** The JAPANESE. */
	JAPANESE("ja"),
	
	/** The KANNADA. */
	KANNADA("kn"),
	
	/** The KOREAN. */
	KOREAN("ko"),
	
	/** The LITHUANIAN. */
	LITHUANIAN("lt"),
	
	/** The LATVIAN. */
	LATVIAN("lv"),
	
	/** The MALAYALAM. */
	MALAYALAM("ml"),
	
	/** The MARATHI. */
	MARATHI("mr"),
	
	/** The DUTCH. */
	DUTCH("nl"),
	
	/** The NORWEGIA n_ nynorsk. */
	NORWEGIAN_NYNORSK("nn"),
	
	/** The NORWEGIAN. */
	NORWEGIAN("no"),
	
	/** The ORIYA. */
	ORIYA("or"),
	
	/** The POLISH. */
	POLISH("pl"),
	
	/** The PORTUGUESE. */
	PORTUGUESE("pt"),
	
	/** The PORTUGUES e_ brazil. */
	PORTUGUESE_BRAZIL("pt-BR"),
	
	/** The PORTUGUES e_ portugal. */
	PORTUGUESE_PORTUGAL("pt-PT"),
	
	/** The ROMANSCH. */
	ROMANSCH("rm"),
	
	/** The ROMANIAN. */
	ROMANIAN("ro"),
	
	/** The RUSSIAN. */
	RUSSIAN("ru"),
	
	/** The SLOVAK. */
	SLOVAK("sk"),
	
	/** The SLOVENIAN. */
	SLOVENIAN("sl"),
	
	/** The SERBIAN. */
	SERBIAN("sr"),
	
	/** The SWEDISH. */
	SWEDISH("sv"),
	
	/** The TAGALOG. */
	TAGALOG("tl"),
	
	/** The TAMIL. */
	TAMIL("ta"),
	
	/** The TELUGU. */
	TELUGU("te"),
	
	/** The THAI. */
	THAI("th"),
	
	/** The TURKISH. */
	TURKISH("tr"),
	
	/** The UKRAINIAN. */
	UKRAINIAN("uk"),
	
	/** The VIETNAMESE. */
	VIETNAMESE("vi"),
	
	/** The CHINES e_ simplified. */
	CHINESE_SIMPLIFIED("zh-CN"),
	
	/** The CHINES e_ traditional. */
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
