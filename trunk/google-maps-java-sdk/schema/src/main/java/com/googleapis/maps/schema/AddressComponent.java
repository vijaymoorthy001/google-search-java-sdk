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

import java.util.List;

/**
 * The Class AddressComponent.
 * $Rev$
 */
public class AddressComponent extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3549366270503297886L;

	/** The long name. */
	private String longName;
	
	/** The short name. */
	private String shortName;
	
	/** The types. */
	private List<AddressComponentType> types;
	
	/**
	 * Gets the long name.
	 * 
	 * @return the long name
	 */
	public String getLongName() {
		return longName;
	}
	
	/**
	 * Sets the long name.
	 * 
	 * @param longName the new long name
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}
	
	/**
	 * Gets the short name.
	 * 
	 * @return the short name
	 */
	public String getShortName() {
		return shortName;
	}
	
	/**
	 * Sets the short name.
	 * 
	 * @param shortName the new short name
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	/**
	 * Gets the types.
	 * 
	 * @return the types
	 */
	public List<AddressComponentType> getTypes() {
		return types;
	}
	
	/**
	 * Sets the types.
	 * 
	 * @param types the new types
	 */
	public void setTypes(List<AddressComponentType> types) {
		this.types = types;
	}
}
