/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.BlogResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class BlogResultImpl extends BaseJsonAdapter implements BlogResult, Adaptable<BlogResult, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1556677921929249355L;
	
	private String title;
	private String titleNoFormatting;
	private String postUrl;
	private String content;
	private String author;
	private String blogUrl;
	private Date publishedDate;
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
	 * @return the postUrl
	 */
	public String getPostUrl() {
		return postUrl;
	}
	/**
	 * @param postUrl the postUrl to set
	 */
	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
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
	/**
	 * @return the blogUrl
	 */
	public String getBlogUrl() {
		return blogUrl;
	}
	/**
	 * @param blogUrl the blogUrl to set
	 */
	public void setBlogUrl(String blogUrl) {
		this.blogUrl = blogUrl;
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
