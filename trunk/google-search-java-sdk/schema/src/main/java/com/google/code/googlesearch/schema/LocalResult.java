package com.google.code.googlesearch.schema;

import java.util.List;

import com.google.code.googlesearch.schema.adapter.json.PhoneNumber;

public interface LocalResult extends SchemaEntity {

	/**
	 * @return the title
	 */
	public String getTitle();

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title);

	/**
	 * @return the titleNoFormatting
	 */
	public String getTitleNoFormatting();

	/**
	 * @param titleNoFormatting the titleNoFormatting to set
	 */
	public void setTitleNoFormatting(String titleNoFormatting);

	/**
	 * @return the url
	 */
	public String getUrl();

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url);

	/**
	 * @return the lat
	 */
	public double getLat();

	/**
	 * @param lat the lat to set
	 */
	public void setLat(double lat);

	/**
	 * @return the lng
	 */
	public double getLng();

	/**
	 * @param lng the lng to set
	 */
	public void setLng(double lng);

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress();

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress);

	/**
	 * @return the city
	 */
	public String getCity();

	/**
	 * @param city the city to set
	 */
	public void setCity(String city);

	/**
	 * @return the region
	 */
	public String getRegion();

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region);

	/**
	 * @return the country
	 */
	public String getCountry();

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country);

	/**
	 * @return the phoneNumbers
	 */
	public List<PhoneNumber> getPhoneNumbers();

	/**
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers);

	/**
	 * @return the addressLines
	 */
	public List<String> getAddressLines();

	/**
	 * @param addressLines the addressLines to set
	 */
	public void setAddressLines(List<String> addressLines);

	/**
	 * @return the ddUrl
	 */
	public String getDdUrl();

	/**
	 * @param ddUrl the ddUrl to set
	 */
	public void setDdUrl(String ddUrl);

	/**
	 * @return the ddUrlToHere
	 */
	public String getDdUrlToHere();

	/**
	 * @param ddUrlToHere the ddUrlToHere to set
	 */
	public void setDdUrlToHere(String ddUrlToHere);

	/**
	 * @return the ddUrlFromHere
	 */
	public String getDdUrlFromHere();

	/**
	 * @param ddUrlFromHere the ddUrlFromHere to set
	 */
	public void setDdUrlFromHere(String ddUrlFromHere);

	/**
	 * @return the staticMapUrl
	 */
	public String getStaticMapUrl();

	/**
	 * @param staticMapUrl the staticMapUrl to set
	 */
	public void setStaticMapUrl(String staticMapUrl);

	/**
	 * @return the listingType
	 */
	public ListingType getListingType();

	/**
	 * @param listingType the listingType to set
	 */
	public void setListingType(ListingType listingType);

	/**
	 * @return the content
	 */
	public String getContent();

	/**
	 * @param content the content to set
	 */
	public void setContent(String content);

}