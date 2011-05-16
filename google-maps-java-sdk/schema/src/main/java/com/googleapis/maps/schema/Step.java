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
 * The Class Step.
 */
public class Step extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 983083176571350946L;
	
	/** The travel mode. */
	private TravelMode travelMode;
	
	/** The start location. */
	private GeoLocation startLocation;
	
	/** The end location. */
	private GeoLocation endLocation;
	
	/** The polyline. */
	private PolyLine polyline;
	
	/** The duration. */
	private Metric duration;
	
	/** The distance. */
	private Metric distance;
	
	/**
	 * Gets the travel mode.
	 * 
	 * @return the travel mode
	 */
	public TravelMode getTravelMode() {
		return travelMode;
	}
	
	/**
	 * Sets the travel mode.
	 * 
	 * @param travelMode the new travel mode
	 */
	public void setTravelMode(TravelMode travelMode) {
		this.travelMode = travelMode;
	}
	
	/**
	 * Gets the start location.
	 * 
	 * @return the start location
	 */
	public GeoLocation getStartLocation() {
		return startLocation;
	}
	
	/**
	 * Sets the start location.
	 * 
	 * @param startLocation the new start location
	 */
	public void setStartLocation(GeoLocation startLocation) {
		this.startLocation = startLocation;
	}
	
	/**
	 * Gets the end location.
	 * 
	 * @return the end location
	 */
	public GeoLocation getEndLocation() {
		return endLocation;
	}
	
	/**
	 * Sets the end location.
	 * 
	 * @param endLocation the new end location
	 */
	public void setEndLocation(GeoLocation endLocation) {
		this.endLocation = endLocation;
	}
	
	/**
	 * Gets the polyline.
	 * 
	 * @return the polyline
	 */
	public PolyLine getPolyline() {
		return polyline;
	}
	
	/**
	 * Sets the polyline.
	 * 
	 * @param polyline the new polyline
	 */
	public void setPolyline(PolyLine polyline) {
		this.polyline = polyline;
	}
	
	/**
	 * Gets the duration.
	 * 
	 * @return the duration
	 */
	public Metric getDuration() {
		return duration;
	}
	
	/**
	 * Sets the duration.
	 * 
	 * @param duration the new duration
	 */
	public void setDuration(Metric duration) {
		this.duration = duration;
	}
	
	/**
	 * Gets the distance.
	 * 
	 * @return the distance
	 */
	public Metric getDistance() {
		return distance;
	}
	
	/**
	 * Sets the distance.
	 * 
	 * @param distance the new distance
	 */
	public void setDistance(Metric distance) {
		this.distance = distance;
	}
}
