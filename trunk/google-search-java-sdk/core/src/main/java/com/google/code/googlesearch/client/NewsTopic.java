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
public enum NewsTopic implements ValueEnum {
	TOP_HEADLINES("h"),WORLD("w"), BUSINESS("b"), NATION("n"), SCIENCE_AND_TECH("t"), ELECTRONICS("el"), POLITICS("p"), ENTERTAINMENT("e"), SPORTS("s"), HEALTH("m");
	
    /** The Constant stringToEnum. */
	private static final Map<String, NewsTopic> stringToEnum = new HashMap<String, NewsTopic>();

	static { // Initialize map from constant name to enum constant
		for (NewsTopic op : values()) {
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
    NewsTopic(String value) {
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
	public static NewsTopic fromValue(String value) {
		return stringToEnum.get(value);
	}

}
