/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.VideoResult;
import com.google.code.googlesearch.schema.VideoType;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * The Class VideoResultImpl.
 */
public class VideoResultImpl extends BaseJsonAdapter implements VideoResult, Adaptable<VideoResult, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -544563069546960689L;
	
	/** The title. */
	private String title;
	
	/** The title no formatting. */
	private String titleNoFormatting;
	
	/** The content. */
	private String content;
	
	/** The url. */
	private String url;
	
	/** The published. */
	private Date published;
	
	/** The publisher. */
	private String publisher;
	
	/** The duration. */
	private int duration;
	
	/** The tb width. */
	private int tbWidth;
	
	/** The tb height. */
	private int tbHeight;
	
	/** The tb url. */
	private String tbUrl;
	
	/** The play url. */
	private String playUrl;
	
	/** The author. */
	private String author;
	
	/** The view count. */
	private int viewCount;
	
	/** The rating. */
	private double rating;
	
	/** The video type. */
	private VideoType videoType;
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getTitleNoFormatting()
	 */
	public String getTitleNoFormatting() {
		return titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setTitleNoFormatting(java.lang.String)
	 */
	public void setTitleNoFormatting(String titleNoFormatting) {
		this.titleNoFormatting = titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getContent()
	 */
	public String getContent() {
		return content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setContent(java.lang.String)
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getUrl()
	 */
	public String getUrl() {
		return url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setUrl(java.lang.String)
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getPublished()
	 */
	public Date getPublished() {
		return published;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setPublished(java.util.Date)
	 */
	public void setPublished(Date published) {
		this.published = published;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getPublisher()
	 */
	public String getPublisher() {
		return publisher;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setPublisher(java.lang.String)
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getDuration()
	 */
	public int getDuration() {
		return duration;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setDuration(int)
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getTbWidth()
	 */
	public int getTbWidth() {
		return tbWidth;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setTbWidth(int)
	 */
	public void setTbWidth(int tbWidth) {
		this.tbWidth = tbWidth;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getTbHeight()
	 */
	public int getTbHeight() {
		return tbHeight;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setTbHeight(int)
	 */
	public void setTbHeight(int tbHeight) {
		this.tbHeight = tbHeight;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getTbUrl()
	 */
	public String getTbUrl() {
		return tbUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setTbUrl(java.lang.String)
	 */
	public void setTbUrl(String tbUrl) {
		this.tbUrl = tbUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getPlayUrl()
	 */
	public String getPlayUrl() {
		return playUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setPlayUrl(java.lang.String)
	 */
	public void setPlayUrl(String playUrl) {
		this.playUrl = playUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getAuthor()
	 */
	public String getAuthor() {
		return author;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setAuthor(java.lang.String)
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getViewCount()
	 */
	public int getViewCount() {
		return viewCount;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setViewCount(int)
	 */
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getRating()
	 */
	public double getRating() {
		return rating;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setRating(double)
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#getVideoType()
	 */
	public VideoType getVideoType() {
		return videoType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.VideoResult#setVideoType(com.google.code.googlesearch.schema.VideoType)
	 */
	public void setVideoType(VideoType videoType) {
		this.videoType = videoType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}
}
