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

import com.googleapis.maps.schema.GeoLocation;
import com.googleapis.maps.schema.PlacesResult;

/**
 * The Interface PlacesQuery.
 */
public interface PlacesQuery extends GoogleMapsQuery<PlacesResult> {
	
	/**
	 * With location.
	 * 
	 * @param location the location
	 * 
	 * @return the places query
	 */
	public PlacesQuery withLocation(GeoLocation location);
	
	/**
	 * With radius.
	 * 
	 * @param radius the radius
	 * 
	 * @return the places query
	 */
	public PlacesQuery withRadius(double radius);
	
	/**
	 * With client.
	 * 
	 * @param client the client
	 * 
	 * @return the places query
	 */
	public PlacesQuery withClient(String client);
	
	/**
	 * With private key.
	 * 
	 * @param privateKey the private key
	 * 
	 * @return the places query
	 */
	public PlacesQuery withPrivateKey(String privateKey);
	
	/**
	 * With sensor.
	 * 
	 * @param sensor the sensor
	 * 
	 * @return the places query
	 */
	public PlacesQuery withSensor(boolean sensor);
}
