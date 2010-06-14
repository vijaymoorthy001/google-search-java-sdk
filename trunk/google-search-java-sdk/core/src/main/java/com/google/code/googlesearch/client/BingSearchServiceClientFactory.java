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
public class BingSearchServiceClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();
    
    private static final Map<ApiProtocol, BingSearchClient> clientImplementations = new EnumMap<ApiProtocol, BingSearchClient>(ApiProtocol.class);
    
    static {
    	clientImplementations.put(ApiProtocol.JSON, new BingSearchJsonClientImpl());
    	clientImplementations.put(ApiProtocol.XML, new BingSearchJaxbClientImpl());
    	clientImplementations.put(ApiProtocol.SOAP, new BingSearchSoapClientImpl());
    	clientImplementations.put(ApiProtocol.RSS, new BingSearchRssClientImpl());
    }
    
    private BingSearchServiceClientFactory() {}

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
    public static BingSearchServiceClientFactory newInstance() {
        return new BingSearchServiceClientFactory();
    }
    
    /**
     * 
     * 
     */
    public BingSearchClient createBingSearchClient(ApiProtocol protocol) {
    	BaseBingSearchServiceClientImpl client = (BaseBingSearchServiceClientImpl) clientImplementations.get(protocol);
    	client.setTaskExecutor(taskExecutor);
    	return client;
    }
}
