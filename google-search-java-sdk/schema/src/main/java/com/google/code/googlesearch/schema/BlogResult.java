package com.google.code.googlesearch.schema;

import java.util.Date;

/**
 * The Interface BlogResult.
 */
public interface BlogResult extends SchemaEntity {

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
	 * Gets the post url.
	 * 
	 * @return the post url
	 */
	public String getPostUrl();

	/**
	 * Sets the post url.
	 * 
	 * @param postUrl the new post url
	 */
	public void setPostUrl(String postUrl);

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
	 * Gets the author.
	 * 
	 * @return the author
	 */
	public String getAuthor();

	/**
	 * Sets the author.
	 * 
	 * @param author the new author
	 */
	public void setAuthor(String author);

	/**
	 * Gets the blog url.
	 * 
	 * @return the blog url
	 */
	public String getBlogUrl();

	/**
	 * Sets the blog url.
	 * 
	 * @param blogUrl the new blog url
	 */
	public void setBlogUrl(String blogUrl);

	/**
	 * Gets the published date.
	 * 
	 * @return the published date
	 */
	public Date getPublishedDate();

	/**
	 * Sets the published date.
	 * 
	 * @param publishedDate the new published date
	 */
	public void setPublishedDate(Date publishedDate);

}