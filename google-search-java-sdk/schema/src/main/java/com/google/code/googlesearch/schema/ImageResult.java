package com.google.code.googlesearch.schema;

public interface ImageResult extends SchemaEntity {

	/**
	 * @return the title
	 */
	public String getTitle();

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title);

	/**
	 * @return the titleNoFormatting
	 */
	public String getTitleNoFormatting();

	/**
	 * @param titleNoFormatting the titleNoFormatting to set
	 */
	public void setTitleNoFormatting(String titleNoFormatting);

	/**
	 * @return the unescapedUrl
	 */
	public String getUnescapedUrl();

	/**
	 * @param unescapedUrl the unescapedUrl to set
	 */
	public void setUnescapedUrl(String unescapedUrl);

	/**
	 * @return the url
	 */
	public String getUrl();

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url);

	/**
	 * @return the visibleUrl
	 */
	public String getVisibleUrl();

	/**
	 * @param visibleUrl the visibleUrl to set
	 */
	public void setVisibleUrl(String visibleUrl);

	/**
	 * @return the originalContextUrl
	 */
	public String getOriginalContextUrl();

	/**
	 * @param originalContextUrl the originalContextUrl to set
	 */
	public void setOriginalContextUrl(String originalContextUrl);

	/**
	 * @return the width
	 */
	public int getWidth();

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width);

	/**
	 * @return the height
	 */
	public int getHeight();

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height);

	/**
	 * @return the tbWidth
	 */
	public int getTbWidth();

	/**
	 * @param tbWidth the tbWidth to set
	 */
	public void setTbWidth(int tbWidth);

	/**
	 * @return the tbHeight
	 */
	public int getTbHeight();

	/**
	 * @param tbHeight the tbHeight to set
	 */
	public void setTbHeight(int tbHeight);

	/**
	 * @return the tbUrl
	 */
	public String getTbUrl();

	/**
	 * @param tbUrl the tbUrl to set
	 */
	public void setTbUrl(String tbUrl);

	/**
	 * @return the content
	 */
	public String getContent();

	/**
	 * @param content the content to set
	 */
	public void setContent(String content);

	/**
	 * @return the contentNoFormatting
	 */
	public String getContentNoFormatting();

	/**
	 * @param contentNoFormatting the contentNoFormatting to set
	 */
	public void setContentNoFormatting(String contentNoFormatting);

	/**
	 * @return the imageId
	 */
	public String getImageId();
	
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(String imageId);
}