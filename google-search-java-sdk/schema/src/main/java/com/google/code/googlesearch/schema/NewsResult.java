/**
 * 
 */
package com.google.code.googlesearch.schema;

import java.util.Date;
import java.util.List;

/**
 * The Class NewsResultImpl.
 */
public class NewsResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8463967785278054587L;
	
	/** The title. */
	private String title;
	
	/** The title no formatting. */
	private String titleNoFormatting;
	
	/** The unescaped url. */
	private String unescapedUrl;
	
	/** The url. */
	private String url;
	
	/** The cluster url. */
	private String clusterUrl;
	
	/** The content. */
	private String content;
	
	/** The publisher. */
	private String publisher;
	
	/** The location. */
	private String location;
	
	/** The published date. */
	private Date publishedDate;
	
	/** The related stories. */
	private List<NewsStory> relatedStories;
	
	/** The image. */
	private Image image;
	
	/** The language. */
	private String language;
	
	/** The author. */
	private String author;
	
	/** The signed redirect url. */
	private String signedRedirectUrl;
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getTitleNoFormatting()
	 */
	public String getTitleNoFormatting() {
		return titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setTitleNoFormatting(java.lang.String)
	 */
	public void setTitleNoFormatting(String titleNoFormatting) {
		this.titleNoFormatting = titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getUnescapedUrl()
	 */
	public String getUnescapedUrl() {
		return unescapedUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setUnescapedUrl(java.lang.String)
	 */
	public void setUnescapedUrl(String unescapedUrl) {
		this.unescapedUrl = unescapedUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getUrl()
	 */
	public String getUrl() {
		return url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setUrl(java.lang.String)
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getClusterUrl()
	 */
	public String getClusterUrl() {
		return clusterUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setClusterUrl(java.lang.String)
	 */
	public void setClusterUrl(String clusterUrl) {
		this.clusterUrl = clusterUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getContent()
	 */
	public String getContent() {
		return content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setContent(java.lang.String)
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getPublisher()
	 */
	public String getPublisher() {
		return publisher;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setPublisher(java.lang.String)
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getLocation()
	 */
	public String getLocation() {
		return location;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setLocation(java.lang.String)
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getPublishedDate()
	 */
	public Date getPublishedDate() {
		return publishedDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setPublishedDate(java.util.Date)
	 */
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getRelatedStories()
	 */
	public List<NewsStory> getRelatedStories() {
		return relatedStories;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setRelatedStories(java.util.List)
	 */
	public void setRelatedStories(List<NewsStory> relatedStories) {
		this.relatedStories = relatedStories;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getImage()
	 */
	public Image getImage() {
		return image;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setImage(com.google.code.googlesearch.schema.adapter.json.Image)
	 */
	public void setImage(Image image) {
		this.image = image;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getLanguage()
	 */
	public String getLanguage() {
		return language;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setLanguage(java.lang.String)
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getAuthor()
	 */
	public String getAuthor() {
		return author;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setAuthor(java.lang.String)
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#getSignedRedirectUrl()
	 */
	public String getSignedRedirectUrl() {
		return signedRedirectUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.NewsResult#setSignedRedirectUrl(java.lang.String)
	 */
	public void setSignedRedirectUrl(String signedRedirectUrl) {
		this.signedRedirectUrl = signedRedirectUrl;
	}
}
