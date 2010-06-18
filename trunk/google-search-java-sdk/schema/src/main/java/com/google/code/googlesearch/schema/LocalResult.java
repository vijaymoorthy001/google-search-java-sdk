/**
 * 
 */
package com.google.code.googlesearch.schema;

import java.util.List;


/**
 * The Class LocalResultImpl.
 */
public class LocalResult extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6016892309811530169L;
	
	/** The title. */
	private String title;
	
	/** The title no formatting. */
	private String titleNoFormatting;
	
	/** The url. */
	private String url;
	
	/** The lat. */
	private double lat;
	
	/** The lng. */
	private double lng;
	
	/** The street address. */
	private String streetAddress;
	
	/** The city. */
	private String city;
	
	/** The region. */
	private String region;
	
	/** The country. */
	private String country;
	
	/** The phone numbers. */
	private List<PhoneNumber> phoneNumbers;
	
	/** The address lines. */
	private List<String> addressLines;
	
	/** The dd url. */
	private String ddUrl;
	
	/** The dd url to here. */
	private String ddUrlToHere;
	
	/** The dd url from here. */
	private String ddUrlFromHere;
	
	/** The static map url. */
	private String staticMapUrl;
	
	/** The listing type. */
	private ListingType listingType;
	
	/** The content. */
	private String content;
	
	/** The max age. */
	private long maxAge;
	
	/** The accuracy. */
	private int accuracy;
	
	/** The viewportmode. */
	private ViewPortMode viewportmode;
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getTitleNoFormatting()
	 */
	public String getTitleNoFormatting() {
		return titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setTitleNoFormatting(java.lang.String)
	 */
	public void setTitleNoFormatting(String titleNoFormatting) {
		this.titleNoFormatting = titleNoFormatting;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getUrl()
	 */
	public String getUrl() {
		return url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setUrl(java.lang.String)
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getLat()
	 */
	public double getLat() {
		return lat;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setLat(double)
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getLng()
	 */
	public double getLng() {
		return lng;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setLng(double)
	 */
	public void setLng(double lng) {
		this.lng = lng;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getStreetAddress()
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setStreetAddress(java.lang.String)
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getCity()
	 */
	public String getCity() {
		return city;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setCity(java.lang.String)
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getRegion()
	 */
	public String getRegion() {
		return region;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setRegion(java.lang.String)
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getCountry()
	 */
	public String getCountry() {
		return country;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setCountry(java.lang.String)
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getPhoneNumbers()
	 */
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setPhoneNumbers(java.util.List)
	 */
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getAddressLines()
	 */
	public List<String> getAddressLines() {
		return addressLines;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setAddressLines(java.util.List)
	 */
	public void setAddressLines(List<String> addressLines) {
		this.addressLines = addressLines;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getDdUrl()
	 */
	public String getDdUrl() {
		return ddUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setDdUrl(java.lang.String)
	 */
	public void setDdUrl(String ddUrl) {
		this.ddUrl = ddUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getDdUrlToHere()
	 */
	public String getDdUrlToHere() {
		return ddUrlToHere;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setDdUrlToHere(java.lang.String)
	 */
	public void setDdUrlToHere(String ddUrlToHere) {
		this.ddUrlToHere = ddUrlToHere;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getDdUrlFromHere()
	 */
	public String getDdUrlFromHere() {
		return ddUrlFromHere;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setDdUrlFromHere(java.lang.String)
	 */
	public void setDdUrlFromHere(String ddUrlFromHere) {
		this.ddUrlFromHere = ddUrlFromHere;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getStaticMapUrl()
	 */
	public String getStaticMapUrl() {
		return staticMapUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setStaticMapUrl(java.lang.String)
	 */
	public void setStaticMapUrl(String staticMapUrl) {
		this.staticMapUrl = staticMapUrl;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getListingType()
	 */
	public ListingType getListingType() {
		return listingType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setListingType(com.google.code.googlesearch.schema.ListingType)
	 */
	public void setListingType(ListingType listingType) {
		this.listingType = listingType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getContent()
	 */
	public String getContent() {
		return content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setContent(java.lang.String)
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getMaxAge()
	 */
	public long getMaxAge() {
		return maxAge;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setMaxAge(long)
	 */
	public void setMaxAge(long maxAge) {
		this.maxAge = maxAge;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getAccuracy()
	 */
	public int getAccuracy() {
		return accuracy;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setAccuracy(int)
	 */
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#getViewportmode()
	 */
	public ViewPortMode getViewportmode() {
		return viewportmode;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.schema.LocalResult#setViewportmode(com.google.code.googlesearch.schema.ViewPortMode)
	 */
	public void setViewportmode(ViewPortMode viewportmode) {
		this.viewportmode = viewportmode;
	}
}
