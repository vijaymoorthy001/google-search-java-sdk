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
package com.googleapis.maps.services.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.googleapis.maps.schema.DirectionsResult;
import com.googleapis.maps.schema.GeoLocation;
import com.googleapis.maps.schema.RouteType;
import com.googleapis.maps.schema.TravelMode;
import com.googleapis.maps.schema.UnitSystem;
import com.googleapis.maps.services.DirectionsQuery;
import com.googleapis.maps.services.constant.GoogleMapsApiUrls;
import com.googleapis.maps.services.enumeration.Language;

/**
 * The Class DetectLanguageQueryImpl.
 */
public class DirectionsQueryImpl extends BaseGoogleMapsApiQuery<DirectionsResult> implements
	DirectionsQuery {
	
	/**
	 * Instantiates a new detect language query impl.
	 * 
	 * @param applicationId the application id
	 */
	public DirectionsQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleMapsApiUrls.DIRECTIONS_URL);
	}

	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected DirectionsResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, DirectionsResult.class);
	}


	@Override
	public DirectionsQuery withAlternatives(boolean alternatives) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withAvoid(RouteType avoid) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withDestination(String address) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withDestination(GeoLocation address) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withLanguage(Language language) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withMode(TravelMode mode) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withOrigin(String address) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withOrigin(GeoLocation address) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withSensor(boolean sensor) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withUnits(UnitSystem units) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withWaypoint(String address) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DirectionsQuery withWaypoint(GeoLocation address) {
		// TODO Auto-generated method stub
		return null;
	}
}
