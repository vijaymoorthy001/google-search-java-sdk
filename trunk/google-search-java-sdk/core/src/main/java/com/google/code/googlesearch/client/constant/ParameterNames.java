/**
 * 
 */
package com.google.code.googlesearch.client.constant;

/**
 * @author nmukhtar
 *
 */
public interface ParameterNames {
	// Standard URL Arguments
	public static final String QUERY = "q";
	public static final String VERSION = "v";
	public static final String USER_IP_ADDRESS = "userip";
	public static final String RESULTSET_SIZE = "rsz";
	public static final String HOST_LANGUAGE = "hl";
	public static final String KEY = "key";
	public static final String START = "start";
	public static final String CALLBACK = "callback";
	public static final String CONTEXT = "context";
	
	// Web Search Specific Arguments
	public static final String CUSTOM_SEARCH_ID = "cx";
	public static final String CUSTOM_SEARCH_URL = "cref";
	public static final String SAFETY_LEVEL = "safe";
	public static final String LANGUAGE_RESTRICTION = "lr";
	public static final String DUPLICATE_FILTER = "filter";
	public static final String COUNTRY_RESTRICTION = "gl";
	
	// Local Search Specific Arguments
	public static final String SEARCH_CENTER_POINT = "sll";
	public static final String BOUNDING_BOX = "sspn";
	public static final String TYPE_OF_LISTING = "mrt";
	
	// Video Search Specific Arguments
	public static final String SCORING = "scoring";
	
	// News Search Specific Arguments
	public static final String GEO = "geo";
	public static final String QSID = "qsid";
	public static final String TOPIC = "topic";
	public static final String NEWS_EDITION = "ned";
	
	// Book Search Specific Arguments
	public static final String BOOK_RESTRICTION = "as_brr";
	public static final String BOOK_LIBRARY = "as_list";
	
	// Image Search Specific Arguments
	public static final String IMAGE_SIZE = "imgsz";
	public static final String IMAGE_COLORIZATION = "imgc";
	public static final String IMAGE_COLOR = "imgcolor";
	public static final String IMAGE_TYPE = "imgtype";
	public static final String IMAGE_FILE_TYPE = "as_filetype";
	public static final String IMAGE_RIGHTS = "as_rights";
	public static final String IMAGE_SITE_SEARCH = "as_sitesearch";
	
	// Patent Search Specific Arguments
	public static final String PATENTS_ISSUED = "as_psrg";
	public static final String PATENTS_FILED = "as_psra";
}
