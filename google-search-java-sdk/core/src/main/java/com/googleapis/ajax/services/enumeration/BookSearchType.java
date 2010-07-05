/**
 * 
 */
package com.googleapis.ajax.services.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum BookSearchType.
 */
public enum BookSearchType implements ValueEnum {
	
	/** The ALL. */
	ALL(null), 
 
 /** The FUL l_ view. */
 FULL_VIEW("as_brr");

    /** The Constant stringToEnum. */
	private static final Map<String, BookSearchType> stringToEnum = new HashMap<String, BookSearchType>();

	static { // Initialize map from constant name to enum constant
		for (BookSearchType op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new book search type.
     * 
     * @param value the value
     */
    BookSearchType(String value) {
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
	 * @return the book search type
	 */
	public static BookSearchType fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
