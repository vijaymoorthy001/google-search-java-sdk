package com.google.code.googlesearch.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.WebResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

public class WebResultImpl extends BaseJsonAdapter implements WebResult, Adaptable<WebResult, JSONObject> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8535742587293626160L;
	private String unescapedUrl;
	private String url;
	private String visibleUrl;
	private String title;
	private String titleNoFormatting;
	private String content;
	private String cacheUrl;
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
	 * @return the cacheUrl
	 */
	public String getCacheUrl() {
		return cacheUrl;
	}
	/**
	 * @param cacheUrl the cacheUrl to set
	 */
	public void setCacheUrl(String cacheUrl) {
		this.cacheUrl = cacheUrl;
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
