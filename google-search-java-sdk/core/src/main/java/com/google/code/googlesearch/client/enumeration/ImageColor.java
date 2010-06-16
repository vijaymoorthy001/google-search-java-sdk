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
public enum ImageColor implements ValueEnum {
	BLACK("black"), BLUE("blue"), BROWN("brown"), GRAY("gray"), GREEN("green"), ORANGE("orange"), PINK("pink"), PURPLE("purple"), RED("red"), TEAL("teal"), WHITE("white"), YELLOW("yellow");
	
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
     * Instantiates a new user timeline type.
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
	 * @return the user timeline type
	 */
	public static ImageColor fromValue(String value) {
		return stringToEnum.get(value);
	}

}
