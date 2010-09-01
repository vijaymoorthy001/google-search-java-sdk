/**
 * 
 */
package com.googleapis.maps.schema;

import java.util.List;

/**
 * @author nmukhtar
 *
 */
public class AddressComponent extends SchemaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3549366270503297886L;

	private String longName;
	private String shortName;
	private List<AddressComponentType> types;
	/**
	 * @return the longName
	 */
	public String getLongName() {
		return longName;
	}
	/**
	 * @param longName the longName to set
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}
	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * @return the types
	 */
	public List<AddressComponentType> getTypes() {
		return types;
	}
	/**
	 * @param types the types to set
	 */
	public void setTypes(List<AddressComponentType> types) {
		this.types = types;
	}
}
