/**
 * 
 */
package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * The Enum PatentSortOrder.
 */
public enum PatentSortOrder implements ValueEnum {
	
	/** The RELEVANCE. */
	RELEVANCE(""), 
 /** The DATE. */
 DATE("d");	
	
    /** The Constant stringToEnum. */
	private static final Map<String, PatentSortOrder> stringToEnum = new HashMap<String, PatentSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (PatentSortOrder op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new patent sort order.
     * 
     * @param value the value
     */
    PatentSortOrder(String value) {
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
	 * @return the patent sort order
	 */
	public static PatentSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}

}
