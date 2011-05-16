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
package com.googleapis.maps.services;

import com.googleapis.maps.schema.DistanceMatrixResult;
import com.googleapis.maps.schema.GeoLocation;
import com.googleapis.maps.schema.Language;
import com.googleapis.maps.schema.RouteType;
import com.googleapis.maps.schema.TravelMode;
import com.googleapis.maps.schema.UnitSystem;

/**
 * The Interface DistanceMatrixQuery.
 */
public interface DistanceMatrixQuery extends GoogleMapsQuery<DistanceMatrixResult> {
	
	/**
	 * With origins.
	 * 
	 * @param origins the origins
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withOrigins(String... origins);
	
	/**
	 * With origins.
	 * 
	 * @param origins the origins
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withOrigins(GeoLocation... origins);
	
	/**
	 * With destinations.
	 * 
	 * @param destinations the destinations
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withDestinations(String... destinations);
	
	/**
	 * With destinations.
	 * 
	 * @param destinations the destinations
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withDestinations(GeoLocation... destinations);
	
	/**
	 * With mode.
	 * 
	 * @param mode the mode
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withMode(TravelMode mode);
	
	/**
	 * With waypoints.
	 * 
	 * @param waypoints the waypoints
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withWaypoints(String... waypoints);
	
	/**
	 * With waypoints.
	 * 
	 * @param waypoints the waypoints
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withWaypoints(GeoLocation... waypoints);
	
	/**
	 * With alternatives.
	 * 
	 * @param alternatives the alternatives
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withAlternatives(boolean alternatives);
	
	/**
	 * With avoid.
	 * 
	 * @param avoid the avoid
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withAvoid(RouteType avoid);
	
	/**
	 * With units.
	 * 
	 * @param units the units
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withUnits(UnitSystem units);
	
	/**
	 * With language.
	 * 
	 * @param language the language
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withLanguage(Language language);
	
	/**
	 * With sensor.
	 * 
	 * @param sensor the sensor
	 * 
	 * @return the distance matrix query
	 */
	public DistanceMatrixQuery withSensor(boolean sensor);
}
