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
public enum VideoType implements ValueEnum {
	YOU_TUBE("YouTube");

    /** The Constant stringToEnum. */
	private static final Map<String, VideoType> stringToEnum = new HashMap<String, VideoType>();

	static { // Initialize map from constant name to enum constant
		for (VideoType op : values()) {
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
    VideoType(String value) {
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
	public static VideoType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
