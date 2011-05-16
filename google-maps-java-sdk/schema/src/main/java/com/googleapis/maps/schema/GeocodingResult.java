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

import java.util.List;



/**
 * The Class GeocodingResult.
 */
public class GeocodingResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	
	/** The types. */
	private List<AddressComponentType> types;
	
	/** The formatted address. */
	private String formattedAddress;
	
	/** The address components. */
	private List<AddressComponent> addressComponents;
	
	/** The geometry. */
	private GeoMetry geometry;
	
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
	
	/**
	 * Gets the formatted address.
	 * 
	 * @return the formatted address
	 */
	public String getFormattedAddress() {
		return formattedAddress;
	}
	
	/**
	 * Sets the formatted address.
	 * 
	 * @param formattedAddress the new formatted address
	 */
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	
	/**
	 * Gets the address components.
	 * 
	 * @return the address components
	 */
	public List<AddressComponent> getAddressComponents() {
		return addressComponents;
	}
	
	/**
	 * Sets the address components.
	 * 
	 * @param addressComponents the new address components
	 */
	public void setAddressComponents(List<AddressComponent> addressComponents) {
		this.addressComponents = addressComponents;
	}
	
	/**
	 * Gets the geometry.
	 * 
	 * @return the geometry
	 */
	public GeoMetry getGeometry() {
		return geometry;
	}
	
	/**
	 * Sets the geometry.
	 * 
	 * @param geometry the new geometry
	 */
	public void setGeometry(GeoMetry geometry) {
		this.geometry = geometry;
	}
}
