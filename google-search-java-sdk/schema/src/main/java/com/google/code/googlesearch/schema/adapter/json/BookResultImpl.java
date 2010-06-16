/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.BookResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class BookResultImpl extends BaseJsonAdapter implements BookResult, Adaptable<BookResult, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1165875438932653598L;
	
	private String title;
	private String titleNoFormatting;
	private String unescapedUrl;
	private String url;
	private String authors;
	private String bookId;
	private String publishedYear;
	private int pageCount;
	private String thumbnailHtml;
	private int tbWidth;
	private int tbHeight;
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
	 * @return the authors
	 */
	public String getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	/**
	 * @return the bookId
	 */
	public String getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the publishedYear
	 */
	public String getPublishedYear() {
		return publishedYear;
	}
	/**
	 * @param publishedYear the publishedYear to set
	 */
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	/**
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}
	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * @return the thumbnailHtml
	 */
	public String getThumbnailHtml() {
		return thumbnailHtml;
	}
	/**
	 * @param thumbnailHtml the thumbnailHtml to set
	 */
	public void setThumbnailHtml(String thumbnailHtml) {
		this.thumbnailHtml = thumbnailHtml;
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
