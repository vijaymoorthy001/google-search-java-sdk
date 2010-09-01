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
package com.googleapis.maps.services;

import com.googleapis.maps.schema.DirectionsResult;
import com.googleapis.maps.schema.GeoLocation;
import com.googleapis.maps.schema.Language;
import com.googleapis.maps.schema.RouteType;
import com.googleapis.maps.schema.TravelMode;
import com.googleapis.maps.schema.UnitSystem;

/**
 * The Interface DirectionsQuery.
 */
public interface DirectionsQuery extends GoogleMapsQuery<DirectionsResult> {
	
	/**
	 * With origin.
	 * 
	 * @param origin the origin
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withOrigin(String origin);
	
	/**
	 * With origin.
	 * 
	 * @param origin the origin
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withOrigin(GeoLocation origin);
	
	/**
	 * With destination.
	 * 
	 * @param destination the destination
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withDestination(String destination);
	
	/**
	 * With destination.
	 * 
	 * @param destination the destination
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withDestination(GeoLocation destination);
	
	/**
	 * With mode.
	 * 
	 * @param mode the mode
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withMode(TravelMode mode);
	
	/**
	 * With waypoints.
	 * 
	 * @param waypoints the waypoints
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withWaypoints(String... waypoints);
	
	/**
	 * With waypoints.
	 * 
	 * @param waypoints the waypoints
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withWaypoints(GeoLocation... waypoints);
	
	/**
	 * With alternatives.
	 * 
	 * @param alternatives the alternatives
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withAlternatives(boolean alternatives);
	
	/**
	 * With avoid.
	 * 
	 * @param avoid the avoid
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withAvoid(RouteType avoid);
	
	/**
	 * With units.
	 * 
	 * @param units the units
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withUnits(UnitSystem units);
	
	/**
	 * With language.
	 * 
	 * @param language the language
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withLanguage(Language language);
	
	/**
	 * With sensor.
	 * 
	 * @param sensor the sensor
	 * 
	 * @return the directions query
	 */
	public DirectionsQuery withSensor(boolean sensor);
}
