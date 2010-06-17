/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.LocalSearchType;
import com.google.code.googlesearch.schema.LocalResult;

/**
 * The Interface LocalSearchQuery.
 */
public interface LocalSearchQuery extends GoogleSearchQuery<LocalResult> {
	
	/**
	 * With location.
	 * 
	 * @param latitude the latitude
	 * @param longitude the longitude
	 * 
	 * @return the local search query
	 */
	public LocalSearchQuery withLocation(double latitude, double longitude);
	
	/**
	 * With bounding box.
	 * 
	 * @param x the x
	 * @param y the y
	 * 
	 * @return the local search query
	 */
	public LocalSearchQuery withBoundingBox(double x, double y);
	
	/**
	 * With local search type.
	 * 
	 * @param type the type
	 * 
	 * @return the local search query
	 */
	public LocalSearchQuery withLocalSearchType(LocalSearchType type);


}
