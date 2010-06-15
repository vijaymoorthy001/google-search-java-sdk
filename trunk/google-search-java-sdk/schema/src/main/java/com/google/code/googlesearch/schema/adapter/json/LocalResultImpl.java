/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.ListingType;
import com.google.code.googlesearch.schema.LocalResult;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class LocalResultImpl extends BaseJsonAdapter implements LocalResult, Adaptable<LocalResult, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6016892309811530169L;
	
	private String title;
	private String titleNoFormatting;
	private String url;
	private double lat;
	private double lng;
	private String streetAddress;
	private String city;
	private String region;
	private String country;
	private List<PhoneNumber> phoneNumbers;
	private List<String> addressLines;
	private String ddUrl;
	private String ddUrlToHere;
	private String ddUrlFromHere;
	private String staticMapUrl;
	private ListingType listingType;
	private String content;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the titleNoFormatting
	 */
	public String getTitleNoFormatting() {
		return titleNoFormatting;
	}
	/**
	 * @param titleNoFormatting the titleNoFormatting to set
	 */
	public void setTitleNoFormatting(String titleNoFormatting) {
		this.titleNoFormatting = titleNoFormatting;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
	/**
	 * @return the lng
	 */
	public double getLng() {
		return lng;
	}
	/**
	 * @param lng the lng to set
	 */
	public void setLng(double lng) {
		this.lng = lng;
	}
	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the phoneNumbers
	 */
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	/**
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	/**
	 * @return the addressLines
	 */
	public List<String> getAddressLines() {
		return addressLines;
	}
	/**
	 * @param addressLines the addressLines to set
	 */
	public void setAddressLines(List<String> addressLines) {
		this.addressLines = addressLines;
	}
	/**
	 * @return the ddUrl
	 */
	public String getDdUrl() {
		return ddUrl;
	}
	/**
	 * @param ddUrl the ddUrl to set
	 */
	public void setDdUrl(String ddUrl) {
		this.ddUrl = ddUrl;
	}
	/**
	 * @return the ddUrlToHere
	 */
	public String getDdUrlToHere() {
		return ddUrlToHere;
	}
	/**
	 * @param ddUrlToHere the ddUrlToHere to set
	 */
	public void setDdUrlToHere(String ddUrlToHere) {
		this.ddUrlToHere = ddUrlToHere;
	}
	/**
	 * @return the ddUrlFromHere
	 */
	public String getDdUrlFromHere() {
		return ddUrlFromHere;
	}
	/**
	 * @param ddUrlFromHere the ddUrlFromHere to set
	 */
	public void setDdUrlFromHere(String ddUrlFromHere) {
		this.ddUrlFromHere = ddUrlFromHere;
	}
	/**
	 * @return the staticMapUrl
	 */
	public String getStaticMapUrl() {
		return staticMapUrl;
	}
	/**
	 * @param staticMapUrl the staticMapUrl to set
	 */
	public void setStaticMapUrl(String staticMapUrl) {
		this.staticMapUrl = staticMapUrl;
	}
	/**
	 * @return the listingType
	 */
	public ListingType getListingType() {
		return listingType;
	}
	/**
	 * @param listingType the listingType to set
	 */
	public void setListingType(ListingType listingType) {
		this.listingType = listingType;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}
	
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}
}
