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
 * The Class DetectLanguageResult.
 */
public class GeocodingResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	private List<AddressComponentType> types;
	private String formattedAddress;
	private List<AddressComponent> addressComponents;
	private GeoMetry geometry;
	/**
	 * @return the types
	 */
	public List<AddressComponentType> getTypes() {
		return types;
	}
	/**
	 * @param types the types to set
	 */
	public void setTypes(List<AddressComponentType> types) {
		this.types = types;
	}
	/**
	 * @return the formattedAddress
	 */
	public String getFormattedAddress() {
		return formattedAddress;
	}
	/**
	 * @param formattedAddress the formattedAddress to set
	 */
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	/**
	 * @return the addressComponents
	 */
	public List<AddressComponent> getAddressComponents() {
		return addressComponents;
	}
	/**
	 * @param addressComponents the addressComponents to set
	 */
	public void setAddressComponents(List<AddressComponent> addressComponents) {
		this.addressComponents = addressComponents;
	}
	/**
	 * @return the geometry
	 */
	public GeoMetry getGeometry() {
		return geometry;
	}
	/**
	 * @param geometry the geometry to set
	 */
	public void setGeometry(GeoMetry geometry) {
		this.geometry = geometry;
	}
}
