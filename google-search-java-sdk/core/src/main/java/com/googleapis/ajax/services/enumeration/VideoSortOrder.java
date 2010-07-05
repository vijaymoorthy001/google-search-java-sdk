/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum VideoSortOrder.
 */
public enum VideoSortOrder implements ValueEnum {
	
	/** The RELEVANCE. */
	RELEVANCE(""), 
 
 /** The DATE. */
 DATE("d");	
	
    /** The Constant stringToEnum. */
	private static final Map<String, VideoSortOrder> stringToEnum = new HashMap<String, VideoSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (VideoSortOrder op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new video sort order.
     * 
     * @param value the value
     */
    VideoSortOrder(String value) {
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
	 * @return the video sort order
	 */
	public static VideoSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}

}
