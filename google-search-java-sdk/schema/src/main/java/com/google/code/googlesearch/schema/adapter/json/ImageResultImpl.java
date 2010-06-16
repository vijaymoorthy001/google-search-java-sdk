/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.ImageResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class ImageResultImpl extends BaseJsonAdapter implements ImageResult, Adaptable<ImageResult, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6998066536030585746L;
	
	private String title;
	private String titleNoFormatting;
	private String unescapedUrl;
	private String url;
	private String visibleUrl;
	private String originalContextUrl;
	private int width;
	private int height;
	private int tbWidth;
	private int tbHeight;
	private String tbUrl;
	private String content;
	private String contentNoFormatting;
	private String imageId;
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
	 * @return the visibleUrl
	 */
	public String getVisibleUrl() {
		return visibleUrl;
	}
	/**
	 * @param visibleUrl the visibleUrl to set
	 */
	public void setVisibleUrl(String visibleUrl) {
		this.visibleUrl = visibleUrl;
	}
	/**
	 * @return the originalContextUrl
	 */
	public String getOriginalContextUrl() {
		return originalContextUrl;
	}
	/**
	 * @param originalContextUrl the originalContextUrl to set
	 */
	public void setOriginalContextUrl(String originalContextUrl) {
		this.originalContextUrl = originalContextUrl;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
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
	 * @return the contentNoFormatting
	 */
	public String getContentNoFormatting() {
		return contentNoFormatting;
	}
	/**
	 * @param contentNoFormatting the contentNoFormatting to set
	 */
	public void setContentNoFormatting(String contentNoFormatting) {
		this.contentNoFormatting = contentNoFormatting;
	}
	
	/**
	 * @return the imageId
	 */
	public String getImageId() {
		return imageId;
	}
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(String imageId) {
		this.imageId = imageId;
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
