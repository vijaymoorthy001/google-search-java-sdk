/**
 *
 */
package com.google.code.googlesearch.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.googlesearch.client.impl.GoogleSearchJsonClientImpl;

/**
 * A factory for creating GoogleSearchServiceClient objects.
 */
public class GoogleSearchServiceClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();
    
    /**
     * Instantiates a new google search service client factory.
     */
    private GoogleSearchServiceClientFactory() {}

    /**
     * Sets the task executor.
     * 
     * @param taskExecutor the new task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

    /**
     * New instance.
     * 
     * @return the google search service client factory
     */
    public static GoogleSearchServiceClientFactory newInstance() {
        return new GoogleSearchServiceClientFactory();
    }
    
    /**
     * Creates a new GoogleSearchServiceClient object.
     * 
     * @return the google search client
     */
    public GoogleSearchClient createGoogleSearchClient() {
    	GoogleSearchClient client = new GoogleSearchJsonClientImpl();
//    	client.setTaskExecutor(taskExecutor);
    	return client;
    }
}
