package com.google.code.googlesearch.schema;

import java.util.Date;
import java.util.List;

import com.google.code.googlesearch.schema.adapter.json.Image;
import com.google.code.googlesearch.schema.adapter.json.NewsStory;

public interface NewsResult extends SchemaEntity {

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
	 * @return the clusterUrl
	 */
	public String getClusterUrl();

	/**
	 * @param clusterUrl the clusterUrl to set
	 */
	public void setClusterUrl(String clusterUrl);

	/**
	 * @return the content
	 */
	public String getContent();

	/**
	 * @param content the content to set
	 */
	public void setContent(String content);

	/**
	 * @return the publisher
	 */
	public String getPublisher();

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher);

	/**
	 * @return the location
	 */
	public String getLocation();

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location);

	/**
	 * @return the publishedDate
	 */
	public Date getPublishedDate();

	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(Date publishedDate);

	/**
	 * @return the relatedStories
	 */
	public List<NewsStory> getRelatedStories();

	/**
	 * @param relatedStories the relatedStories to set
	 */
	public void setRelatedStories(List<NewsStory> relatedStories);

	/**
	 * @return the image
	 */
	public Image getImage();

	/**
	 * @param image the image to set
	 */
	public void setImage(Image image);

	/**
	 * @return the language
	 */
	public String getLanguage();

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language);

	/**
	 * @return the author
	 */
	public String getAuthor();

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author);

}