/**
 * 
 */
package com.googleapis.ajax.services;

import com.googleapis.ajax.schema.BookResult;
import com.googleapis.ajax.services.enumeration.BookSearchType;

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
