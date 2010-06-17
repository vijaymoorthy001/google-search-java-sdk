package com.google.code.googlesearch.schema;

import java.util.List;

import com.google.code.googlesearch.schema.adapter.json.PhoneNumber;

/**
 * The Interface LocalResult.
 */
public interface LocalResult extends SchemaEntity {

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle();

	/**
	 * Sets the title.
	 * 
	 * @param title the new title
	 */
	public void setTitle(String title);

	/**
	 * Gets the title no formatting.
	 * 
	 * @return the title no formatting
	 */
	public String getTitleNoFormatting();

	/**
	 * Sets the title no formatting.
	 * 
	 * @param titleNoFormatting the new title no formatting
	 */
	public void setTitleNoFormatting(String titleNoFormatting);

	/**
	 * Gets the url.
	 * 
	 * @return the url
	 */
	public String getUrl();

	/**
	 * Sets the url.
	 * 
	 * @param url the new url
	 */
	public void setUrl(String url);

	/**
	 * Gets the lat.
	 * 
	 * @return the lat
	 */
	public double getLat();

	/**
	 * Sets the lat.
	 * 
	 * @param lat the new lat
	 */
	public void setLat(double lat);

	/**
	 * Gets the lng.
	 * 
	 * @return the lng
	 */
	public double getLng();

	/**
	 * Sets the lng.
	 * 
	 * @param lng the new lng
	 */
	public void setLng(double lng);

	/**
	 * Gets the street address.
	 * 
	 * @return the street address
	 */
	public String getStreetAddress();

	/**
	 * Sets the street address.
	 * 
	 * @param streetAddress the new street address
	 */
	public void setStreetAddress(String streetAddress);

	/**
	 * Gets the city.
	 * 
	 * @return the city
	 */
	public String getCity();

	/**
	 * Sets the city.
	 * 
	 * @param city the new city
	 */
	public void setCity(String city);

	/**
	 * Gets the region.
	 * 
	 * @return the region
	 */
	public String getRegion();

	/**
	 * Sets the region.
	 * 
	 * @param region the new region
	 */
	public void setRegion(String region);

	/**
	 * Gets the country.
	 * 
	 * @return the country
	 */
	public String getCountry();

	/**
	 * Sets the country.
	 * 
	 * @param country the new country
	 */
	public void setCountry(String country);

	/**
	 * Gets the phone numbers.
	 * 
	 * @return the phone numbers
	 */
	public List<PhoneNumber> getPhoneNumbers();

	/**
	 * Sets the phone numbers.
	 * 
	 * @param phoneNumbers the new phone numbers
	 */
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers);

	/**
	 * Gets the address lines.
	 * 
	 * @return the address lines
	 */
	public List<String> getAddressLines();

	/**
	 * Sets the address lines.
	 * 
	 * @param addressLines the new address lines
	 */
	public void setAddressLines(List<String> addressLines);

	/**
	 * Gets the dd url.
	 * 
	 * @return the dd url
	 */
	public String getDdUrl();

	/**
	 * Sets the dd url.
	 * 
	 * @param ddUrl the new dd url
	 */
	public void setDdUrl(String ddUrl);

	/**
	 * Gets the dd url to here.
	 * 
	 * @return the dd url to here
	 */
	public String getDdUrlToHere();

	/**
	 * Sets the dd url to here.
	 * 
	 * @param ddUrlToHere the new dd url to here
	 */
	public void setDdUrlToHere(String ddUrlToHere);

	/**
	 * Gets the dd url from here.
	 * 
	 * @return the dd url from here
	 */
	public String getDdUrlFromHere();

	/**
	 * Sets the dd url from here.
	 * 
	 * @param ddUrlFromHere the new dd url from here
	 */
	public void setDdUrlFromHere(String ddUrlFromHere);

	/**
	 * Gets the static map url.
	 * 
	 * @return the static map url
	 */
	public String getStaticMapUrl();

	/**
	 * Sets the static map url.
	 * 
	 * @param staticMapUrl the new static map url
	 */
	public void setStaticMapUrl(String staticMapUrl);

	/**
	 * Gets the listing type.
	 * 
	 * @return the listing type
	 */
	public ListingType getListingType();

	/**
	 * Sets the listing type.
	 * 
	 * @param listingType the new listing type
	 */
	public void setListingType(ListingType listingType);

	/**
	 * Gets the content.
	 * 
	 * @return the content
	 */
	public String getContent();

	/**
	 * Sets the content.
	 * 
	 * @param content the new content
	 */
	public void setContent(String content);

	/**
	 * Gets the max age.
	 * 
	 * @return the max age
	 */
	public long getMaxAge();
	
	/**
	 * Sets the max age.
	 * 
	 * @param maxAge the new max age
	 */
	public void setMaxAge(long maxAge);
	
	/**
	 * Gets the accuracy.
	 * 
	 * @return the accuracy
	 */
	public int getAccuracy();
	
	/**
	 * Sets the accuracy.
	 * 
	 * @param accuracy the new accuracy
	 */
	public void setAccuracy(int accuracy);
	
	/**
	 * Gets the viewportmode.
	 * 
	 * @return the viewportmode
	 */
	public ViewPortMode getViewportmode();
	
	/**
	 * Sets the viewportmode.
	 * 
	 * @param viewportmode the new viewportmode
	 */
	public void setViewportmode(ViewPortMode viewportmode);
}