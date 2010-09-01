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



/**
 * The Class ElevationResult.
 */
public class ElevationResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	
	/** The location. */
	private GeoLocation location;
	
	/** The elevation. */
	private double elevation;
	
	/**
	 * Gets the location.
	 * 
	 * @return the location
	 */
	public GeoLocation getLocation() {
		return location;
	}
	
	/**
	 * Sets the location.
	 * 
	 * @param location the new location
	 */
	public void setLocation(GeoLocation location) {
		this.location = location;
	}
	
	/**
	 * Gets the elevation.
	 * 
	 * @return the elevation
	 */
	public double getElevation() {
		return elevation;
	}
	
	/**
	 * Sets the elevation.
	 * 
	 * @param elevation the new elevation
	 */
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}
}
