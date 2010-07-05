/*
 * 
 */
package com.googleapis.ajax.common;

import java.util.List;

/**
 * The Interface PagedList.
 */
public interface PagedList<E> extends List<E> {
	public class Page {
		private int start;
		private int label;
		
		/**
		 * @return the start
		 */
		public int getStart() {
			return start;
		}
		/**
		 * @param start the start to set
		 */
		public void setStart(int start) {
			this.start = start;
		}
		/**
		 * @return the label
		 */
		public int getLabel() {
			return label;
		}
		/**
		 * @param label the label to set
		 */
		public void setLabel(int label) {
			this.label = label;
		}

		@Override
		public String toString() {
			return "Page [label=" + label + ", start=" + start + "]";
		}
	}
	
	
	/**
	 * @return the pages
	 */
	public List<Page> getPages();
	
	/**
	 * @return the estimatedResultCount
	 */
	public long getEstimatedResultCount();
	
	/**
	 * @return the currentPageIndex
	 */
	public int getCurrentPageIndex();
	
	/**
	 * @return the moreResultsUrl
	 */
	public String getMoreResultsUrl();
}
