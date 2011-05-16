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



/**
 * The Class GeoLocation.
 */
public class GeoLocation extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	
	/** The lat. */
	private double lat;
	
	/** The lng. */
	private double lng;
	
	/**
	 * Instantiates a new geo location.
	 */
	public GeoLocation() {}
	
	/**
	 * Instantiates a new geo location.
	 * 
	 * @param lat the lat
	 * @param lng the lng
	 */
	public GeoLocation(double lat, double lng) {
		this.lat = lat;
		this.lng = lng;
	}
	
	/**
	 * Gets the lat.
	 * 
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}
	
	/**
	 * Sets the lat.
	 * 
	 * @param lat the new lat
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	/**
	 * Gets the lng.
	 * 
	 * @return the lng
	 */
	public double getLng() {
		return lng;
	}
	
	/**
	 * Sets the lng.
	 * 
	 * @param lng the new lng
	 */
	public void setLng(double lng) {
		this.lng = lng;
	}
}
