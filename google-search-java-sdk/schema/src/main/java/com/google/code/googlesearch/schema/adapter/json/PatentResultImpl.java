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
 * @author nmukhtar
 *
 */
public class PatentResultImpl extends BaseJsonAdapter implements PatentResult, Adaptable<PatentResult, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1220138742878830624L;
	
	private String title;
	private String titleNoFormatting;
	private String content;
	private String unescapedUrl;
	private String url;
	private Date applicationDate;
	private String patentNumber;
	private PatentStatus patentStatus;
	private String assignee;
	private String tbUrl;
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
	 * @return the applicationDate
	 */
	public Date getApplicationDate() {
		return applicationDate;
	}
	/**
	 * @param applicationDate the applicationDate to set
	 */
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	/**
	 * @return the patentNumber
	 */
	public String getPatentNumber() {
		return patentNumber;
	}
	/**
	 * @param patentNumber the patentNumber to set
	 */
	public void setPatentNumber(String patentNumber) {
		this.patentNumber = patentNumber;
	}
	/**
	 * @return the patentStatus
	 */
	public PatentStatus getPatentStatus() {
		return patentStatus;
	}
	/**
	 * @param patentStatus the patentStatus to set
	 */
	public void setPatentStatus(PatentStatus patentStatus) {
		this.patentStatus = patentStatus;
	}
	/**
	 * @return the assignee
	 */
	public String getAssignee() {
		return assignee;
	}
	/**
	 * @param assignee the assignee to set
	 */
	public void setAssignee(String assignee) {
		this.assignee = assignee;
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
