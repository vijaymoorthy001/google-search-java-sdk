package com.google.code.googlesearch.schema;

/**
 * The Interface ImageResult.
 */
public interface ImageResult extends SchemaEntity {

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle();

	/**
	 * Sets the title.
	 * 
	 * @param title the new title
	 */
	public void setTitle(String title);

	/**
	 * Gets the title no formatting.
	 * 
	 * @return the title no formatting
	 */
	public String getTitleNoFormatting();

	/**
	 * Sets the title no formatting.
	 * 
	 * @param titleNoFormatting the new title no formatting
	 */
	public void setTitleNoFormatting(String titleNoFormatting);

	/**
	 * Gets the unescaped url.
	 * 
	 * @return the unescaped url
	 */
	public String getUnescapedUrl();

	/**
	 * Sets the unescaped url.
	 * 
	 * @param unescapedUrl the new unescaped url
	 */
	public void setUnescapedUrl(String unescapedUrl);

	/**
	 * Gets the url.
	 * 
	 * @return the url
	 */
	public String getUrl();

	/**
	 * Sets the url.
	 * 
	 * @param url the new url
	 */
	public void setUrl(String url);

	/**
	 * Gets the visible url.
	 * 
	 * @return the visible url
	 */
	public String getVisibleUrl();

	/**
	 * Sets the visible url.
	 * 
	 * @param visibleUrl the new visible url
	 */
	public void setVisibleUrl(String visibleUrl);

	/**
	 * Gets the original context url.
	 * 
	 * @return the original context url
	 */
	public String getOriginalContextUrl();

	/**
	 * Sets the original context url.
	 * 
	 * @param originalContextUrl the new original context url
	 */
	public void setOriginalContextUrl(String originalContextUrl);

	/**
	 * Gets the width.
	 * 
	 * @return the width
	 */
	public int getWidth();

	/**
	 * Sets the width.
	 * 
	 * @param width the new width
	 */
	public void setWidth(int width);

	/**
	 * Gets the height.
	 * 
	 * @return the height
	 */
	public int getHeight();

	/**
	 * Sets the height.
	 * 
	 * @param height the new height
	 */
	public void setHeight(int height);

	/**
	 * Gets the tb width.
	 * 
	 * @return the tb width
	 */
	public int getTbWidth();

	/**
	 * Sets the tb width.
	 * 
	 * @param tbWidth the new tb width
	 */
	public void setTbWidth(int tbWidth);

	/**
	 * Gets the tb height.
	 * 
	 * @return the tb height
	 */
	public int getTbHeight();

	/**
	 * Sets the tb height.
	 * 
	 * @param tbHeight the new tb height
	 */
	public void setTbHeight(int tbHeight);

	/**
	 * Gets the tb url.
	 * 
	 * @return the tb url
	 */
	public String getTbUrl();

	/**
	 * Sets the tb url.
	 * 
	 * @param tbUrl the new tb url
	 */
	public void setTbUrl(String tbUrl);

	/**
	 * Gets the content.
	 * 
	 * @return the content
	 */
	public String getContent();

	/**
	 * Sets the content.
	 * 
	 * @param content the new content
	 */
	public void setContent(String content);

	/**
	 * Gets the content no formatting.
	 * 
	 * @return the content no formatting
	 */
	public String getContentNoFormatting();

	/**
	 * Sets the content no formatting.
	 * 
	 * @param contentNoFormatting the new content no formatting
	 */
	public void setContentNoFormatting(String contentNoFormatting);

	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
	public String getImageId();
	
	/**
	 * Sets the image id.
	 * 
	 * @param imageId the new image id
	 */
	public void setImageId(String imageId);
}