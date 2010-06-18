/**
 * 
 */
package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * The Enum ResultSetSize.
 */
public enum ResultSetSize implements ValueEnum {
	
	/** The LARGE. */
	LARGE("large"), 
 
 /** The SMALL. */
 SMALL("small");
	
    /** The Constant stringToEnum. */
	private static final Map<String, ResultSetSize> stringToEnum = new HashMap<String, ResultSetSize>();

	static { // Initialize map from constant name to enum constant
		for (ResultSetSize op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new result set size.
     * 
     * @param value the value
     */
    ResultSetSize(String value) {
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
	 * @return the result set size
	 */
	public static ResultSetSize fromValue(String value) {
		return stringToEnum.get(value);
	}
}
