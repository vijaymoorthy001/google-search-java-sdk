/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import java.util.Date;

import com.google.code.googlesearch.schema.BlogResult;

/**
 * The Class BlogResultImpl.
 */
public class BlogResultImpl extends BaseJsonAdapter implements BlogResult {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1556677921929249355L;
	
	/** The title. */
	private String title;
	
	/** The title no formatting. */
	private String titleNoFormatting;
	
	/** The post url. */
	private String postUrl;
	
	/** The content. */
	private String content;
	
	/** The author. */
	private String author;
	
	/** The blog url. */
	private String blogUrl;
	
	/** The published date. */
	private Date publishedDate;
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#getTitleNoFormatting()
	 */
	public String getTitleNoFormatting() {
		return titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#setTitleNoFormatting(java.lang.String)
	 */
	public void setTitleNoFormatting(String titleNoFormatting) {
		this.titleNoFormatting = titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#getPostUrl()
	 */
	public String getPostUrl() {
		return postUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#setPostUrl(java.lang.String)
	 */
	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#getContent()
	 */
	public String getContent() {
		return content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#setContent(java.lang.String)
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#getAuthor()
	 */
	public String getAuthor() {
		return author;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#setAuthor(java.lang.String)
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#getBlogUrl()
	 */
	public String getBlogUrl() {
		return blogUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#setBlogUrl(java.lang.String)
	 */
	public void setBlogUrl(String blogUrl) {
		this.blogUrl = blogUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#getPublishedDate()
	 */
	public Date getPublishedDate() {
		return publishedDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BlogResult#setPublishedDate(java.util.Date)
	 */
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
}
