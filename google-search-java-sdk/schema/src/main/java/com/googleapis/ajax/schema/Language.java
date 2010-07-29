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
package com.googleapis.ajax.schema;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum ImageSize.
 */
public enum Language implements ValueEnum  {
	
	AFRIKAANS("af", true),
	ALBANIAN("sq", true),
	AMHARIC("am", false),
	ARABIC("ar", true),
	ARMENIAN("hy", false),
	AZERBAIJANI("az", false),
	BASQUE("eu", false),
	BELARUSIAN("be", true),
	BENGALI("bn", false),
	BIHARI("bh", false),
	BRETON("br", false),
	BULGARIAN("bg", true),
	BURMESE("my", false),
	CATALAN("ca", true),
	CHEROKEE("chr", false),
	CHINESE("zh", true),
	CHINESE_SIMPLIFIED("zh-CN", true),
	CHINESE_TRADITIONAL("zh-TW", true),
	CORSICAN("co", false),
	CROATIAN("hr", true),
	CZECH("cs", true),
	DANISH("da", true),
	DHIVEHI("dv", false),
	DUTCH("nl", true),  
	ENGLISH("en", true),
	ESPERANTO("eo", false),
	ESTONIAN("et", true),
	FAROESE("fo", false),
	FILIPINO("tl", true),
	FINNISH("fi", true),
	FRENCH("fr", true),
	FRISIAN("fy", false),
	GALICIAN("gl", true),
	GEORGIAN("ka", false),
	GERMAN("de", true),
	GREEK("el", true),
	GUJARATI("gu", false),
	HAITIAN_CREOLE("ht", true),
	HEBREW("iw", true),
	HINDI("hi", true),
	HUNGARIAN("hu", true),
	ICELANDIC("is", true),
	INDONESIAN("id", true),
	INUKTITUT("iu", false),
	IRISH("ga", true),
	ITALIAN("it", true),
	JAPANESE("ja", true),
	JAVANESE("jw", false),
	KANNADA("kn", false),
	KAZAKH("kk", false),
	KHMER("km", false),
	KOREAN("ko", true),
	KURDISH("ku", false),
	KYRGYZ("ky", false),
	LAO("lo", false),
	LATIN("la", false),
	LATVIAN("lv", true),
	LITHUANIAN("lt", true),
	LUXEMBOURGISH("lb", false),
	MACEDONIAN("mk", true),
	MALAY("ms", true),
	MALAYALAM("ml", false),
	MALTESE("mt", true),
	MAORI("mi", false),
	MARATHI("mr", false),
	MONGOLIAN("mn", false),
	NEPALI("ne", false),
	NORWEGIAN("no", true),
	OCCITAN("oc", false),
	ORIYA("or", false),
	PASHTO("ps", false),
	PERSIAN("fa", true),
	POLISH("pl", true),
	PORTUGUESE("pt", true),
	PORTUGUESE_PORTUGAL("pt-PT", true),
	PUNJABI("pa", false),
	QUECHUA("qu", false),
	ROMANIAN("ro", true),
	RUSSIAN("ru", true),
	SANSKRIT("sa", false),
	SCOTS_GAELIC("gd", false),
	SERBIAN("sr", true),
	SINDHI("sd", false),
	SINHALESE("si", false),
	SLOVAK("sk", true),
	SLOVENIAN("sl", true),
	SPANISH("es", true),
	SUNDANESE("su", false),
	SWAHILI("sw", true),
	SWEDISH("sv", true),
	SYRIAC("syr", false),
	TAJIK("tg", false),
	TAMIL("ta", false),
	TATAR("tt", false),
	TELUGU("te", false),
	THAI("th", true),
	TIBETAN("bo", false),
	TONGA("to", false),
	TURKISH("tr", true),
	UKRAINIAN("uk", true),
	URDU("ur", false),
	UZBEK("uz", false),
	UIGHUR("ug", false),
	VIETNAMESE("vi", true),
	WELSH("cy", true),
	YIDDISH("yi", true),
	YORUBA("yo", false),
	UNKNOWN("", false);
	
    /** The Constant stringToEnum. */
	private static final Map<String, Language> stringToEnum = new HashMap<String, Language>();

	static { // Initialize map from constant name to enum constant
		for (Language op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /** The value. */
    private final boolean supportsTranslation;
    
    /**
     * Instantiates a new image size.
     * 
     * @param value the value
     */
    Language(String value, boolean supportsTranslation) {
        this.value = value;
        this.supportsTranslation = supportsTranslation;
    }

	@Override
	public String value() {
		return value;
	}
	
	public boolean supportsTranslation() {
		return supportsTranslation;
	}
	
	/**
	 * From value.
	 * 
	 * @param value the value
	 * 
	 * @return the image size
	 */
	public static Language fromValue(String value) {
		return stringToEnum.get(value);
	}
}
