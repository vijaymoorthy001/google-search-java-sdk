/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum TranslationFormat.
 */
public enum TranslationFormat implements ValueEnum {
	
	/** The HTML. */
	HTML("html"), 
 
 /** The TEXT. */
 TEXT("text");

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
     * Instantiates a new translation format.
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
	 * @return the translation format
	 */
	public static TranslationFormat fromValue(String value) {
		return stringToEnum.get(value);
	}

}
