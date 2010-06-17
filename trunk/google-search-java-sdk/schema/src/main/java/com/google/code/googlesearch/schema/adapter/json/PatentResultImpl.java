/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.PatentResult;
import com.google.code.googlesearch.schema.PatentStatus;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * The Class PatentResultImpl.
 */
public class PatentResultImpl extends BaseJsonAdapter implements PatentResult, Adaptable<PatentResult, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1220138742878830624L;
	
	/** The title. */
	private String title;
	
	/** The title no formatting. */
	private String titleNoFormatting;
	
	/** The content. */
	private String content;
	
	/** The unescaped url. */
	private String unescapedUrl;
	
	/** The url. */
	private String url;
	
	/** The application date. */
	private Date applicationDate;
	
	/** The patent number. */
	private String patentNumber;
	
	/** The patent status. */
	private PatentStatus patentStatus;
	
	/** The assignee. */
	private String assignee;
	
	/** The tb url. */
	private String tbUrl;
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getTitleNoFormatting()
	 */
	public String getTitleNoFormatting() {
		return titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setTitleNoFormatting(java.lang.String)
	 */
	public void setTitleNoFormatting(String titleNoFormatting) {
		this.titleNoFormatting = titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getContent()
	 */
	public String getContent() {
		return content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setContent(java.lang.String)
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getUnescapedUrl()
	 */
	public String getUnescapedUrl() {
		return unescapedUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setUnescapedUrl(java.lang.String)
	 */
	public void setUnescapedUrl(String unescapedUrl) {
		this.unescapedUrl = unescapedUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getUrl()
	 */
	public String getUrl() {
		return url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setUrl(java.lang.String)
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getApplicationDate()
	 */
	public Date getApplicationDate() {
		return applicationDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setApplicationDate(java.util.Date)
	 */
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getPatentNumber()
	 */
	public String getPatentNumber() {
		return patentNumber;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setPatentNumber(java.lang.String)
	 */
	public void setPatentNumber(String patentNumber) {
		this.patentNumber = patentNumber;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getPatentStatus()
	 */
	public PatentStatus getPatentStatus() {
		return patentStatus;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setPatentStatus(com.google.code.googlesearch.schema.PatentStatus)
	 */
	public void setPatentStatus(PatentStatus patentStatus) {
		this.patentStatus = patentStatus;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getAssignee()
	 */
	public String getAssignee() {
		return assignee;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setAssignee(java.lang.String)
	 */
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#getTbUrl()
	 */
	public String getTbUrl() {
		return tbUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.PatentResult#setTbUrl(java.lang.String)
	 */
	public void setTbUrl(String tbUrl) {
		this.tbUrl = tbUrl;
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
