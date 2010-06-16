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
public enum DuplicateContentFilter implements ValueEnum {
	OFF("0"), ON("1");

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
     * Instantiates a new user timeline type.
     * 
     * @param value the value
     */
    DuplicateContentFilter(String value) {
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
	public static DuplicateContentFilter fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
