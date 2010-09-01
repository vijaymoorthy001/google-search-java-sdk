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
 * The Enum CCTLD.
 */
public enum CCTLD implements ValueEnum  {
	
	/** The Arabic. */
	Arabic ("lang_ar"),
	
	/** The Bulgarian. */
	Bulgarian ("lang_bg"),
	
	/** The Catalan. */
	Catalan ("lang_ca"),
	
	/** The Chinese_ simplified. */
	Chinese_Simplified ("lang_zh-CN"),
	
	/** The Chinese_ traditional. */
	Chinese_Traditional ("lang_zh-TW"),
	
	/** The Croation. */
	Croation ("lang_hr"),
	
	/** The Czech. */
	Czech ("lang_cs"),
	
	/** The Danish. */
	Danish ("lang_da"),
	
	/** The Dutch. */
	Dutch ("lang_nl"),
	
	/** The English. */
	English ("lang_en"),
	
	/** The Estonian. */
	Estonian ("lang_et"),
	
	/** The Finnish. */
	Finnish ("lang_fi"),
	
	/** The French. */
	French ("lang_fr"),
	
	/** The German. */
	German ("lang_de"),
	
	/** The Greek. */
	Greek ("lang_el"),
	
	/** The Hebrew. */
	Hebrew ("lang_iw"),
	
	/** The Hungarian. */
	Hungarian ("lang_hu"),
	
	/** The Icelandic. */
	Icelandic ("lang_is"),
	
	/** The Indonesian. */
	Indonesian ("lang_id"),
	
	/** The Italian. */
	Italian ("lang_it"),
	
	/** The Japanese. */
	Japanese ("lang_ja"),
	
	/** The Korean. */
	Korean ("lang_ko"),
	
	/** The Latvian. */
	Latvian ("lang_lv"),
	
	/** The Lithuanian. */
	Lithuanian ("lang_lt"),
	
	/** The Norwegian. */
	Norwegian ("lang_no"),
	
	/** The Polish. */
	Polish ("lang_pl"),
	
	/** The Portuguese. */
	Portuguese ("lang_pt"),
	
	/** The Romanian. */
	Romanian ("lang_ro"),
	
	/** The Russian. */
	Russian ("lang_ru"),
	
	/** The Serbian. */
	Serbian ("lang_sr"),
	
	/** The Slovak. */
	Slovak ("lang_sk"),
	
	/** The Slovenian. */
	Slovenian ("lang_sl"),
	
	/** The Spanish. */
	Spanish ("lang_es"),
	
	/** The Swedish. */
	Swedish ("lang_sv"),
	
	/** The Turkish. */
	Turkish ("lang_tr");
	
    /** The Constant stringToEnum. */
	private static final Map<String, CCTLD> stringToEnum = new HashMap<String, CCTLD>();

	static { // Initialize map from constant name to enum constant
		for (CCTLD op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new cCTLD.
     * 
     * @param value the value
     */
    CCTLD(String value) {
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
	 * @return the cCTLD
	 */
	public static CCTLD fromValue(String value) {
		return stringToEnum.get(value);
	}

}
