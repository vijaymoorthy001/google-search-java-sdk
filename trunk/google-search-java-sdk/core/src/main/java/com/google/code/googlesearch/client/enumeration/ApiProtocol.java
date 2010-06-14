/**
 * 
 */
package com.google.code.googlesearch.client.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nmukhtar
 *
 */
public enum ApiProtocol implements ValueEnum {
	XML("xml"),
	JSON("json"),
	SOAP("soap"),
	RSS("rss");
	
    /**
     * Field Description.
     */
	private static final Map<String, ApiProtocol> stringToEnum = new HashMap<String, ApiProtocol>();

	static { // Initialize map from constant name to enum constant
		for (ApiProtocol op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** Field description */
    private final String value;
	
	ApiProtocol(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}
	
	public static ApiProtocol fromValue(String value) {
		return stringToEnum.get(value);
	}
}
