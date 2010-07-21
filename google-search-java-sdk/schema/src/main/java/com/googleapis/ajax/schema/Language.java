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
	
	AFRIKAANS("af"),
	ALBANIAN("sq"),
	AMHARIC("am"),
	ARABIC("ar"),
	ARMENIAN("hy"),
	AZERBAIJANI("az"),
	BASQUE("eu"),
	BELARUSIAN("be"),
	BENGALI("bn"),
	BIHARI("bh"),
	BRETON("br"),
	BULGARIAN("bg"),
	BURMESE("my"),
	CATALAN("ca"),
	CHEROKEE("chr"),
	CHINESE("zh"),
	CHINESE_SIMPLIFIED("zh-CN"),
	CHINESE_TRADITIONAL("zh-TW"),
	CORSICAN("co"),
	CROATIAN("hr"),
	CZECH("cs"),
	DANISH("da"),
	DHIVEHI("dv"),
	DUTCH("nl"),  
	ENGLISH("en"),
	ESPERANTO("eo"),
	ESTONIAN("et"),
	FAROESE("fo"),
	FILIPINO("tl"),
	FINNISH("fi"),
	FRENCH("fr"),
	FRISIAN("fy"),
	GALICIAN("gl"),
	GEORGIAN("ka"),
	GERMAN("de"),
	GREEK("el"),
	GUJARATI("gu"),
	HAITIAN_CREOLE("ht"),
	HEBREW("iw"),
	HINDI("hi"),
	HUNGARIAN("hu"),
	ICELANDIC("is"),
	INDONESIAN("id"),
	INUKTITUT("iu"),
	IRISH("ga"),
	ITALIAN("it"),
	JAPANESE("ja"),
	JAVANESE("jw"),
	KANNADA("kn"),
	KAZAKH("kk"),
	KHMER("km"),
	KOREAN("ko"),
	KURDISH("ku"),
	KYRGYZ("ky"),
	LAO("lo"),
	LATIN("la"),
	LATVIAN("lv"),
	LITHUANIAN("lt"),
	LUXEMBOURGISH("lb"),
	MACEDONIAN("mk"),
	MALAY("ms"),
	MALAYALAM("ml"),
	MALTESE("mt"),
	MAORI("mi"),
	MARATHI("mr"),
	MONGOLIAN("mn"),
	NEPALI("ne"),
	NORWEGIAN("no"),
	OCCITAN("oc"),
	ORIYA("or"),
	PASHTO("ps"),
	PERSIAN("fa"),
	POLISH("pl"),
	PORTUGUESE("pt"),
	PORTUGUESE_PORTUGAL("pt-PT"),
	PUNJABI("pa"),
	QUECHUA("qu"),
	ROMANIAN("ro"),
	RUSSIAN("ru"),
	SANSKRIT("sa"),
	SCOTS_GAELIC("gd"),
	SERBIAN("sr"),
	SINDHI("sd"),
	SINHALESE("si"),
	SLOVAK("sk"),
	SLOVENIAN("sl"),
	SPANISH("es"),
	SUNDANESE("su"),
	SWAHILI("sw"),
	SWEDISH("sv"),
	SYRIAC("syr"),
	TAJIK("tg"),
	TAMIL("ta"),
	TATAR("tt"),
	TELUGU("te"),
	THAI("th"),
	TIBETAN("bo"),
	TONGA("to"),
	TURKISH("tr"),
	UKRAINIAN("uk"),
	URDU("ur"),
	UZBEK("uz"),
	UIGHUR("ug"),
	VIETNAMESE("vi"),
	WELSH("cy"),
	YIDDISH("yi"),
	YORUBA("yo"),
	UNKNOWN("");
	
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
     * Instantiates a new image size.
     * 
     * @param value the value
     */
    Language(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
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
