/**
 * 
 */
package com.googleapis.maps.schema;

/**
 * @author nmukhtar
 *
 */
public class GeoMetry extends SchemaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2404092851056197701L;
	
	private GeoLocation location;
	private LocationType locationType;
	private ViewPort viewport;
	private Bounds bounds;
	/**
	 * @return the location
	 */
	public GeoLocation getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(GeoLocation location) {
		this.location = location;
	}
	/**
	 * @return the locationType
	 */
	public LocationType getLocationType() {
		return locationType;
	}
	/**
	 * @param locationType the locationType to set
	 */
	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
	/**
	 * @return the viewport
	 */
	public ViewPort getViewport() {
		return viewport;
	}
	/**
	 * @param viewport the viewport to set
	 */
	public void setViewport(ViewPort viewport) {
		this.viewport = viewport;
	}
	/**
	 * @return the bounds
	 */
	public Bounds getBounds() {
		return bounds;
	}
	/**
	 * @param bounds the bounds to set
	 */
	public void setBounds(Bounds bounds) {
		this.bounds = bounds;
	}
}
