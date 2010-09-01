/**
 * 
 */
package com.googleapis.maps.schema;

/**
 * @author nmukhtar
 *
 */
public class Step extends SchemaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 983083176571350946L;
	
	private TravelMode travelMode;
	private GeoLocation startLocation;
	private GeoLocation endLocation;
	private PolyLine polyline;
	private Metric duration;
	private Metric distance;
	/**
	 * @return the travelMode
	 */
	public TravelMode getTravelMode() {
		return travelMode;
	}
	/**
	 * @param travelMode the travelMode to set
	 */
	public void setTravelMode(TravelMode travelMode) {
		this.travelMode = travelMode;
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
	 * @return the polyline
	 */
	public PolyLine getPolyline() {
		return polyline;
	}
	/**
	 * @param polyline the polyline to set
	 */
	public void setPolyline(PolyLine polyline) {
		this.polyline = polyline;
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
}
