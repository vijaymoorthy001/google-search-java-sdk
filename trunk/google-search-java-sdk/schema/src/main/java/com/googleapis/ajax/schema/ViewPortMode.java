/**
 * 
 */
package com.googleapis.ajax.schema;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum ViewPortMode.
 */
public enum ViewPortMode implements ValueEnum {
	
	/** The COMPUTED. */
	COMPUTED("computed");

    /** The Constant stringToEnum. */
	private static final Map<String, ViewPortMode> stringToEnum = new HashMap<String, ViewPortMode>();

	static { // Initialize map from constant name to enum constant
		for (ViewPortMode op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new view port mode.
     * 
     * @param value the value
     */
    ViewPortMode(String value) {
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
	 * @return the view port mode
	 */
	public static ViewPortMode fromValue(String value) {
		return stringToEnum.get(value);
	}
}
