/**
 * 
 */
package com.google.code.googlesearch.schema;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nmukhtar
 *
 */
public enum PatentStatus implements ValueEnum {
	FILED("filed"), ISSUED("issued");
	
    /** The Constant stringToEnum. */
	private static final Map<String, PatentStatus> stringToEnum = new HashMap<String, PatentStatus>();

	static { // Initialize map from constant name to enum constant
		for (PatentStatus op : values()) {
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
    PatentStatus(String value) {
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
	public static PatentStatus fromValue(String value) {
		return stringToEnum.get(value);
	}

}
