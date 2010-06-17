/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.VideoSortOrder;
import com.google.code.googlesearch.schema.VideoResult;

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
