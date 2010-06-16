/**
 * 
 */
package com.google.code.googlesearch.client;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * @author nmukhtar
 *
 */
public enum NewsSortOrder implements ValueEnum {
	RELEVANCE(""), DATE("d");	
	
    /** The Constant stringToEnum. */
	private static final Map<String, NewsSortOrder> stringToEnum = new HashMap<String, NewsSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (NewsSortOrder op : values()) {
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
    NewsSortOrder(String value) {
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
	public static NewsSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
