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
public class DirectionsResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7595223844163364948L;
	
	private String summary;
	private List<Leg> legs;
	private String copyrights;
	private PolyLine overviewPolyline;
	private List<String> warnings;
	private List<Integer> waypointOrder;
	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * @return the legs
	 */
	public List<Leg> getLegs() {
		return legs;
	}
	/**
	 * @param legs the legs to set
	 */
	public void setLegs(List<Leg> legs) {
		this.legs = legs;
	}
	/**
	 * @return the copyrights
	 */
	public String getCopyrights() {
		return copyrights;
	}
	/**
	 * @param copyrights the copyrights to set
	 */
	public void setCopyrights(String copyrights) {
		this.copyrights = copyrights;
	}
	/**
	 * @return the overviewPolyline
	 */
	public PolyLine getOverviewPolyline() {
		return overviewPolyline;
	}
	/**
	 * @param overviewPolyline the overviewPolyline to set
	 */
	public void setOverviewPolyline(PolyLine overviewPolyline) {
		this.overviewPolyline = overviewPolyline;
	}
	/**
	 * @return the warnings
	 */
	public List<String> getWarnings() {
		return warnings;
	}
	/**
	 * @param warnings the warnings to set
	 */
	public void setWarnings(List<String> warnings) {
		this.warnings = warnings;
	}
	/**
	 * @return the waypointOrder
	 */
	public List<Integer> getWaypointOrder() {
		return waypointOrder;
	}
	/**
	 * @param waypointOrder the waypointOrder to set
	 */
	public void setWaypointOrder(List<Integer> waypointOrder) {
		this.waypointOrder = waypointOrder;
	}
}
