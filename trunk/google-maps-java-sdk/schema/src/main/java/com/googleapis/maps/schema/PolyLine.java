/**
 * 
 */
package com.googleapis.maps.schema;

/**
 * @author nmukhtar
 *
 */
public class PolyLine extends SchemaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7127570898464442391L;
	
	private String points;
	private String levels;
	/**
	 * @return the points
	 */
	public String getPoints() {
		return points;
	}
	/**
	 * @param points the points to set
	 */
	public void setPoints(String points) {
		this.points = points;
	}
	/**
	 * @return the levels
	 */
	public String getLevels() {
		return levels;
	}
	/**
	 * @param levels the levels to set
	 */
	public void setLevels(String levels) {
		this.levels = levels;
	}
}
