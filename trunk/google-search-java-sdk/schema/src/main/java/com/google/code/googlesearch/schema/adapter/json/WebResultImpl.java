package com.google.code.googlesearch.schema.adapter.json;

import com.google.code.googlesearch.schema.WebResult;

/**
 * The Class WebResultImpl.
 */
public class WebResultImpl extends BaseJsonAdapter implements WebResult {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8535742587293626160L;
	
	/** The unescaped url. */
	private String unescapedUrl;
	
	/** The url. */
	private String url;
	
	/** The visible url. */
	private String visibleUrl;
	
	/** The title. */
	private String title;
	
	/** The title no formatting. */
	private String titleNoFormatting;
	
	/** The content. */
	private String content;
	
	/** The cache url. */
	private String cacheUrl;
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#getUnescapedUrl()
	 */
	public String getUnescapedUrl() {
		return unescapedUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#setUnescapedUrl(java.lang.String)
	 */
	public void setUnescapedUrl(String unescapedUrl) {
		this.unescapedUrl = unescapedUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#getUrl()
	 */
	public String getUrl() {
		return url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#setUrl(java.lang.String)
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#getVisibleUrl()
	 */
	public String getVisibleUrl() {
		return visibleUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#setVisibleUrl(java.lang.String)
	 */
	public void setVisibleUrl(String visibleUrl) {
		this.visibleUrl = visibleUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#getTitleNoFormatting()
	 */
	public String getTitleNoFormatting() {
		return titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#setTitleNoFormatting(java.lang.String)
	 */
	public void setTitleNoFormatting(String titleNoFormatting) {
		this.titleNoFormatting = titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#getContent()
	 */
	public String getContent() {
		return content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#setContent(java.lang.String)
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#getCacheUrl()
	 */
	public String getCacheUrl() {
		return cacheUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.WebResult#setCacheUrl(java.lang.String)
	 */
	public void setCacheUrl(String cacheUrl) {
		this.cacheUrl = cacheUrl;
	}
}
