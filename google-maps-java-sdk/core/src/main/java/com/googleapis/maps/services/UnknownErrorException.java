/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.googleapis.maps.services;

/**
 * The Class UnknownErrorException.
 */
public class UnknownErrorException extends GoogleMapsException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2392119987027760999L;

	/**
	 * Instantiates a new unknown error exception.
	 */
	public UnknownErrorException() {}

	/**
	 * Instantiates a new unknown error exception.
	 * 
	 * @param message the message
	 */
	public UnknownErrorException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new unknown error exception.
	 * 
	 * @param cause the cause
	 */
	public UnknownErrorException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new unknown error exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public UnknownErrorException(String message, Throwable cause) {
		super(message, cause);
	}
}
