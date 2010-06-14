/**
 * 
 */
package com.google.code.googlesearch.client;

/**
 * @author nmukhtar
 *
 */
public class GoogleSearchException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2392119987027760999L;

	/**
	 * 
	 */
	public GoogleSearchException() {}

	/**
	 * @param message
	 */
	public GoogleSearchException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public GoogleSearchException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public GoogleSearchException(String message, Throwable cause) {
		super(message, cause);
	}
}
