package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

public enum SafetyLevel implements ValueEnum {
	ACTIVE("active"), MODERATE("moderate"), OFF("off");
	
    /** The Constant stringToEnum. */
	private static final Map<String, SafetyLevel> stringToEnum = new HashMap<String, SafetyLevel>();

	static { // Initialize map from constant name to enum constant
		for (SafetyLevel op : values()) {
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
    SafetyLevel(String value) {
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
	public static SafetyLevel fromValue(String value) {
		return stringToEnum.get(value);
	}

}
