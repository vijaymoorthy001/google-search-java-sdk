package com.google.code.googlesearch.client.impl;

import java.util.concurrent.ExecutorService;

import com.google.code.googlesearch.client.GoogleSearchClient;

public abstract class BaseGoogleSearchServiceClientImpl implements
	GoogleSearchClient {
	
    /** Field description */
    protected ExecutorService taskExecutor;

	/**
	 * @return the taskExecutor
	 */
	public ExecutorService getTaskExecutor() {
		return taskExecutor;
	}

	/**
	 * @param taskExecutor the taskExecutor to set
	 */
	public void setTaskExecutor(ExecutorService taskExecutor) {
		this.taskExecutor = taskExecutor;
	}
}
