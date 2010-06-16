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
public enum ImageSize implements ValueEnum  {
	ICON("icon"), SMALL("small"), MEDIUM("medium"), LARGE("large"), XLARGE("xlarge"), XXLARGE("xxlarge"), HUGE("huge");
	
    /** The Constant stringToEnum. */
	private static final Map<String, ImageSize> stringToEnum = new HashMap<String, ImageSize>();

	static { // Initialize map from constant name to enum constant
		for (ImageSize op : values()) {
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
    ImageSize(String value) {
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
	public static ImageSize fromValue(String value) {
		return stringToEnum.get(value);
	}

}
