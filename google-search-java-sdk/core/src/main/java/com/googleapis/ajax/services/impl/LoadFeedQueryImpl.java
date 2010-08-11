/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.googleapis.ajax.services.impl;

import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.googleapis.ajax.schema.LoadFeedResult;
import com.googleapis.ajax.services.GoogleSearchException;
import com.googleapis.ajax.services.LoadFeedQuery;
import com.googleapis.ajax.services.constant.GoogleSearchApiUrls;
import com.googleapis.ajax.services.constant.ParameterNames;

/**
 * The Class WebSearchQueryImpl.
 */
public class LoadFeedQueryImpl extends BaseGoogleSearchApiQuery<LoadFeedResult> implements
		LoadFeedQuery {
	
	/**
	 * Instantiates a new web search query impl.
	 * 
	 * @param applicationId the application id
	 */
	public LoadFeedQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(GoogleSearchApiUrls.FEED_LOAD_URL);
	}


	@Override
	public LoadFeedQuery withHistory() {
		apiUrlBuilder.withParameter(ParameterNames.SCORING, "h");
		return this;
	}

	@Override
	public LoadFeedQuery withNumber(int number) {
		apiUrlBuilder.withParameter(ParameterNames.NUM, String.valueOf(number));
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected LoadFeedResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, LoadFeedResult.class);
	}
	
	@Override
	public LoadFeedResult singleResult() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiGet(apiUrlBuilder.buildUrl());
        	JsonElement response = parser.parse(new InputStreamReader(jsonContent, UTF_8_CHAR_SET));
        	if (response.isJsonObject()) {
        		JsonObject json = response.getAsJsonObject();
        		int status = json.get("responseStatus").getAsInt();
        		if (status != 200) {
        			throw new GoogleSearchException(json.get("responseDetails").getAsString());
        		}
        		JsonElement data = json.get("responseData");
        		if (data != null) {
        			return unmarshall(data.getAsJsonObject().get("feed"));
        		}
        	}
        	throw new GoogleSearchException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new GoogleSearchException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}
	
}
