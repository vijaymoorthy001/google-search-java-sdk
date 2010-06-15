/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.VideoResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class VideoResultImple extends BaseJsonAdapter implements VideoResult, Adaptable<VideoResult, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -544563069546960689L;
	
	private String title;
	private String titleNoFormatting;
	private String content;
	private String url;
	private Date published;
	private String publisher;
	private int duration;
	private int tbWidth;
	private int tbHeight;
	private String tbUrl;
	private String playUrl;
	private String author;
	private int viewCount;
	private int rating;
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
	 * @return the published
	 */
	public Date getPublished() {
		return published;
	}
	/**
	 * @param published the published to set
	 */
	public void setPublished(Date published) {
		this.published = published;
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
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the tbWidth
	 */
	public int getTbWidth() {
		return tbWidth;
	}
	/**
	 * @param tbWidth the tbWidth to set
	 */
	public void setTbWidth(int tbWidth) {
		this.tbWidth = tbWidth;
	}
	/**
	 * @return the tbHeight
	 */
	public int getTbHeight() {
		return tbHeight;
	}
	/**
	 * @param tbHeight the tbHeight to set
	 */
	public void setTbHeight(int tbHeight) {
		this.tbHeight = tbHeight;
	}
	/**
	 * @return the tbUrl
	 */
	public String getTbUrl() {
		return tbUrl;
	}
	/**
	 * @param tbUrl the tbUrl to set
	 */
	public void setTbUrl(String tbUrl) {
		this.tbUrl = tbUrl;
	}
	/**
	 * @return the playUrl
	 */
	public String getPlayUrl() {
		return playUrl;
	}
	/**
	 * @param playUrl the playUrl to set
	 */
	public void setPlayUrl(String playUrl) {
		this.playUrl = playUrl;
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
	 * @return the viewCount
	 */
	public int getViewCount() {
		return viewCount;
	}
	/**
	 * @param viewCount the viewCount to set
	 */
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
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
