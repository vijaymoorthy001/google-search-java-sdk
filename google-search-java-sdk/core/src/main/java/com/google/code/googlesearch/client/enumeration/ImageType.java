/**
 * 
 */
package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * @author nmukhtar
 *
 */
public enum ImageType implements ValueEnum {
	FACE("face"), PHOTO("photo"), CLIPART("clipart"), LINEART("lineart");
	
    /** The Constant stringToEnum. */
	private static final Map<String, ImageType> stringToEnum = new HashMap<String, ImageType>();

	static { // Initialize map from constant name to enum constant
		for (ImageType op : values()) {
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
    ImageType(String value) {
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
	public static ImageType fromValue(String value) {
		return stringToEnum.get(value);
	}

}
