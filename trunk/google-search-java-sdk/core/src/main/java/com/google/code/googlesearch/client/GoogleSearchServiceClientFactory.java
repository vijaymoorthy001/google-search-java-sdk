/**
 *
 */
package com.google.code.googlesearch.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.googlesearch.client.impl.GoogleSearchJsonClientImpl;

/**
 * A factory for creating LinkedInApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class GoogleSearchServiceClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();
    
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
    public GoogleSearchClient createGoogleSearchClient() {
    	GoogleSearchClient client = new GoogleSearchJsonClientImpl();
//    	client.setTaskExecutor(taskExecutor);
    	return client;
    }
}
