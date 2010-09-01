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
 * The Class PlacesResult.
 */
public class PlacesResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	
	/** The name. */
	private String name;
	
	/** The types. */
	private List<AddressComponentType> types;
	
	/** The icon. */
	private String icon;
	
	/** The reference. */
	private String reference;
	
	/** The vicinity. */
	private String vicinity;
	
	/** The formatted phone number. */
	private String formattedPhoneNumber;
	
	/** The formatted address. */
	private String formattedAddress;
	
	/** The address components. */
	private List<AddressComponent> addressComponents;
	
	/** The geometry. */
	private GeoMetry geometry;
	
	/** The rating. */
	private double rating;
	
	/** The url. */
	private String url;
	
	/** The id. */
	private String id;
	
	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 * 
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
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
	
	/**
	 * Gets the icon.
	 * 
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}
	
	/**
	 * Sets the icon.
	 * 
	 * @param icon the new icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	/**
	 * Gets the reference.
	 * 
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	
	/**
	 * Sets the reference.
	 * 
	 * @param reference the new reference
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	/**
	 * Gets the vicinity.
	 * 
	 * @return the vicinity
	 */
	public String getVicinity() {
		return vicinity;
	}
	
	/**
	 * Sets the vicinity.
	 * 
	 * @param vicinity the new vicinity
	 */
	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}
	
	/**
	 * Gets the formatted phone number.
	 * 
	 * @return the formatted phone number
	 */
	public String getFormattedPhoneNumber() {
		return formattedPhoneNumber;
	}
	
	/**
	 * Sets the formatted phone number.
	 * 
	 * @param formattedPhoneNumber the new formatted phone number
	 */
	public void setFormattedPhoneNumber(String formattedPhoneNumber) {
		this.formattedPhoneNumber = formattedPhoneNumber;
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
	
	/**
	 * Gets the rating.
	 * 
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	
	/**
	 * Sets the rating.
	 * 
	 * @param rating the new rating
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	/**
	 * Gets the url.
	 * 
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * Sets the url.
	 * 
	 * @param url the new url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 * 
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}
}
