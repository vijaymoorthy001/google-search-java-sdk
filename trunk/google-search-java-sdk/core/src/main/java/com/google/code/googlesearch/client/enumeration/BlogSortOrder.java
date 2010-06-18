/**
 * 
 */
package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * The Enum BlogSortOrder.
 */
public enum BlogSortOrder implements ValueEnum {
	
	/** The RELEVANCE. */
	RELEVANCE(""), 
 
 /** The DATE. */
 DATE("d");
	
	
    /** The Constant stringToEnum. */
	private static final Map<String, BlogSortOrder> stringToEnum = new HashMap<String, BlogSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (BlogSortOrder op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new blog sort order.
     * 
     * @param value the value
     */
    BlogSortOrder(String value) {
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
	 * @return the blog sort order
	 */
	public static BlogSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}

}
