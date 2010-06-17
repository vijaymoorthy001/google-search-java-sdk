/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.ImageColor;
import com.google.code.googlesearch.client.enumeration.ImageColorization;
import com.google.code.googlesearch.client.enumeration.ImageFileType;
import com.google.code.googlesearch.client.enumeration.ImageRights;
import com.google.code.googlesearch.client.enumeration.ImageSize;
import com.google.code.googlesearch.client.enumeration.ImageType;
import com.google.code.googlesearch.client.enumeration.SafetyLevel;
import com.google.code.googlesearch.schema.ImageResult;

/**
 * The Interface ImageSearchQuery.
 */
public interface ImageSearchQuery extends GoogleSearchQuery<ImageResult> {
	
	/**
	 * With safety level.
	 * 
	 * @param safe the safe
	 * 
	 * @return the image search query
	 */
	public ImageSearchQuery withSafetyLevel(SafetyLevel safe);
	
	/**
	 * With image size.
	 * 
	 * @param imgsz the imgsz
	 * 
	 * @return the image search query
	 */
	public ImageSearchQuery withImageSize(ImageSize imgsz);
	
	/**
	 * With image colorization.
	 * 
	 * @param colorization the colorization
	 * 
	 * @return the image search query
	 */
	public ImageSearchQuery withImageColorization(ImageColorization colorization);
	
	/**
	 * With image color.
	 * 
	 * @param color the color
	 * 
	 * @return the image search query
	 */
	public ImageSearchQuery withImageColor(ImageColor color);
	
	/**
	 * With image type.
	 * 
	 * @param type the type
	 * 
	 * @return the image search query
	 */
	public ImageSearchQuery withImageType(ImageType type);
	
	/**
	 * With file type.
	 * 
	 * @param fileType the file type
	 * 
	 * @return the image search query
	 */
	public ImageSearchQuery withFileType(ImageFileType fileType);
	
	/**
	 * With image rights.
	 * 
	 * @param rights the rights
	 * 
	 * @return the image search query
	 */
	public ImageSearchQuery withImageRights(ImageRights rights);
}
