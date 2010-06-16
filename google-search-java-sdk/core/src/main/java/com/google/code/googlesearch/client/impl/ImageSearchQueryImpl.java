/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.ImageColor;
import com.google.code.googlesearch.client.ImageColorization;
import com.google.code.googlesearch.client.ImageFileType;
import com.google.code.googlesearch.client.ImageRights;
import com.google.code.googlesearch.client.ImageSearchQuery;
import com.google.code.googlesearch.client.ImageSize;
import com.google.code.googlesearch.client.ImageType;
import com.google.code.googlesearch.client.SafetyLevel;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.schema.ImageResult;
import com.google.code.googlesearch.schema.adapter.json.ImageResultImpl;

/**
 * @author nmukhtar
 *
 */
public class ImageSearchQueryImpl extends BaseGoogleSearchApiQuery<ImageResult> implements
		ImageSearchQuery {
	
	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public ImageSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_IMAGE_URL);
	}


	@Override
	public ImageSearchQuery withFileType(ImageFileType fileType) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_FILE_TYPE, fileType);
		return this;
	}


	@Override
	public ImageSearchQuery withImageColor(ImageColor color) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_COLOR, color);
		return this;
	}


	@Override
	public ImageSearchQuery withImageColorization(ImageColorization colorization) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_COLORIZATION, colorization);
		return this;
	}


	@Override
	public ImageSearchQuery withImageRights(ImageRights rights) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_RIGHTS, rights);
		return this;
	}


	@Override
	public ImageSearchQuery withImageSize(ImageSize imgsz) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_SIZE, imgsz);
		return this;
	}


	@Override
	public ImageSearchQuery withImageType(ImageType type) {
		apiUrlBuilder.withParameterEnum(ParameterNames.IMAGE_TYPE, type);
		return this;
	}


	@Override
	public ImageSearchQuery withSafetyLevel(SafetyLevel safe) {
		apiUrlBuilder.withParameterEnum(ParameterNames.SAFETY_LEVEL, safe);
		return this;
	}
	
	@Override
	protected ImageResult unmarshall(JSONObject json) {
		ImageResultImpl result = new ImageResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
