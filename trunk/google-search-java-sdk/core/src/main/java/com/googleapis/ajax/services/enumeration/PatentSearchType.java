/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum PatentSearchType.
 */
public enum PatentSearchType implements ValueEnum {
	
	/** The ALL. */
	ALL(null), 
 
 /** The FILED. */
 FILED("as_psra"), 
 
 /** The ISSUED. */
 ISSUED("as_psrg");
	
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
     * Instantiates a new patent search type.
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
	 * @return the patent search type
	 */
	public static PatentSearchType fromValue(String value) {
		return stringToEnum.get(value);
	}

}
