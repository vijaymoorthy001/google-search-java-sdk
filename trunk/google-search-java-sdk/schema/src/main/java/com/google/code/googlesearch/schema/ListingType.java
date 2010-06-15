package com.google.code.googlesearch.schema;

import java.util.HashMap;
import java.util.Map;

public enum ListingType implements ValueEnum {
	
	LOCAL("local"), KML("kml");
	
    /** The Constant stringToEnum. */
	private static final Map<String, ListingType> stringToEnum = new HashMap<String, ListingType>();

	static { // Initialize map from constant name to enum constant
		for (ListingType op : values()) {
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
    ListingType(String value) {
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
	public static ListingType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
