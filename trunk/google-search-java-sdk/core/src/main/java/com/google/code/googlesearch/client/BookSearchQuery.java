/**
 * 
 */
package com.google.code.googlesearch.client;

import com.google.code.googlesearch.client.enumeration.BookSearchType;
import com.google.code.googlesearch.schema.BookResult;

/**
 * The Interface BookSearchQuery.
 */
public interface BookSearchQuery extends GoogleSearchQuery<BookResult> {
	
	/**
	 * With search type.
	 * 
	 * @param type the type
	 * 
	 * @return the book search query
	 */
	public BookSearchQuery withSearchType(BookSearchType type);
	
	/**
	 * With library.
	 * 
	 * @param library the library
	 * 
	 * @return the book search query
	 */
	public BookSearchQuery withLibrary(String library);
}
