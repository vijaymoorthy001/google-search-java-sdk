/**
 * 
 */
package com.googleapis.ajax.schema;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

/**
 * The Enum GsearchResultClass.
 */
public enum GsearchResultClass implements ValueEnum {
	
	/** The Glocal search. */
	GlocalSearch("GlocalSearch"), 
 
 /** The Gblog search. */
 GblogSearch("GblogSearch"), 
 
 /** The Gbook search. */
 GbookSearch("GbookSearch"), 
 
 /** The Gimage search. */
 GimageSearch("GimageSearch"), 
 
 /** The Gnews search. */
 GnewsSearch("GnewsSearch"), 
 
 /** The Gpatent search. */
 GpatentSearch("GpatentSearch"), 
 
 /** The Gvideo search. */
 GvideoSearch("GvideoSearch"), 
 
 /** The Gweb search. */
 GwebSearch("GwebSearch");

    /** The Constant stringToEnum. */
	private static final Map<String, GsearchResultClass> stringToEnum = new HashMap<String, GsearchResultClass>();

	static { // Initialize map from constant name to enum constant
		for (GsearchResultClass op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new gsearch result class.
     * 
     * @param value the value
     */
    GsearchResultClass(String value) {
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
	 * @return the gsearch result class
	 */
	public static GsearchResultClass fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
