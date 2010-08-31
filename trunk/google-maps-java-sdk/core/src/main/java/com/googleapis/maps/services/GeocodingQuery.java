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
import com.googleapis.maps.schema.GeoLocation;
import com.googleapis.maps.schema.GeocodingResult;
import com.googleapis.maps.services.enumeration.CCTLD;
import com.googleapis.maps.services.enumeration.Language;

/**
 * The Interface DetectLanguageQuery.
 */
public interface GeocodingQuery extends GoogleMapsQuery<GeocodingResult> {
	public GeocodingQuery withAddress(String address);
	public GeocodingQuery withAddress(GeoLocation address);
	public GeocodingQuery withBounds(Bounds bounds);
	public GeocodingQuery withRegion(CCTLD region);
	public GeocodingQuery withLanguage(Language language);
	public GeocodingQuery withSensor(boolean sensor);
}
