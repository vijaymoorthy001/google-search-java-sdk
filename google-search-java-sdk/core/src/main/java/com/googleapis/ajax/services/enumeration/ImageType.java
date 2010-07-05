/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum ImageType.
 */
public enum ImageType implements ValueEnum {
	
	/** The FACE. */
	FACE("face"), 
 
 /** The PHOTO. */
 PHOTO("photo"), 
 
 /** The CLIPART. */
 CLIPART("clipart"), 
 
 /** The LINEART. */
 LINEART("lineart");
	
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
     * Instantiates a new image type.
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
	 * @return the image type
	 */
	public static ImageType fromValue(String value) {
		return stringToEnum.get(value);
	}

}
