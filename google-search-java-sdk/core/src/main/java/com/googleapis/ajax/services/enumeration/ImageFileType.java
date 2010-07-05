/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum ImageFileType.
 */
public enum ImageFileType implements ValueEnum {
	
	/** The JPG. */
	JPG("jpg"), 
 
 /** The PNG. */
 PNG("png"), 
 
 /** The GIF. */
 GIF("gif"), 
 
 /** The BMP. */
 BMP("bmp");
	
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
     * Instantiates a new image file type.
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
	 * @return the image file type
	 */
	public static ImageFileType fromValue(String value) {
		return stringToEnum.get(value);
	}

}
