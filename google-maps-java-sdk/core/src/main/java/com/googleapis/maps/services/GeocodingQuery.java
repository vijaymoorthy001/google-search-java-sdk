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

import com.googleapis.maps.schema.Bounds;
import com.googleapis.maps.schema.Region;
import com.googleapis.maps.schema.GeoLocation;
import com.googleapis.maps.schema.GeocodingResult;
import com.googleapis.maps.schema.Language;

/**
 * The Interface GeocodingQuery.
 */
public interface GeocodingQuery extends GoogleMapsQuery<GeocodingResult> {
	
	/**
	 * With address.
	 * 
	 * @param address the address
	 * 
	 * @return the geocoding query
	 */
	public GeocodingQuery withAddress(String address);
	
	/**
	 * With address.
	 * 
	 * @param address the address
	 * 
	 * @return the geocoding query
	 */
	public GeocodingQuery withAddress(GeoLocation address);
	
	/**
	 * With bounds.
	 * 
	 * @param bounds the bounds
	 * 
	 * @return the geocoding query
	 */
	public GeocodingQuery withBounds(Bounds bounds);
	
	/**
	 * With region.
	 * 
	 * @param region the region
	 * 
	 * @return the geocoding query
	 */
	public GeocodingQuery withRegion(Region region);
	
	/**
	 * With language.
	 * 
	 * @param language the language
	 * 
	 * @return the geocoding query
	 */
	public GeocodingQuery withLanguage(Language language);
	
	/**
	 * With sensor.
	 * 
	 * @param sensor the sensor
	 * 
	 * @return the geocoding query
	 */
	public GeocodingQuery withSensor(boolean sensor);
}
