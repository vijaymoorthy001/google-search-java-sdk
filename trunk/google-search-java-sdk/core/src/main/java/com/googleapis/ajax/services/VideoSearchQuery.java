/**
 * 
 */
package com.googleapis.ajax.services;

import com.googleapis.ajax.schema.VideoResult;
import com.googleapis.ajax.services.enumeration.VideoSortOrder;

/**
 * The Interface VideoSearchQuery.
 */
public interface VideoSearchQuery extends GoogleSearchQuery<VideoResult> {
	
	/**
	 * With order.
	 * 
	 * @param order the order
	 * 
	 * @return the video search query
	 */
	public VideoSearchQuery withOrder(VideoSortOrder order);

}
