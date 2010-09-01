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
 * The Class PolyLine.
 */
public class PolyLine extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7127570898464442391L;
	
	/** The points. */
	private String points;
	
	/** The levels. */
	private String levels;
	
	/**
	 * Gets the points.
	 * 
	 * @return the points
	 */
	public String getPoints() {
		return points;
	}
	
	/**
	 * Sets the points.
	 * 
	 * @param points the new points
	 */
	public void setPoints(String points) {
		this.points = points;
	}
	
	/**
	 * Gets the levels.
	 * 
	 * @return the levels
	 */
	public String getLevels() {
		return levels;
	}
	
	/**
	 * Sets the levels.
	 * 
	 * @param levels the new levels
	 */
	public void setLevels(String levels) {
		this.levels = levels;
	}
}
