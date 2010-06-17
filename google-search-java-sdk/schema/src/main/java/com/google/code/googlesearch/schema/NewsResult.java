package com.google.code.googlesearch.schema;

import java.util.Date;
import java.util.List;

import com.google.code.googlesearch.schema.adapter.json.Image;
import com.google.code.googlesearch.schema.adapter.json.NewsStory;

/**
 * The Interface NewsResult.
 */
public interface NewsResult extends SchemaEntity {

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
	 * Gets the cluster url.
	 * 
	 * @return the cluster url
	 */
	public String getClusterUrl();

	/**
	 * Sets the cluster url.
	 * 
	 * @param clusterUrl the new cluster url
	 */
	public void setClusterUrl(String clusterUrl);

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
	 * Gets the location.
	 * 
	 * @return the location
	 */
	public String getLocation();

	/**
	 * Sets the location.
	 * 
	 * @param location the new location
	 */
	public void setLocation(String location);

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

	/**
	 * Gets the related stories.
	 * 
	 * @return the related stories
	 */
	public List<NewsStory> getRelatedStories();

	/**
	 * Sets the related stories.
	 * 
	 * @param relatedStories the new related stories
	 */
	public void setRelatedStories(List<NewsStory> relatedStories);

	/**
	 * Gets the image.
	 * 
	 * @return the image
	 */
	public Image getImage();

	/**
	 * Sets the image.
	 * 
	 * @param image the new image
	 */
	public void setImage(Image image);

	/**
	 * Gets the language.
	 * 
	 * @return the language
	 */
	public String getLanguage();

	/**
	 * Sets the language.
	 * 
	 * @param language the new language
	 */
	public void setLanguage(String language);

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
	 * Gets the signed redirect url.
	 * 
	 * @return the signed redirect url
	 */
	public String getSignedRedirectUrl();
	
	/**
	 * Sets the signed redirect url.
	 * 
	 * @param signedRedirectUrl the new signed redirect url
	 */
	public void setSignedRedirectUrl(String signedRedirectUrl);
}