/**
 * 
 */
package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * @author nmukhtar
 *
 */
public enum TranslationFormat implements ValueEnum {
	HTML("html"), TEXT("text");

    /** The Constant stringToEnum. */
	private static final Map<String, TranslationFormat> stringToEnum = new HashMap<String, TranslationFormat>();

	static { // Initialize map from constant name to enum constant
		for (TranslationFormat op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new user timeline type.
     * 
     * @param value the value
     */
    TranslationFormat(String value) {
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
	 * @return the user timeline type
	 */
	public static TranslationFormat fromValue(String value) {
		return stringToEnum.get(value);
	}

}
