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
 * The Class ViewPort.
 */
public class ViewPort extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	
	/** The southwest. */
	private GeoLocation southwest;
	
	/** The northeast. */
	private GeoLocation northeast;
	
	/**
	 * Gets the southwest.
	 * 
	 * @return the southwest
	 */
	public GeoLocation getSouthwest() {
		return southwest;
	}
	
	/**
	 * Sets the southwest.
	 * 
	 * @param southwest the new southwest
	 */
	public void setSouthwest(GeoLocation southwest) {
		this.southwest = southwest;
	}
	
	/**
	 * Gets the northeast.
	 * 
	 * @return the northeast
	 */
	public GeoLocation getNortheast() {
		return northeast;
	}
	
	/**
	 * Sets the northeast.
	 * 
	 * @param northeast the new northeast
	 */
	public void setNortheast(GeoLocation northeast) {
		this.northeast = northeast;
	}
}
