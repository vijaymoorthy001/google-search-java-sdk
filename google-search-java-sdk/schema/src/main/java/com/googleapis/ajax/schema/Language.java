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
	AMHARIC("am", true),
	ARABIC("ar", true),
	ARMENIAN("hy", true),
	AZERBAIJANI("az", true),
	BASQUE("eu", true),
	BELARUSIAN("be", true),
	BENGALI("bn", true),
	BIHARI("bh", true),
	BRETON("br", true),
	BULGARIAN("bg", true),
	BURMESE("my", true),
	CATALAN("ca", true),
	CHEROKEE("chr", true),
	CHINESE("zh", true),
	CHINESE_SIMPLIFIED("zh-CN", true),
	CHINESE_TRADITIONAL("zh-TW", true),
	CORSICAN("co", true),
	CROATIAN("hr", true),
	CZECH("cs", true),
	DANISH("da", true),
	DHIVEHI("dv", true),
	DUTCH("nl", true),  
	ENGLISH("en", true),
	ESPERANTO("eo", true),
	ESTONIAN("et", true),
	FAROESE("fo", true),
	FILIPINO("tl", true),
	FINNISH("fi", true),
	FRENCH("fr", true),
	FRISIAN("fy", true),
	GALICIAN("gl", true),
	GEORGIAN("ka", true),
	GERMAN("de", true),
	GREEK("el", true),
	GUJARATI("gu", true),
	HAITIAN_CREOLE("ht", true),
	HEBREW("iw", true),
	HINDI("hi", true),
	HUNGARIAN("hu", true),
	ICELANDIC("is", true),
	INDONESIAN("id", true),
	INUKTITUT("iu", true),
	IRISH("ga", true),
	ITALIAN("it", true),
	JAPANESE("ja", true),
	JAVANESE("jw", true),
	KANNADA("kn", true),
	KAZAKH("kk", true),
	KHMER("km", true),
	KOREAN("ko", true),
	KURDISH("ku", true),
	KYRGYZ("ky", true),
	LAO("lo", true),
	LATIN("la", true),
	LATVIAN("lv", true),
	LITHUANIAN("lt", true),
	LUXEMBOURGISH("lb", true),
	MACEDONIAN("mk", true),
	MALAY("ms", true),
	MALAYALAM("ml", true),
	MALTESE("mt", true),
	MAORI("mi", true),
	MARATHI("mr", true),
	MONGOLIAN("mn", true),
	NEPALI("ne", true),
	NORWEGIAN("no", true),
	OCCITAN("oc", true),
	ORIYA("or", true),
	PASHTO("ps", true),
	PERSIAN("fa", true),
	POLISH("pl", true),
	PORTUGUESE("pt", true),
	PORTUGUESE_PORTUGAL("pt-PT", true),
	PUNJABI("pa", true),
	QUECHUA("qu", true),
	ROMANIAN("ro", true),
	RUSSIAN("ru", true),
	SANSKRIT("sa", true),
	SCOTS_GAELIC("gd", true),
	SERBIAN("sr", true),
	SINDHI("sd", true),
	SINHALESE("si", true),
	SLOVAK("sk", true),
	SLOVENIAN("sl", true),
	SPANISH("es", true),
	SUNDANESE("su", true),
	SWAHILI("sw", true),
	SWEDISH("sv", true),
	SYRIAC("syr", true),
	TAJIK("tg", true),
	TAMIL("ta", true),
	TATAR("tt", true),
	TELUGU("te", true),
	THAI("th", true),
	TIBETAN("bo", true),
	TONGA("to", true),
	TURKISH("tr", true),
	UKRAINIAN("uk", true),
	URDU("ur", true),
	UZBEK("uz", true),
	UIGHUR("ug", true),
	VIETNAMESE("vi", true),
	WELSH("cy", true),
	YIDDISH("yi", true),
	YORUBA("yo", true),
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
