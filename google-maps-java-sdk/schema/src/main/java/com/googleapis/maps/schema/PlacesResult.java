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
public class PlacesResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	private String name;
	private List<AddressComponentType> types;
	private String icon;
	private String reference;
	private String vicinity;
	private String formattedPhoneNumber;
	private String formattedAddress;
	private List<AddressComponent> addressComponents;
	private GeoMetry geometry;
	private double rating;
	private String url;
	private String id;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
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
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	/**
	 * @return the vicinity
	 */
	public String getVicinity() {
		return vicinity;
	}
	/**
	 * @param vicinity the vicinity to set
	 */
	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}
	/**
	 * @return the formattedPhoneNumber
	 */
	public String getFormattedPhoneNumber() {
		return formattedPhoneNumber;
	}
	/**
	 * @param formattedPhoneNumber the formattedPhoneNumber to set
	 */
	public void setFormattedPhoneNumber(String formattedPhoneNumber) {
		this.formattedPhoneNumber = formattedPhoneNumber;
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
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
}
