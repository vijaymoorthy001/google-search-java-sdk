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
 * The Class GeoMetry.
 */
public class GeoMetry extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2404092851056197701L;
	
	/** The location. */
	private GeoLocation location;
	
	/** The location type. */
	private LocationType locationType;
	
	/** The viewport. */
	private ViewPort viewport;
	
	/** The bounds. */
	private Bounds bounds;
	
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
	 * Gets the location type.
	 * 
	 * @return the location type
	 */
	public LocationType getLocationType() {
		return locationType;
	}
	
	/**
	 * Sets the location type.
	 * 
	 * @param locationType the new location type
	 */
	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
	
	/**
	 * Gets the viewport.
	 * 
	 * @return the viewport
	 */
	public ViewPort getViewport() {
		return viewport;
	}
	
	/**
	 * Sets the viewport.
	 * 
	 * @param viewport the new viewport
	 */
	public void setViewport(ViewPort viewport) {
		this.viewport = viewport;
	}
	
	/**
	 * Gets the bounds.
	 * 
	 * @return the bounds
	 */
	public Bounds getBounds() {
		return bounds;
	}
	
	/**
	 * Sets the bounds.
	 * 
	 * @param bounds the new bounds
	 */
	public void setBounds(Bounds bounds) {
		this.bounds = bounds;
	}
}
