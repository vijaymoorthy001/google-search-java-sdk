/**
 * 
 */
package com.google.code.googlesearch.client;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * @author nmukhtar
 *
 */
public enum ImageRights implements ValueEnum {
	CC_PUBLICDOMAIN("cc_publicdomain"), CC_ATTRIBUTE("cc_attribute"), CC_SHAREALIKE("cc_sharealike"), CC_NONCOMMERCIAL("cc_noncommercial"), CC_NONDERIVED("cc_nonderived");
	
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
     * Instantiates a new user timeline type.
     * 
     * @param value the value
     */
    ImageRights(String value) {
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
	public static ImageRights fromValue(String value) {
		return stringToEnum.get(value);
	}

}
