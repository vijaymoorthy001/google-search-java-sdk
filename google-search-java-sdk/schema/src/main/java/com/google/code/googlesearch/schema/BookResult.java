/**
 * 
 */
package com.google.code.googlesearch.schema;


/**
 * The Class BookResultImpl.
 */
public class BookResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1165875438932653598L;
	
	/** The title. */
	private String title;
	
	/** The title no formatting. */
	private String titleNoFormatting;
	
	/** The unescaped url. */
	private String unescapedUrl;
	
	/** The url. */
	private String url;
	
	/** The authors. */
	private String authors;
	
	/** The book id. */
	private String bookId;
	
	/** The published year. */
	private String publishedYear;
	
	/** The page count. */
	private int pageCount;
	
	/** The thumbnail html. */
	private String thumbnailHtml;
	
	/** The tb width. */
	private int tbWidth;
	
	/** The tb height. */
	private int tbHeight;
	
	/** The tb url. */
	private String tbUrl;
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getTitleNoFormatting()
	 */
	public String getTitleNoFormatting() {
		return titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setTitleNoFormatting(java.lang.String)
	 */
	public void setTitleNoFormatting(String titleNoFormatting) {
		this.titleNoFormatting = titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getUnescapedUrl()
	 */
	public String getUnescapedUrl() {
		return unescapedUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setUnescapedUrl(java.lang.String)
	 */
	public void setUnescapedUrl(String unescapedUrl) {
		this.unescapedUrl = unescapedUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getUrl()
	 */
	public String getUrl() {
		return url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setUrl(java.lang.String)
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getAuthors()
	 */
	public String getAuthors() {
		return authors;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setAuthors(java.lang.String)
	 */
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getBookId()
	 */
	public String getBookId() {
		return bookId;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setBookId(java.lang.String)
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getPublishedYear()
	 */
	public String getPublishedYear() {
		return publishedYear;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setPublishedYear(java.lang.String)
	 */
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getPageCount()
	 */
	public int getPageCount() {
		return pageCount;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setPageCount(int)
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getThumbnailHtml()
	 */
	public String getThumbnailHtml() {
		return thumbnailHtml;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setThumbnailHtml(java.lang.String)
	 */
	public void setThumbnailHtml(String thumbnailHtml) {
		this.thumbnailHtml = thumbnailHtml;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getTbWidth()
	 */
	public int getTbWidth() {
		return tbWidth;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setTbWidth(int)
	 */
	public void setTbWidth(int tbWidth) {
		this.tbWidth = tbWidth;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getTbHeight()
	 */
	public int getTbHeight() {
		return tbHeight;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setTbHeight(int)
	 */
	public void setTbHeight(int tbHeight) {
		this.tbHeight = tbHeight;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#getTbUrl()
	 */
	public String getTbUrl() {
		return tbUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.BookResult#setTbUrl(java.lang.String)
	 */
	public void setTbUrl(String tbUrl) {
		this.tbUrl = tbUrl;
	}
}
