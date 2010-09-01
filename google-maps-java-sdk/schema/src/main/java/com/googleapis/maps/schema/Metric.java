/**
 * 
 */
package com.googleapis.maps.schema;

/**
 * @author nmukhtar
 *
 */
public class Metric extends SchemaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8677198189578821428L;
	
	private double value;
	private String text;
	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Metric [text=" + text + ", value=" + value + "]";
	}
}
