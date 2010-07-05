package com.googleapis.ajax.schema;

import java.util.HashMap;
import java.util.Map;

import com.googleapis.ajax.common.ValueEnum;

public enum PhoneNumberType implements ValueEnum {
	MAIN("main"), FAX("fax"), MOBILE("mobile"), DATA("data");
	
    /** The Constant stringToEnum. */
	private static final Map<String, PhoneNumberType> stringToEnum = new HashMap<String, PhoneNumberType>();

	static { // Initialize map from constant name to enum constant
		for (PhoneNumberType op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new patent status.
     * 
     * @param value the value
     */
    PhoneNumberType(String value) {
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
	 * @return the patent status
	 */
	public static PhoneNumberType fromValue(String value) {
		return stringToEnum.get(value);
	}


}
