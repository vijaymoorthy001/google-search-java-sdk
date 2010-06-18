/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import java.io.Serializable;
import java.util.logging.Logger;

import com.google.code.googlesearch.schema.GsearchResultClass;

/**
 * The Class BaseJsonAdapter.
 */
public abstract class BaseJsonAdapter implements Serializable {

	/** The logger. */
    protected final Logger logger = Logger.getLogger(getClass().getCanonicalName());
	
	/** The gsearch result class. */
	private GsearchResultClass gsearchResultClass;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 250056223059654638L;
	
	/**
	 * Gets the gsearch result class.
	 * 
	 * @return the gsearch result class
	 */
	public GsearchResultClass getGsearchResultClass() {
		return gsearchResultClass;
	}

	/**
	 * Sets the gsearch result class.
	 * 
	 * @param gsearchResultClass the new gsearch result class
	 */
	public void setGsearchResultClass(GsearchResultClass gsearchResultClass) {
		this.gsearchResultClass = gsearchResultClass;
	}
}
