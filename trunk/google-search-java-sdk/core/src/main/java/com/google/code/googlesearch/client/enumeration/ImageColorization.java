/**
 * 
 */
package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * The Enum ImageColorization.
 */
public enum ImageColorization implements ValueEnum {
	
	/** The GRAY. */
	GRAY("gray"), 
 
 /** The COLOR. */
 COLOR("color");
	
    /** The Constant stringToEnum. */
	private static final Map<String, ImageColorization> stringToEnum = new HashMap<String, ImageColorization>();

	static { // Initialize map from constant name to enum constant
		for (ImageColorization op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new image colorization.
     * 
     * @param value the value
     */
    ImageColorization(String value) {
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
	 * @return the image colorization
	 */
	public static ImageColorization fromValue(String value) {
		return stringToEnum.get(value);
	}

}
