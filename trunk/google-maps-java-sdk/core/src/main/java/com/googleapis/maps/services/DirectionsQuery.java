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
import com.googleapis.maps.schema.RouteType;
import com.googleapis.maps.schema.TravelMode;
import com.googleapis.maps.schema.UnitSystem;
import com.googleapis.maps.services.enumeration.Language;

/**
 * The Interface DetectLanguageQuery.
 */
public interface DirectionsQuery extends GoogleMapsQuery<DirectionsResult> {
	public DirectionsQuery withOrigin(String address);
	public DirectionsQuery withOrigin(GeoLocation address);
	public DirectionsQuery withDestination(String address);
	public DirectionsQuery withDestination(GeoLocation address);
	public DirectionsQuery withMode(TravelMode mode);
	public DirectionsQuery withWaypoint(String address);
	public DirectionsQuery withWaypoint(GeoLocation address);
	public DirectionsQuery withAlternatives(boolean alternatives);
	public DirectionsQuery withAvoid(RouteType avoid);
	public DirectionsQuery withUnits(UnitSystem units);
	public DirectionsQuery withLanguage(Language language);
	public DirectionsQuery withSensor(boolean sensor);
}
