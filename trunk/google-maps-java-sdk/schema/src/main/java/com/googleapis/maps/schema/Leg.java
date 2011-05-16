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
 * The Class Leg.
 */
public class Leg extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6887303607898118085L;

	/** The steps. */
	private List<Step> steps;
	
	/** The duration. */
	private Metric duration;
	
	/** The distance. */
	private Metric distance;
	
	/** The start location. */
	private GeoLocation startLocation;
	
	/** The end location. */
	private GeoLocation endLocation;
	
	/** The start address. */
	private String startAddress;
	
	/** The end address. */
	private String endAddress;
	
	/** The via waypoint. */
	private List<Waypoint> viaWaypoint;

	/**
	 * Gets the steps.
	 * 
	 * @return the steps
	 */
	public List<Step> getSteps() {
		return steps;
	}

	/**
	 * Sets the steps.
	 * 
	 * @param steps the new steps
	 */
	public void setSteps(List<Step> steps) {
		this.steps = steps;
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
	 * Gets the start address.
	 * 
	 * @return the start address
	 */
	public String getStartAddress() {
		return startAddress;
	}

	/**
	 * Sets the start address.
	 * 
	 * @param startAddress the new start address
	 */
	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	/**
	 * Gets the end address.
	 * 
	 * @return the end address
	 */
	public String getEndAddress() {
		return endAddress;
	}

	/**
	 * Sets the end address.
	 * 
	 * @param endAddress the new end address
	 */
	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}

	/**
	 * Gets the via waypoint.
	 * 
	 * @return the via waypoint
	 */
	public List<Waypoint> getViaWaypoint() {
		return viaWaypoint;
	}

	/**
	 * Sets the via waypoint.
	 * 
	 * @param viaWaypoint the new via waypoint
	 */
	public void setViaWaypoint(List<Waypoint> viaWaypoint) {
		this.viaWaypoint = viaWaypoint;
	}
}
