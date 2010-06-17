/**
 * 
 */
package com.google.code.googlesearch.client.impl;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.client.BookSearchQuery;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls;
import com.google.code.googlesearch.client.constant.ParameterNames;
import com.google.code.googlesearch.client.enumeration.BookSearchType;
import com.google.code.googlesearch.schema.BookResult;
import com.google.code.googlesearch.schema.adapter.json.BookResultImpl;

/**
 * The Class BookSearchQueryImpl.
 */
public class BookSearchQueryImpl extends BaseGoogleSearchApiQuery<BookResult> implements
		BookSearchQuery {
	
	/**
	 * Instantiates a new book search query impl.
	 * 
	 * @param applicationId the application id
	 */
	public BookSearchQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.SEARCH_BOOK_URL);
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.BookSearchQuery#withLibrary(java.lang.String)
	 */
	@Override
	public BookSearchQuery withLibrary(String library) {
		apiUrlBuilder.withParameter(ParameterNames.BOOK_LIBRARY, library);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.BookSearchQuery#withSearchType(com.google.code.googlesearch.client.enumeration.BookSearchType)
	 */
	@Override
	public BookSearchQuery withSearchType(BookSearchType type) {
		if (type.value() != null) {
			apiUrlBuilder.withParameter(type.value(), "1");
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected BookResult unmarshall(JSONObject json) {
		BookResultImpl result = new BookResultImpl();
		result.adaptFrom(json);
		return result;
	}
}
