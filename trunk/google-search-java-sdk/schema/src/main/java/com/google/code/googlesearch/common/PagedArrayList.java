/*
 * 
 */
package com.google.code.googlesearch.common;

import java.util.ArrayList;
import java.util.List;


/**
 * The Class PagedArrayList.
 */
public class PagedArrayList<E> extends ArrayList<E> implements PagedList<E> {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5011544152511118680L;
	
	private Cursor cursor = new Cursor();
	
	/**
	 * @return the cursor
	 */
	public Cursor getCursor() {
		return cursor;
	}
	/**
	 * @param cursor the cursor to set
	 */
	public void setCursor(Cursor cursor) {
		this.cursor = cursor;
	}
	/**
	 * @return the pages
	 */
	public List<Page> getPages() {
		return cursor.getPages();
	}
	/**
	 * @return the estimatedResultCount
	 */
	public long getEstimatedResultCount() {
		return cursor.getEstimatedResultCount();
	}
	/**
	 * @return the currentPageIndex
	 */
	public int getCurrentPageIndex() {
		return cursor.getCurrentPageIndex();
	}
	/**
	 * @return the moreResultsUrl
	 */
	public String getMoreResultsUrl() {
		return cursor.getMoreResultsUrl();
	}
	
	public static class Cursor {
		private List<Page> pages = new ArrayList<Page>();
		
		private long estimatedResultCount;
		private int currentPageIndex;
		private String moreResultsUrl;
		
		/**
		 * @return the pages
		 */
		public List<Page> getPages() {
			return pages;
		}
		/**
		 * @param pages the pages to set
		 */
		public void setPages(List<Page> pages) {
			this.pages = pages;
		}
		/**
		 * @return the estimatedResultCount
		 */
		public long getEstimatedResultCount() {
			return estimatedResultCount;
		}
		/**
		 * @param estimatedResultCount the estimatedResultCount to set
		 */
		public void setEstimatedResultCount(long estimatedResultCount) {
			this.estimatedResultCount = estimatedResultCount;
		}
		/**
		 * @return the currentPageIndex
		 */
		public int getCurrentPageIndex() {
			return currentPageIndex;
		}
		/**
		 * @param currentPageIndex the currentPageIndex to set
		 */
		public void setCurrentPageIndex(int currentPageIndex) {
			this.currentPageIndex = currentPageIndex;
		}
		/**
		 * @return the moreResultsUrl
		 */
		public String getMoreResultsUrl() {
			return moreResultsUrl;
		}
		/**
		 * @param moreResultsUrl the moreResultsUrl to set
		 */
		public void setMoreResultsUrl(String moreResultsUrl) {
			this.moreResultsUrl = moreResultsUrl;
		}
	}
}
