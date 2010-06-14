/**
 * 
 */
package com.google.code.googlesearch.client;

/**
 * @author nmukhtar
 *
 */
public class BingSearchException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2392119987027760999L;

	/**
	 * 
	 */
	public BingSearchException() {}

	/**
	 * @param message
	 */
	public BingSearchException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public BingSearchException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public BingSearchException(String message, Throwable cause) {
		super(message, cause);
	}
}
