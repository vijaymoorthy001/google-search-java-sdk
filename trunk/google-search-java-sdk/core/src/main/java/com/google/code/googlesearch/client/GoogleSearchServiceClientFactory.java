/**
 *
 */
package com.google.code.googlesearch.client;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.bing.search.client.ApiProtocol;
import com.google.code.bing.search.client.BaseBingSearchServiceClientImpl;
import com.google.code.bing.search.client.BingSearchJsonClientImpl;
import com.google.code.googlesearch.BingSearchClient;
import com.google.code.googlesearch.BingSearchServiceClientFactory;
import com.google.code.googlesearch.client.impl.BingSearchJaxbClientImpl;
import com.google.code.googlesearch.client.impl.BingSearchRssClientImpl;
import com.google.code.googlesearch.client.impl.BingSearchSoapClientImpl;

/**
 * A factory for creating LinkedInApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class GoogleSearchServiceClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();
    
    private static final Map<ApiProtocol, GoogleSearchClient> clientImplementations = new EnumMap<ApiProtocol, GoogleSearchClient>(ApiProtocol.class);
    
    static {
    	clientImplementations.put(ApiProtocol.JSON, new GoogleSearchJsonClientImpl());
    	clientImplementations.put(ApiProtocol.XML, new BingSearchJaxbClientImpl());
    	clientImplementations.put(ApiProtocol.SOAP, new BingSearchSoapClientImpl());
    	clientImplementations.put(ApiProtocol.RSS, new BingSearchRssClientImpl());
    }
    
    private GoogleSearchServiceClientFactory() {}

    /**
     * Sets the task executor to be used for asynchronous API calls. 
     * 
     * @param taskExecutor the task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

    /**
     * New instance.
     * 
     * @param consumerKey the consumer key
     * @param consumerSecret the consumer secret
     * 
     * @return the linked in api client factory
     */
    public static GoogleSearchServiceClientFactory newInstance() {
        return new GoogleSearchServiceClientFactory();
    }
    
    /**
     * 
     * 
     */
    public GoogleSearchClient createBingSearchClient(ApiProtocol protocol) {
    	BaseGoogleSearchServiceClientImpl client = (BaseGoogleSearchServiceClientImpl) clientImplementations.get(protocol);
    	client.setTaskExecutor(taskExecutor);
    	return client;
    }
}