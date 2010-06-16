/**
 *
 */
package com.google.code.googlesearch.client;


/**
 * The Interface StackExchangeAuthenticationClient.
 */
public interface GoogleSearchAuthenticationClient extends GoogleSearchCommunicationClient {

    /**
     * Sets the application key.
     * 
     * @param applicationKey the new application key
     */
    public void setApplicationKey(String applicationKey);

    /**
     * Gets the application key.
     * 
     * @return the application key
     */
    public String getApplicationKey();
    
	/**
	 * @param userIpAddress the userIpAddress to set
	 */
	public void setUserIpAddress(String userIpAddress);

	/**
	 * @param referer the referer to set
	 */
	public void setReferrer(String referrer);
}
