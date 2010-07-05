/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum ImageColor.
 */
public enum ImageColor implements ValueEnum {
	
	/** The BLACK. */
	BLACK("black"), 
 
 /** The BLUE. */
 BLUE("blue"), 
 
 /** The BROWN. */
 BROWN("brown"), 
 
 /** The GRAY. */
 GRAY("gray"), 
 
 /** The GREEN. */
 GREEN("green"), 
 
 /** The ORANGE. */
 ORANGE("orange"), 
 
 /** The PINK. */
 PINK("pink"), 
 
 /** The PURPLE. */
 PURPLE("purple"), 
 
 /** The RED. */
 RED("red"), 
 
 /** The TEAL. */
 TEAL("teal"), 
 
 /** The WHITE. */
 WHITE("white"), 
 
 /** The YELLOW. */
 YELLOW("yellow");
	
    /** The Constant stringToEnum. */
	private static final Map<String, ImageColor> stringToEnum = new HashMap<String, ImageColor>();

	static { // Initialize map from constant name to enum constant
		for (ImageColor op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new image color.
     * 
     * @param value the value
     */
    ImageColor(String value) {
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
	 * @return the image color
	 */
	public static ImageColor fromValue(String value) {
		return stringToEnum.get(value);
	}

}
