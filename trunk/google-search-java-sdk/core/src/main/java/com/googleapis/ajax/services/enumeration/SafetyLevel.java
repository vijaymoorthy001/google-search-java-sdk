package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum SafetyLevel.
 */
public enum SafetyLevel implements ValueEnum {
	
	/** The ACTIVE. */
	ACTIVE("active"), 
 
 /** The MODERATE. */
 MODERATE("moderate"), 
 
 /** The OFF. */
 OFF("off");
	
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
     * Instantiates a new safety level.
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
	 * @return the safety level
	 */
	public static SafetyLevel fromValue(String value) {
		return stringToEnum.get(value);
	}

}
