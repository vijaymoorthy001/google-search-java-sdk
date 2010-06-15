package com.google.code.googlesearch.schema;

import java.util.Date;

public interface VideoResult extends SchemaEntity {

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
	 * @return the content
	 */
	public String getContent();

	/**
	 * @param content the content to set
	 */
	public void setContent(String content);

	/**
	 * @return the url
	 */
	public String getUrl();

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url);

	/**
	 * @return the published
	 */
	public Date getPublished();

	/**
	 * @param published the published to set
	 */
	public void setPublished(Date published);

	/**
	 * @return the publisher
	 */
	public String getPublisher();

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher);

	/**
	 * @return the duration
	 */
	public int getDuration();

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration);

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
	 * @return the playUrl
	 */
	public String getPlayUrl();

	/**
	 * @param playUrl the playUrl to set
	 */
	public void setPlayUrl(String playUrl);

	/**
	 * @return the author
	 */
	public String getAuthor();

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author);

	/**
	 * @return the viewCount
	 */
	public int getViewCount();

	/**
	 * @param viewCount the viewCount to set
	 */
	public void setViewCount(int viewCount);

	/**
	 * @return the rating
	 */
	public int getRating();

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating);

}