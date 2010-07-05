package com.googleapis.ajax.schema;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum ListingType.
 */
public enum ListingType implements ValueEnum {
	
	/** The LOCAL. */
	LOCAL("local"), 
 /** The KML. */
 KML("kml");
	
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
     * Instantiates a new listing type.
     * 
     * @param value the value
     */
    ListingType(String value) {
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
	 * @return the listing type
	 */
	public static ListingType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
