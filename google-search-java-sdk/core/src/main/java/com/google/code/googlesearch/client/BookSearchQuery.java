/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.schema.BookResult;

/**
 * @author nmukhtar
 *
 */
public interface BookSearchQuery extends GoogleSearchQuery<BookResult> {
	public BookSearchQuery withSearchType(BookSearchType type);
	public BookSearchQuery withLibrary(String library);
}
