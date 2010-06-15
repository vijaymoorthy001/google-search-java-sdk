package com.google.code.googlesearch.schema;

public interface BookResult extends SchemaEntity {

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
	 * @return the authors
	 */
	public String getAuthors();

	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String authors);

	/**
	 * @return the bookId
	 */
	public String getBookId();

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(String bookId);

	/**
	 * @return the publishedYear
	 */
	public String getPublishedYear();

	/**
	 * @param publishedYear the publishedYear to set
	 */
	public void setPublishedYear(String publishedYear);

	/**
	 * @return the pageCount
	 */
	public int getPageCount();

	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount);

	/**
	 * @return the thumbnailHtml
	 */
	public String getThumbnailHtml();

	/**
	 * @param thumbnailHtml the thumbnailHtml to set
	 */
	public void setThumbnailHtml(String thumbnailHtml);

}