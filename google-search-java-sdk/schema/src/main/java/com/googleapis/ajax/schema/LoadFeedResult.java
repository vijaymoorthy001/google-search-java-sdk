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
package com.googleapis.ajax.schema;

import java.util.List;


/**
 * The Class WebResult.
 */
public class LoadFeedResult extends SchemaEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8535742587293626160L;
	
	private String feedUrl;
	private String title;
	private String link;
	private String description;
	private String author;
	private List<FeedEntry> entries;
	/**
	 * @return the feedUrl
	 */
	public String getFeedUrl() {
		return feedUrl;
	}
	/**
	 * @param feedUrl the feedUrl to set
	 */
	public void setFeedUrl(String feedUrl) {
		this.feedUrl = feedUrl;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the entries
	 */
	public List<FeedEntry> getEntries() {
		return entries;
	}
	/**
	 * @param entries the entries to set
	 */
	public void setEntries(List<FeedEntry> entries) {
		this.entries = entries;
	}
}
