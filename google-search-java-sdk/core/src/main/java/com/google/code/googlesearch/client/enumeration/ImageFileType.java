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
public enum ImageFileType implements ValueEnum {
	JPG("jpg"), PNG("png"), GIF("gif"), BMP("bmp");
	
    /** The Constant stringToEnum. */
	private static final Map<String, ImageFileType> stringToEnum = new HashMap<String, ImageFileType>();

	static { // Initialize map from constant name to enum constant
		for (ImageFileType op : values()) {
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
    ImageFileType(String value) {
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
	public static ImageFileType fromValue(String value) {
		return stringToEnum.get(value);
	}

}
