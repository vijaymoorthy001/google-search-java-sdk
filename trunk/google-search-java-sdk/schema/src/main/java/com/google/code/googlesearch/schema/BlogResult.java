package com.google.code.googlesearch.schema;

import java.util.Date;

public interface BlogResult extends SchemaEntity {

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
	 * @return the postUrl
	 */
	public String getPostUrl();

	/**
	 * @param postUrl the postUrl to set
	 */
	public void setPostUrl(String postUrl);

	/**
	 * @return the content
	 */
	public String getContent();

	/**
	 * @param content the content to set
	 */
	public void setContent(String content);

	/**
	 * @return the author
	 */
	public String getAuthor();

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author);

	/**
	 * @return the blogUrl
	 */
	public String getBlogUrl();

	/**
	 * @param blogUrl the blogUrl to set
	 */
	public void setBlogUrl(String blogUrl);

	/**
	 * @return the publishedDate
	 */
	public Date getPublishedDate();

	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(Date publishedDate);

}