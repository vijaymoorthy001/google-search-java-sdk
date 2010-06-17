/**
 * 
 */
package com.google.code.googlesearch.schema;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * The Enum VideoType.
 */
public enum VideoType implements ValueEnum {
	
	/** The YO u_ tube. */
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
     * Instantiates a new video type.
     * 
     * @param value the value
     */
    VideoType(String value) {
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
	 * @return the video type
	 */
	public static VideoType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
