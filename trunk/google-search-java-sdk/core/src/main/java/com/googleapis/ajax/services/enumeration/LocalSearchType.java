/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum LocalSearchType.
 */
public enum LocalSearchType implements ValueEnum {
	
	/** The BLENDED. */
	BLENDED("blended"), 
 
 /** The KMLONLY. */
 KMLONLY("kmlonly"), 
 
 /** The LOCALONLY. */
 LOCALONLY("localonly");
	
    /** The Constant stringToEnum. */
	private static final Map<String, LocalSearchType> stringToEnum = new HashMap<String, LocalSearchType>();

	static { // Initialize map from constant name to enum constant
		for (LocalSearchType op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new local search type.
     * 
     * @param value the value
     */
    LocalSearchType(String value) {
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
	 * @return the local search type
	 */
	public static LocalSearchType fromValue(String value) {
		return stringToEnum.get(value);
	}

}
