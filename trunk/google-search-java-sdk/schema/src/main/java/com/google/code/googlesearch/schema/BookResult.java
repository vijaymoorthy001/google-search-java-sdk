package com.google.code.googlesearch.schema;

/**
 * The Interface BookResult.
 */
public interface BookResult extends SchemaEntity {

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
	 * Gets the authors.
	 * 
	 * @return the authors
	 */
	public String getAuthors();

	/**
	 * Sets the authors.
	 * 
	 * @param authors the new authors
	 */
	public void setAuthors(String authors);

	/**
	 * Gets the book id.
	 * 
	 * @return the book id
	 */
	public String getBookId();

	/**
	 * Sets the book id.
	 * 
	 * @param bookId the new book id
	 */
	public void setBookId(String bookId);

	/**
	 * Gets the published year.
	 * 
	 * @return the published year
	 */
	public String getPublishedYear();

	/**
	 * Sets the published year.
	 * 
	 * @param publishedYear the new published year
	 */
	public void setPublishedYear(String publishedYear);

	/**
	 * Gets the page count.
	 * 
	 * @return the page count
	 */
	public int getPageCount();

	/**
	 * Sets the page count.
	 * 
	 * @param pageCount the new page count
	 */
	public void setPageCount(int pageCount);

	/**
	 * Gets the thumbnail html.
	 * 
	 * @return the thumbnail html
	 */
	public String getThumbnailHtml();

	/**
	 * Sets the thumbnail html.
	 * 
	 * @param thumbnailHtml the new thumbnail html
	 */
	public void setThumbnailHtml(String thumbnailHtml);

	/**
	 * Gets the tb width.
	 * 
	 * @return the tb width
	 */
	public int getTbWidth();

	/**
	 * Sets the tb width.
	 * 
	 * @param tbWidth the new tb width
	 */
	public void setTbWidth(int tbWidth);

	/**
	 * Gets the tb height.
	 * 
	 * @return the tb height
	 */
	public int getTbHeight();

	/**
	 * Sets the tb height.
	 * 
	 * @param tbHeight the new tb height
	 */
	public void setTbHeight(int tbHeight);

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