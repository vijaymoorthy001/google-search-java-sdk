/**
 * 
 */
package com.google.code.googlesearch.client;

/**
 * The Class GoogleSearchException.
 */
public class GoogleSearchException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2392119987027760999L;

	/**
	 * Instantiates a new google search exception.
	 */
	public GoogleSearchException() {}

	/**
	 * Instantiates a new google search exception.
	 * 
	 * @param message the message
	 */
	public GoogleSearchException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new google search exception.
	 * 
	 * @param cause the cause
	 */
	public GoogleSearchException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new google search exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public GoogleSearchException(String message, Throwable cause) {
		super(message, cause);
	}
}
