/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.LocalSearchType;
import com.google.code.googlesearch.schema.LocalResult;

/**
 * @author nmukhtar
 *
 */
public interface LocalSearchQuery extends GoogleSearchQuery<LocalResult> {
	public LocalSearchQuery withLocation(double latitude, double longitude);
	public LocalSearchQuery withBoundingBox(double x, double y);
	public LocalSearchQuery withLocalSearchType(LocalSearchType type);


}
