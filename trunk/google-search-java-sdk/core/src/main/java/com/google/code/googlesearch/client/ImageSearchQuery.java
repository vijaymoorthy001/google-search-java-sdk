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
 * @author nmukhtar
 *
 */
public interface ImageSearchQuery extends GoogleSearchQuery<ImageResult> {
	public ImageSearchQuery withSafetyLevel(SafetyLevel safe);
	public ImageSearchQuery withImageSize(ImageSize imgsz);
	public ImageSearchQuery withImageColorization(ImageColorization colorization);
	public ImageSearchQuery withImageColor(ImageColor color);
	public ImageSearchQuery withImageType(ImageType type);
	public ImageSearchQuery withFileType(ImageFileType fileType);
	public ImageSearchQuery withImageRights(ImageRights rights);
}
