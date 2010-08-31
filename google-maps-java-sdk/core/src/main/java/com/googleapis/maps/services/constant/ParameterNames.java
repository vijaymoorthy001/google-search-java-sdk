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
package com.googleapis.maps.services.constant;

/**
 * The Interface ParameterNames.
 */
public interface ParameterNames {
	
	// Geocoding URL Arguments
	public static final String ADDRESS = "address";
	public static final String LATLNG = "latlng";
	public static final String BOUNDS = "bounds";
	public static final String REGION = "region";
	public static final String LANGUAGE = "language";
	public static final String SENSOR = "sensor";
	
	// Directions URL Arguments
	public static final String ORIGIN = "origin";
	public static final String DESTINATION = "destination";
	public static final String MODE = "mode";
	public static final String WAYPOINTS = "waypoints";
	public static final String ALTERNATIVES = "alternatives";
	public static final String AVOID = "avoid";
	public static final String UNITS = "units";
	
	// Elevation URL Arguments
	public static final String LOCATIONS = "locations";
	public static final String PATH = "path";
	public static final String SAMPLES = "samples";
	
	// Place URL Arguments
	public static final String LOCATION = "location";
	public static final String RADIUS = "radius";
	public static final String CLIENT = "client";
	public static final String SIGNATURE = "signature";
}
