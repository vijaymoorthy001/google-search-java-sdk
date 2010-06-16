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
public enum PatentSearchType implements ValueEnum {
	ALL(null), FILED("as_psra"), ISSUED("as_psrg");
	
    /** The Constant stringToEnum. */
	private static final Map<String, PatentSearchType> stringToEnum = new HashMap<String, PatentSearchType>();

	static { // Initialize map from constant name to enum constant
		for (PatentSearchType op : values()) {
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
    PatentSearchType(String value) {
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
	public static PatentSearchType fromValue(String value) {
		return stringToEnum.get(value);
	}

}
