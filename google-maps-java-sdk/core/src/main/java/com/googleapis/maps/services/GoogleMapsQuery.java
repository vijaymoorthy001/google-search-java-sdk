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

import java.util.Locale;

import com.googleapis.maps.common.PagedList;



/**
 * The Interface GoogleSearchQuery.
 */
public interface GoogleMapsQuery<T> extends GoogleMapsAuthenticationClient {
	
	/**
	 * With query.
	 * 
	 * @param query the query
	 * 
	 * @return the google search query< t>
	 */
	public GoogleMapsQuery<T> withQuery(String query);
	
	/**
	 * With locale.
	 * 
	 * @param locale the locale
	 * 
	 * @return the google search query< t>
	 */
	public GoogleMapsQuery<T> withLocale(Locale locale);
	
	/**
	 * Single result.
	 * 
	 * @return the t
	 */
	public T singleResult();

	/**
	 * List.
	 * 
	 * @return the paged list< t>
	 */
	public PagedList<T> list();
	
	/**
	 * Adds the resonse handler.
	 * 
	 * @param handler the handler
	 */
	public void addResonseHandler(AsyncResponseHandler<PagedList<T>> handler);
	
	/**
	 * Reset.
	 */
	public void reset();
}
