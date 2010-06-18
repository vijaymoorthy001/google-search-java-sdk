/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import com.google.code.googlesearch.client.ImageSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.ImageColor;
import com.google.code.googlesearch.client.enumeration.ImageColorization;
import com.google.code.googlesearch.client.enumeration.ImageFileType;
import com.google.code.googlesearch.client.enumeration.ImageRights;
import com.google.code.googlesearch.client.enumeration.ImageSize;
import com.google.code.googlesearch.client.enumeration.ImageType;
import com.google.code.googlesearch.client.enumeration.SafetyLevel;
import com.google.code.googlesearch.schema.ImageResult;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * The Class ImageSearchQueryImpl.
 */
public class ImageSearchQueryImpl extends BaseGoogleSearchApiQuery<ImageResult> implements
		ImageSearchQuery {
	
	/**
	 * Instantiates a new image search query impl.
	 * 
	 * @param applicationId the application id
	 */
	public ImageSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_IMAGE_URL);
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.ImageSearchQuery#withFileType(com.google.code.googlesearch.client.enumeration.ImageFileType)
	 */
	@Override
	public ImageSearchQuery withFileType(ImageFileType fileType) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_FILE_TYPE, fileType);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.ImageSearchQuery#withImageColor(com.google.code.googlesearch.client.enumeration.ImageColor)
	 */
	@Override
	public ImageSearchQuery withImageColor(ImageColor color) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_COLOR, color);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.ImageSearchQuery#withImageColorization(com.google.code.googlesearch.client.enumeration.ImageColorization)
	 */
	@Override
	public ImageSearchQuery withImageColorization(ImageColorization colorization) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_COLORIZATION, colorization);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.ImageSearchQuery#withImageRights(com.google.code.googlesearch.client.enumeration.ImageRights)
	 */
	@Override
	public ImageSearchQuery withImageRights(ImageRights rights) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_RIGHTS, rights);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.ImageSearchQuery#withImageSize(com.google.code.googlesearch.client.enumeration.ImageSize)
	 */
	@Override
	public ImageSearchQuery withImageSize(ImageSize imgsz) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_SIZE, imgsz);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.ImageSearchQuery#withImageType(com.google.code.googlesearch.client.enumeration.ImageType)
	 */
	@Override
	public ImageSearchQuery withImageType(ImageType type) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_TYPE, type);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.ImageSearchQuery#withSafetyLevel(com.google.code.googlesearch.client.enumeration.SafetyLevel)
	 */
	@Override
	public ImageSearchQuery withSafetyLevel(SafetyLevel safe) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SAFETY_LEVEL, safe);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected ImageResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, ImageResult.class);
	}
}
