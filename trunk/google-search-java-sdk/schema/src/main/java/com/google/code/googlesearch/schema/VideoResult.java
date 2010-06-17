package com.google.code.googlesearch.schema;

import java.util.Date;

/**
 * The Interface VideoResult.
 */
public interface VideoResult extends SchemaEntity {

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
	 * Gets the published.
	 * 
	 * @return the published
	 */
	public Date getPublished();

	/**
	 * Sets the published.
	 * 
	 * @param published the new published
	 */
	public void setPublished(Date published);

	/**
	 * Gets the publisher.
	 * 
	 * @return the publisher
	 */
	public String getPublisher();

	/**
	 * Sets the publisher.
	 * 
	 * @param publisher the new publisher
	 */
	public void setPublisher(String publisher);

	/**
	 * Gets the duration.
	 * 
	 * @return the duration
	 */
	public int getDuration();

	/**
	 * Sets the duration.
	 * 
	 * @param duration the new duration
	 */
	public void setDuration(int duration);

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
	 * Gets the play url.
	 * 
	 * @return the play url
	 */
	public String getPlayUrl();

	/**
	 * Sets the play url.
	 * 
	 * @param playUrl the new play url
	 */
	public void setPlayUrl(String playUrl);

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
	 * Gets the view count.
	 * 
	 * @return the view count
	 */
	public int getViewCount();

	/**
	 * Sets the view count.
	 * 
	 * @param viewCount the new view count
	 */
	public void setViewCount(int viewCount);

	/**
	 * Gets the rating.
	 * 
	 * @return the rating
	 */
	public double getRating();

	/**
	 * Sets the rating.
	 * 
	 * @param rating the new rating
	 */
	public void setRating(double rating);
	
	/**
	 * Gets the video type.
	 * 
	 * @return the video type
	 */
	public VideoType getVideoType() ;
	
	/**
	 * Sets the video type.
	 * 
	 * @param videoType the new video type
	 */
	public void setVideoType(VideoType videoType);
}