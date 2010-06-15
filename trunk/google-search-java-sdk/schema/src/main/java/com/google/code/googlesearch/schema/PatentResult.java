package com.google.code.googlesearch.schema;

import java.util.Date;


public interface PatentResult extends SchemaEntity {

	/**
	 * @return the title
	 */
	public String getTitle();

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title);

	/**
	 * @return the titleNoFormatting
	 */
	public String getTitleNoFormatting();

	/**
	 * @param titleNoFormatting the titleNoFormatting to set
	 */
	public void setTitleNoFormatting(String titleNoFormatting);

	/**
	 * @return the content
	 */
	public String getContent();

	/**
	 * @param content the content to set
	 */
	public void setContent(String content);

	/**
	 * @return the unescapedUrl
	 */
	public String getUnescapedUrl();

	/**
	 * @param unescapedUrl the unescapedUrl to set
	 */
	public void setUnescapedUrl(String unescapedUrl);

	/**
	 * @return the url
	 */
	public String getUrl();

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url);

	/**
	 * @return the applicationDate
	 */
	public Date getApplicationDate();

	/**
	 * @param applicationDate the applicationDate to set
	 */
	public void setApplicationDate(Date applicationDate);

	/**
	 * @return the patentNumber
	 */
	public String getPatentNumber();

	/**
	 * @param patentNumber the patentNumber to set
	 */
	public void setPatentNumber(String patentNumber);

	/**
	 * @return the patentStatus
	 */
	public PatentStatus getPatentStatus();

	/**
	 * @param patentStatus the patentStatus to set
	 */
	public void setPatentStatus(PatentStatus patentStatus);

	/**
	 * @return the assignee
	 */
	public String getAssignee();

	/**
	 * @param assignee the assignee to set
	 */
	public void setAssignee(String assignee);

	/**
	 * @return the tbUrl
	 */
	public String getTbUrl();

	/**
	 * @param tbUrl the tbUrl to set
	 */
	public void setTbUrl(String tbUrl);

}