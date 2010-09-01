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
 * The Enum LocationType.
 */
public enum LocationType implements ValueEnum {
	
	/** The ROOFTOP. */
	ROOFTOP("ROOFTOP"),
	
	/** The RANG e_ interpolated. */
	RANGE_INTERPOLATED("RANGE_INTERPOLATED"),
	
	/** The GEOMETRI c_ center. */
	GEOMETRIC_CENTER("GEOMETRIC_CENTER"),
	
	/** The APPROXIMATE. */
	APPROXIMATE("APPROXIMATE");
	
    /** The Constant stringToEnum. */
	private static final Map<String, LocationType> stringToEnum = new HashMap<String, LocationType>();

	static { // Initialize map from constant name to enum constant
		for (LocationType op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new location type.
     * 
     * @param value the value
     */
    LocationType(String value) {
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
	 * @return the location type
	 */
	public static LocationType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
