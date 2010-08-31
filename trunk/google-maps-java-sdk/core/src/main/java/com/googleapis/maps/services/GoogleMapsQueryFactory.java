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

import com.googleapis.maps.services.impl.DirectionsQueryImpl;
import com.googleapis.maps.services.impl.ElevationQueryImpl;
import com.googleapis.maps.services.impl.GeocodingQueryImpl;
import com.googleapis.maps.services.impl.PlacesQueryImpl;



/**
 * A factory for creating GoogleSearchQuery objects.
 */
public class GoogleMapsQueryFactory {

    /** The application key. */
    private String applicationKey;

    /**
     * Instantiates a new google search query factory.
     * 
     * @param applicationKey the application key
     */
	private GoogleMapsQueryFactory(String applicationKey) {
        this.applicationKey = applicationKey;
    }
	
    /**
     * New instance.
     * 
     * @param applicationKey the application key
     * 
     * @return the google search query factory
     */
    public static GoogleMapsQueryFactory newInstance(String applicationKey) {
        return new GoogleMapsQueryFactory(applicationKey);
    }
    
    /**
     * New detect language query.
     * 
     * @return the detect language query
     */
    public GeocodingQuery newGeocodingQuery() {
    	return new GeocodingQueryImpl(applicationKey);
    }
    
    /**
     * New detect language query.
     * 
     * @return the detect language query
     */
    public DirectionsQuery newDirectionsQuery() {
    	return new DirectionsQueryImpl(applicationKey);
    }
    
    /**
     * New detect language query.
     * 
     * @return the detect language query
     */
    public ElevationQuery newElevationQuery() {
    	return new ElevationQueryImpl(applicationKey);
    }
    
    /**
     * New detect language query.
     * 
     * @return the detect language query
     */
    public PlacesQuery newPlacesQuery() {
    	return new PlacesQueryImpl(applicationKey);
    }
}
