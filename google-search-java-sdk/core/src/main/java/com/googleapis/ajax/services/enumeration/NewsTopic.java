/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum NewsTopic.
 */
public enum NewsTopic implements ValueEnum {
	
	/** The TO p_ headlines. */
	TOP_HEADLINES("h"),

/** The WORLD. */
WORLD("w"), 
 
 /** The BUSINESS. */
 BUSINESS("b"), 
 
 /** The NATION. */
 NATION("n"), 
 
 /** The SCIENC e_ an d_ tech. */
 SCIENCE_AND_TECH("t"), 
 
 /** The ELECTRONICS. */
 ELECTRONICS("el"), 
 
 /** The POLITICS. */
 POLITICS("p"), 
 
 /** The ENTERTAINMENT. */
 ENTERTAINMENT("e"), 
 
 /** The SPORTS. */
 SPORTS("s"), 
 
 /** The HEALTH. */
 HEALTH("m");
	
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
     * Instantiates a new news topic.
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
	 * @return the news topic
	 */
	public static NewsTopic fromValue(String value) {
		return stringToEnum.get(value);
	}

}
