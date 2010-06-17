/**
 * 
 */
package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * The Enum ImageRights.
 */
public enum ImageRights implements ValueEnum {
	
	/** The C c_ publicdomain. */
	CC_PUBLICDOMAIN("cc_publicdomain"), 
 /** The C c_ attribute. */
 CC_ATTRIBUTE("cc_attribute"), 
 /** The C c_ sharealike. */
 CC_SHAREALIKE("cc_sharealike"), 
 /** The C c_ noncommercial. */
 CC_NONCOMMERCIAL("cc_noncommercial"), 
 /** The C c_ nonderived. */
 CC_NONDERIVED("cc_nonderived");
	
    /** The Constant stringToEnum. */
	private static final Map<String, ImageRights> stringToEnum = new HashMap<String, ImageRights>();

	static { // Initialize map from constant name to enum constant
		for (ImageRights op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new image rights.
     * 
     * @param value the value
     */
    ImageRights(String value) {
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
	 * @return the image rights
	 */
	public static ImageRights fromValue(String value) {
		return stringToEnum.get(value);
	}

}
