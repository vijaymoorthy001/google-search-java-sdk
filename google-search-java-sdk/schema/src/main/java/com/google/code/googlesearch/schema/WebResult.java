package com.google.code.googlesearch.schema;

/**
 * The Interface WebResult.
 */
public interface WebResult extends SchemaEntity {

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
	 * Gets the cache url.
	 * 
	 * @return the cache url
	 */
	public String getCacheUrl();

	/**
	 * Sets the cache url.
	 * 
	 * @param cacheUrl the new cache url
	 */
	public void setCacheUrl(String cacheUrl);

}