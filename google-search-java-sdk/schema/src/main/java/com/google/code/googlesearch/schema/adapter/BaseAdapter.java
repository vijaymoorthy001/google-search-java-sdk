/**
 * 
 */
package com.google.code.googlesearch.schema.adapter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @author nmukhtar
 *
 */
public abstract class BaseAdapter implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1923669359663905722L;
	/**
	 * Logging for this instance
	 */
	protected Logger log = Logger.getLogger(getClass().getCanonicalName());
	
	protected void copyProperties(Object dest, Object src) {
		try {
			BeanUtils.copyProperties(dest, src);
		} catch (Exception e) {
			log.log(Level.SEVERE, "Error while copying properties.", e);
		}		
	}
	@SuppressWarnings("unchecked")
	protected void copyProperties(Object dest, Map src) {
		try {
			src = changeCaseOfKeys(src, false);
			BeanUtils.populate(dest, src);
		} catch (Exception e) {
			log.log(Level.SEVERE, "Error while copying properties.", e);
		}		
	}
	
	@SuppressWarnings("unchecked")
	protected void copyProperties(Map dest, Object src) {
		try {
			Map srcMap = BeanUtils.describe(src);
			dest.putAll(changeCaseOfKeys(srcMap, true));
		} catch (Exception e) {
			log.log(Level.SEVERE, "Error while copying properties.", e);
		}		
	}
	
	@SuppressWarnings("unchecked")
	private Map changeCaseOfKeys(Map properties, boolean upper) {
		Map retValue = new HashMap(properties.size());
		for (String key : (Iterable<String>) properties.keySet()) {
			Object value = properties.get(key);
			if (upper) {
				String newKey = Character.toUpperCase(key.charAt(0)) + key.substring(1);
				retValue.put(newKey, value);
			} else {
				String newKey = Character.toLowerCase(key.charAt(0)) + key.substring(1);
				retValue.put(newKey, value);
			}
		}
		
		return retValue;
	}
}
