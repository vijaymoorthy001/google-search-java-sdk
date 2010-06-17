/**
 * 
 */
package com.google.code.googlesearch.schema;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * @author nmukhtar
 *
 */
public enum ViewPortMode implements ValueEnum {
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
     * Instantiates a new user timeline type.
     * 
     * @param value the value
     */
    ViewPortMode(String value) {
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
	public static ViewPortMode fromValue(String value) {
		return stringToEnum.get(value);
	}
}
