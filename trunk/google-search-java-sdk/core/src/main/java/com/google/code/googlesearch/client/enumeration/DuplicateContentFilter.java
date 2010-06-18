/**
 * 
 */
package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * The Enum DuplicateContentFilter.
 */
public enum DuplicateContentFilter implements ValueEnum {
	
	/** The OFF. */
	OFF("0"), 
 
 /** The ON. */
 ON("1");

    /** The Constant stringToEnum. */
	private static final Map<String, DuplicateContentFilter> stringToEnum = new HashMap<String, DuplicateContentFilter>();

	static { // Initialize map from constant name to enum constant
		for (DuplicateContentFilter op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new duplicate content filter.
     * 
     * @param value the value
     */
    DuplicateContentFilter(String value) {
        this.value = value;
    }

	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.common.ValueEnum#value()
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
	 * @return the duplicate content filter
	 */
	public static DuplicateContentFilter fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
