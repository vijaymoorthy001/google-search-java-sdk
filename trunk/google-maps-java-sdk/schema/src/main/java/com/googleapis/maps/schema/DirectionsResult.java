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
 * The Class DirectionsResult.
 */
public class DirectionsResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	
	/** The summary. */
	private String summary;
	
	/** The legs. */
	private List<Leg> legs;
	
	/** The copyrights. */
	private String copyrights;
	
	/** The overview polyline. */
	private PolyLine overviewPolyline;
	
	/** The warnings. */
	private List<String> warnings;
	
	/** The waypoint order. */
	private List<Integer> waypointOrder;
	
	/**
	 * Gets the summary.
	 * 
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	
	/**
	 * Sets the summary.
	 * 
	 * @param summary the new summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	/**
	 * Gets the legs.
	 * 
	 * @return the legs
	 */
	public List<Leg> getLegs() {
		return legs;
	}
	
	/**
	 * Sets the legs.
	 * 
	 * @param legs the new legs
	 */
	public void setLegs(List<Leg> legs) {
		this.legs = legs;
	}
	
	/**
	 * Gets the copyrights.
	 * 
	 * @return the copyrights
	 */
	public String getCopyrights() {
		return copyrights;
	}
	
	/**
	 * Sets the copyrights.
	 * 
	 * @param copyrights the new copyrights
	 */
	public void setCopyrights(String copyrights) {
		this.copyrights = copyrights;
	}
	
	/**
	 * Gets the overview polyline.
	 * 
	 * @return the overview polyline
	 */
	public PolyLine getOverviewPolyline() {
		return overviewPolyline;
	}
	
	/**
	 * Sets the overview polyline.
	 * 
	 * @param overviewPolyline the new overview polyline
	 */
	public void setOverviewPolyline(PolyLine overviewPolyline) {
		this.overviewPolyline = overviewPolyline;
	}
	
	/**
	 * Gets the warnings.
	 * 
	 * @return the warnings
	 */
	public List<String> getWarnings() {
		return warnings;
	}
	
	/**
	 * Sets the warnings.
	 * 
	 * @param warnings the new warnings
	 */
	public void setWarnings(List<String> warnings) {
		this.warnings = warnings;
	}
	
	/**
	 * Gets the waypoint order.
	 * 
	 * @return the waypoint order
	 */
	public List<Integer> getWaypointOrder() {
		return waypointOrder;
	}
	
	/**
	 * Sets the waypoint order.
	 * 
	 * @param waypointOrder the new waypoint order
	 */
	public void setWaypointOrder(List<Integer> waypointOrder) {
		this.waypointOrder = waypointOrder;
	}
}
