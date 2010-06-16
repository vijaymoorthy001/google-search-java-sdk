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
public enum BookSearchType implements ValueEnum {
	ALL(null), FULL_VIEW("as_brr");

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
     * Instantiates a new user timeline type.
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
	 * @return the user timeline type
	 */
	public static BookSearchType fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
