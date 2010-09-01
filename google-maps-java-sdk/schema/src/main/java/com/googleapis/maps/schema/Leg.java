/**
 * 
 */
package com.googleapis.maps.schema;

import java.util.List;

/**
 * @author nmukhtar
 *
 */
public class Leg extends SchemaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6887303607898118085L;

	private List<Step> steps;
	private Metric duration;
	private Metric distance;
	private GeoLocation startLocation;
	private GeoLocation endLocation;
	private String startAddress;
	private String endAddress;
	private List<Waypoint> viaWaypoint;

	/**
	 * @return the steps
	 */
	public List<Step> getSteps() {
		return steps;
	}

	/**
	 * @param steps the steps to set
	 */
	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	/**
	 * @return the duration
	 */
	public Metric getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Metric duration) {
		this.duration = duration;
	}

	/**
	 * @return the distance
	 */
	public Metric getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(Metric distance) {
		this.distance = distance;
	}

	/**
	 * @return the startLocation
	 */
	public GeoLocation getStartLocation() {
		return startLocation;
	}

	/**
	 * @param startLocation the startLocation to set
	 */
	public void setStartLocation(GeoLocation startLocation) {
		this.startLocation = startLocation;
	}

	/**
	 * @return the endLocation
	 */
	public GeoLocation getEndLocation() {
		return endLocation;
	}

	/**
	 * @param endLocation the endLocation to set
	 */
	public void setEndLocation(GeoLocation endLocation) {
		this.endLocation = endLocation;
	}

	/**
	 * @return the startAddress
	 */
	public String getStartAddress() {
		return startAddress;
	}

	/**
	 * @param startAddress the startAddress to set
	 */
	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	/**
	 * @return the endAddress
	 */
	public String getEndAddress() {
		return endAddress;
	}

	/**
	 * @param endAddress the endAddress to set
	 */
	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}

	/**
	 * @return the viaWaypoint
	 */
	public List<Waypoint> getViaWaypoint() {
		return viaWaypoint;
	}

	/**
	 * @param viaWaypoint the viaWaypoint to set
	 */
	public void setViaWaypoint(List<Waypoint> viaWaypoint) {
		this.viaWaypoint = viaWaypoint;
	}
}
