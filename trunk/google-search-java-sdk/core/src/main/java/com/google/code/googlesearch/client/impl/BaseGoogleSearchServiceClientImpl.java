package com.google.code.googlesearch.client.impl;

import java.util.concurrent.ExecutorService;

import com.google.code.googlesearch.client.GoogleSearchClient;

/**
 * The Class BaseGoogleSearchServiceClientImpl.
 */
public abstract class BaseGoogleSearchServiceClientImpl implements
	GoogleSearchClient {
	
    /** The task executor. */
    protected ExecutorService taskExecutor;

	/**
	 * Gets the task executor.
	 * 
	 * @return the task executor
	 */
	public ExecutorService getTaskExecutor() {
		return taskExecutor;
	}

	/**
	 * Sets the task executor.
	 * 
	 * @param taskExecutor the new task executor
	 */
	public void setTaskExecutor(ExecutorService taskExecutor) {
		this.taskExecutor = taskExecutor;
	}
}
