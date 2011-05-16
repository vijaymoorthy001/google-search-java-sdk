/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.googleapis.maps.schema;

import java.util.HashMap;
import java.util.Map;


/**
 * The Enum AddressComponentType.
 */
public enum AddressComponentType implements ValueEnum {
	
	/** The STREE t_ address. */
	STREET_ADDRESS("street_address"),
	
	/** The ROUTE. */
	ROUTE("route"),
	
	/** The INTERSECTION. */
	INTERSECTION("intersection"),
	
	/** The POLITICAL. */
	POLITICAL("political"),
	
	/** The COUNTRY. */
	COUNTRY("country"),
	
	/** The ADMINISTRATIV e_ are a_ leve l_1. */
	ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),
	
	/** The ADMINISTRATIV e_ are a_ leve l_2. */
	ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),
	
	/** The ADMINISTRATIV e_ are a_ leve l_3. */
	ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),
	
	/** The COLLOQUIA l_ area. */
	COLLOQUIAL_AREA("colloquial_area"),
	
	/** The LOCALITY. */
	LOCALITY("locality"),
	
	/** The SUBLOCALITY. */
	SUBLOCALITY("sublocality"),
	
	/** The NEIGHBORHOOD. */
	NEIGHBORHOOD("neighborhood"),
	
	/** The PREMISE. */
	PREMISE("premise"),
	
	/** The SUBPREMISE. */
	SUBPREMISE("subpremise"),
	
	/** The POSTA l_ code. */
	POSTAL_CODE("postal_code"),
	
	/** The NATURA l_ feature. */
	NATURAL_FEATURE("natural_feature"),
	
	/** The AIRPORT. */
	AIRPORT("airport"),
	
	/** The PARK. */
	PARK("park"),
	
	/** The POIN t_ o f_ interest. */
	POINT_OF_INTEREST("point_of_interest"),
	
	/** The POS t_ box. */
	POST_BOX("post_box"),
	
	/** The STREE t_ number. */
	STREET_NUMBER("street_number"),
	
	/** The FLOOR. */
	FLOOR("floor"),
	
	/** The ROOM. */
	ROOM("room");
	
    /** The Constant stringToEnum. */
	private static final Map<String, AddressComponentType> stringToEnum = new HashMap<String, AddressComponentType>();

	static { // Initialize map from constant name to enum constant
		for (AddressComponentType op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new address component type.
     * 
     * @param value the value
     */
    AddressComponentType(String value) {
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
	 * @return the address component type
	 */
	public static AddressComponentType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
