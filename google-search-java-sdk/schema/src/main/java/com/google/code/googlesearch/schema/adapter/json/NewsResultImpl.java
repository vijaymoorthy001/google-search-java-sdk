/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import java.util.Date;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.NewsResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class NewsResultImpl extends BaseJsonAdapter implements NewsResult, Adaptable<NewsResult, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8463967785278054587L;
	
	private String title;
	private String titleNoFormatting;
	private String unescapedUrl;
	private String url;
	private String clusterUrl;
	private String content;
	private String publisher;
	private String location;
	private Date publishedDate;
	private List<NewsStory> relatedStories;
	private Image image;
	private String language;
	private String author;
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the titleNoFormatting
	 */
	public String getTitleNoFormatting() {
		return titleNoFormatting;
	}
	/**
	 * @param titleNoFormatting the titleNoFormatting to set
	 */
	public void setTitleNoFormatting(String titleNoFormatting) {
		this.titleNoFormatting = titleNoFormatting;
	}
	/**
	 * @return the unescapedUrl
	 */
	public String getUnescapedUrl() {
		return unescapedUrl;
	}
	/**
	 * @param unescapedUrl the unescapedUrl to set
	 */
	public void setUnescapedUrl(String unescapedUrl) {
		this.unescapedUrl = unescapedUrl;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the clusterUrl
	 */
	public String getClusterUrl() {
		return clusterUrl;
	}
	/**
	 * @param clusterUrl the clusterUrl to set
	 */
	public void setClusterUrl(String clusterUrl) {
		this.clusterUrl = clusterUrl;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the publishedDate
	 */
	public Date getPublishedDate() {
		return publishedDate;
	}
	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	/**
	 * @return the relatedStories
	 */
	public List<NewsStory> getRelatedStories() {
		return relatedStories;
	}
	/**
	 * @param relatedStories the relatedStories to set
	 */
	public void setRelatedStories(List<NewsStory> relatedStories) {
		this.relatedStories = relatedStories;
	}
	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}
	
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}
}
