/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum NewsEdition.
 */
public enum NewsEdition implements ValueEnum {
	
	/** The US. */
	US("us"), 
 
 /** The UK. */
 UK("uk");
	
    /** The Constant stringToEnum. */
	private static final Map<String, NewsEdition> stringToEnum = new HashMap<String, NewsEdition>();

	static { // Initialize map from constant name to enum constant
		for (NewsEdition op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new news edition.
     * 
     * @param value the value
     */
    NewsEdition(String value) {
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
	 * @return the news edition
	 */
	public static NewsEdition fromValue(String value) {
		return stringToEnum.get(value);
	}

}
