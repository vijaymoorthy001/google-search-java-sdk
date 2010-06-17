package com.google.code.googlesearch.schema;

import java.util.Date;


/**
 * The Interface PatentResult.
 */
public interface PatentResult extends SchemaEntity {

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle();

	/**
	 * Sets the title.
	 * 
	 * @param title the new title
	 */
	public void setTitle(String title);

	/**
	 * Gets the title no formatting.
	 * 
	 * @return the title no formatting
	 */
	public String getTitleNoFormatting();

	/**
	 * Sets the title no formatting.
	 * 
	 * @param titleNoFormatting the new title no formatting
	 */
	public void setTitleNoFormatting(String titleNoFormatting);

	/**
	 * Gets the content.
	 * 
	 * @return the content
	 */
	public String getContent();

	/**
	 * Sets the content.
	 * 
	 * @param content the new content
	 */
	public void setContent(String content);

	/**
	 * Gets the unescaped url.
	 * 
	 * @return the unescaped url
	 */
	public String getUnescapedUrl();

	/**
	 * Sets the unescaped url.
	 * 
	 * @param unescapedUrl the new unescaped url
	 */
	public void setUnescapedUrl(String unescapedUrl);

	/**
	 * Gets the url.
	 * 
	 * @return the url
	 */
	public String getUrl();

	/**
	 * Sets the url.
	 * 
	 * @param url the new url
	 */
	public void setUrl(String url);

	/**
	 * Gets the application date.
	 * 
	 * @return the application date
	 */
	public Date getApplicationDate();

	/**
	 * Sets the application date.
	 * 
	 * @param applicationDate the new application date
	 */
	public void setApplicationDate(Date applicationDate);

	/**
	 * Gets the patent number.
	 * 
	 * @return the patent number
	 */
	public String getPatentNumber();

	/**
	 * Sets the patent number.
	 * 
	 * @param patentNumber the new patent number
	 */
	public void setPatentNumber(String patentNumber);

	/**
	 * Gets the patent status.
	 * 
	 * @return the patent status
	 */
	public PatentStatus getPatentStatus();

	/**
	 * Sets the patent status.
	 * 
	 * @param patentStatus the new patent status
	 */
	public void setPatentStatus(PatentStatus patentStatus);

	/**
	 * Gets the assignee.
	 * 
	 * @return the assignee
	 */
	public String getAssignee();

	/**
	 * Sets the assignee.
	 * 
	 * @param assignee the new assignee
	 */
	public void setAssignee(String assignee);

	/**
	 * Gets the tb url.
	 * 
	 * @return the tb url
	 */
	public String getTbUrl();

	/**
	 * Sets the tb url.
	 * 
	 * @param tbUrl the new tb url
	 */
	public void setTbUrl(String tbUrl);

}