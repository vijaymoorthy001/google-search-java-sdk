/**
 * 
 */
package com.google.code.googlesearch.schema;

import java.util.HashMap;
import java.util.Map;

import com.google.code.googlesearch.common.ValueEnum;

/**
 * @author nmukhtar
 *
 */
public enum GsearchResultClass implements ValueEnum {
	GlocalSearch("GlocalSearch"), GblogSearch("GblogSearch"), GbookSearch("GbookSearch"), GimageSearch("GimageSearch"), GnewsSearch("GnewsSearch"), GpatentSearch("GpatentSearch"), GvideoSearch("GvideoSearch"), GwebSearch("GwebSearch");

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
     * Instantiates a new user timeline type.
     * 
     * @param value the value
     */
    GsearchResultClass(String value) {
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
	public static GsearchResultClass fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
