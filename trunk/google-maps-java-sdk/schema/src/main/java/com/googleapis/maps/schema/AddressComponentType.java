/*
 * Copyright 2010 Nabeel Mukhtar 
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
 * The Enum ListingType.
 */
public enum AddressComponentType implements ValueEnum {
	
	STREET_ADDRESS("street_address"),
	ROUTE("route"),
	INTERSECTION("intersection"),
	POLITICAL("political"),
	COUNTRY("country"),
	ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),
	ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),
	ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),
	COLLOQUIAL_AREA("colloquial_area"),
	LOCALITY("locality"),
	SUBLOCALITY("sublocality"),
	NEIGHBORHOOD("neighborhood"),
	PREMISE("premise"),
	SUBPREMISE("subpremise"),
	POSTAL_CODE("postal_code"),
	NATURAL_FEATURE("natural_feature"),
	AIRPORT("airport"),
	PARK("park"),
	POINT_OF_INTEREST("point_of_interest"),
	POST_BOX("post_box"),
	STREET_NUMBER("street_number"),
	FLOOR("floor"),
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
     * Instantiates a new listing type.
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
	 * @return the listing type
	 */
	public static AddressComponentType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
