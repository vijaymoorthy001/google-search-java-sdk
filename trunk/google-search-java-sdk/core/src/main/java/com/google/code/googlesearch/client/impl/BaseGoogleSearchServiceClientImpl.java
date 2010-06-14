package com.google.code.googlesearch.client.impl;

import java.util.List;
import java.util.concurrent.ExecutorService;

import com.google.code.googlesearch.client.GoogleSearchClient;
import com.google.code.googlesearch.schema.AdultOption;
import com.google.code.googlesearch.schema.SchemaElementFactory;
import com.google.code.googlesearch.schema.SearchOption;
import com.google.code.googlesearch.schema.SearchRequest;
import com.google.code.googlesearch.schema.SourceType;
import com.google.code.googlesearch.schema.mobileweb.MobileWebRequest;
import com.google.code.googlesearch.schema.mobileweb.MobileWebSearchOption;
import com.google.code.googlesearch.schema.multimedia.ImageRequest;
import com.google.code.googlesearch.schema.multimedia.VideoRequest;
import com.google.code.googlesearch.schema.multimedia.VideoSortOption;
import com.google.code.googlesearch.schema.news.NewsRequest;
import com.google.code.googlesearch.schema.news.NewsSortOption;
import com.google.code.googlesearch.schema.phonebook.PhonebookRequest;
import com.google.code.googlesearch.schema.phonebook.PhonebookSortOption;
import com.google.code.googlesearch.schema.translation.TranslationRequest;
import com.google.code.googlesearch.schema.web.WebRequest;
import com.google.code.googlesearch.schema.web.WebSearchOption;

public abstract class BaseGoogleSearchServiceClientImpl implements
	GoogleSearchClient {
	
    /** Field description */
    protected ExecutorService taskExecutor;

	protected final SchemaElementFactory OBJECT_FACTORY = createObjectFactory();
	
	public static class SearchRequestBuilderImpl implements SearchRequestBuilder {
		protected SearchRequest result;
		protected SchemaElementFactory factory;
		
		protected SearchRequestBuilderImpl(SchemaElementFactory factory) {
			this.factory = factory;
			this.result = factory.createSearchRequest();
		}

		@Override
		public SearchRequestBuilder withAppId(String applicationId) {
			getParameters().setAppId(applicationId);
			return this;
		}

		@Override
		public SearchRequestBuilder withAdultOption(AdultOption adult) {
			getParameters().setAdult(adult);
			return this;
		}

		@Override
		public SearchRequestBuilder withImageRequestCount(Long count) {
			getImageRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withImageRequestFilter(String filter) {
			getImageRequestFilters().add(filter);
			return this;
		}

		@Override
		public SearchRequestBuilder withImageRequestOffset(Long offset) {
			getImageRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withLatitude(Double latitude) {
			getParameters().setLatitude(latitude);
			return this;
		}

		@Override
		public SearchRequestBuilder withLongitude(Double longitude) {
			getParameters().setLongitude(longitude);
			return this;
		}

		@Override
		public SearchRequestBuilder withMarket(String market) {
			getParameters().setMarket(market);
			return this;
		}

		@Override
		public SearchRequestBuilder withMobileWebRequestCount(Long count) {
			getMobileWebRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withMobileWebRequestOffset(Long offset) {
			getMobileWebRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withMobileWebRequestSearchOption(
				MobileWebSearchOption mobileWebSearchOption) {
			getMobileWebRequestOptions().add(mobileWebSearchOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestCategory(String category) {
			getNewsRequest().setCategory(category);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestCount(Long count) {
			getNewsRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestLocationOverride(
				String locationOverride) {
			getNewsRequest().setLocationOverride(locationOverride);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestOffset(Long offset) {
			getNewsRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestSortOption(
				NewsSortOption newsSortOption) {
			getNewsRequest().setSortBy(newsSortOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestCategory(String category) {
			getPhonebookRequest().setCategory(category);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestCount(Long count) {
			getPhonebookRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestFileType(String fileType) {
			getPhonebookRequest().setFileType(fileType);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestLocId(String locId) {
			getPhonebookRequest().setLocId(locId);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestOffset(Long offset) {
			getPhonebookRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestSortOption(
				PhonebookSortOption phonebookSortOption) {
			getPhonebookRequest().setSortBy(phonebookSortOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withQuery(String query) {
			getParameters().setQuery(query);
			return this;
		}

		@Override
		public SearchRequestBuilder withRadius(Double radius) {
			getParameters().setRadius(radius);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOption(SearchOption searchOption) {
			getParameterOptions().add(searchOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withSourceType(SourceType sourceType) {
			getParameterSources().add(sourceType);
			return this;
		}

		@Override
		public SearchRequestBuilder withTranslationRequestSourceLanguage(
				String sourceLanguage) {
			getTranslationRequest().setSourceLanguage(sourceLanguage);
			return this;
		}

		@Override
		public SearchRequestBuilder withTranslationRequestTargetLanguage(
				String targetLanguage) {
			getTranslationRequest().setTargetLanguage(targetLanguage);
			return this;
		}

		@Override
		public SearchRequestBuilder withUILanguage(String uiLanguage) {
			getParameters().setUILanguage(uiLanguage);
			return this;
		}

		@Override
		public SearchRequestBuilder withVersion(String version) {
			getParameters().setVersion(version);
			return this;
		}

		@Override
		public SearchRequestBuilder withVideoRequestCount(Long count) {
			getVideoRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withVideoRequestFilter(String filter) {
			getVideoRequestFilters().add(filter);
			return this;
		}

		@Override
		public SearchRequestBuilder withVideoRequestOffset(Long offset) {
			getVideoRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withVideoRequestSortOption(
				VideoSortOption videoSortOption) {
			getVideoRequest().setSortBy(videoSortOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestCount(Long count) {
			getWebRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestFileType(String fileType) {
			getWebRequest().setFileType(fileType);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestOffset(Long offset) {
			getWebRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestSearchOption(
				WebSearchOption webSearchOption) {
			getWebRequestOptions().add(webSearchOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestSearchTag(String searchTag) {
			getWebRequestSearchTags().add(searchTag);
			return this;
		}

		public SearchRequest getResult() {
			return result;
		}

		@Override
		public void reset() {
			result = factory.createSearchRequest();
		}
		
		private SearchRequest getParameters() {
			return result;
		}
		
		private ImageRequest getImageRequest() {
			if (getParameters().getImageRequest() == null) {
				getParameters().setImageRequest(factory.createImageRequest());
			}
			return getParameters().getImageRequest();
		}

		private MobileWebRequest getMobileWebRequest() {
			if (getParameters().getMobileWebRequest() == null) {
				getParameters().setMobileWebRequest(factory.createMobileWebRequest());
			}
			return getParameters().getMobileWebRequest();
		}

		private NewsRequest getNewsRequest() {
			if (getParameters().getNewsRequest() == null) {
				getParameters().setNewsRequest(factory.createNewsRequest());
			}
			return getParameters().getNewsRequest();
		}

		private PhonebookRequest getPhonebookRequest() {
			if (getParameters().getPhonebookRequest() == null) {
				getParameters().setPhonebookRequest(factory.createPhonebookRequest());
			}
			return getParameters().getPhonebookRequest();
		}

		private TranslationRequest getTranslationRequest() {
			if (getParameters().getTranslationRequest() == null) {
				getParameters().setTranslationRequest(factory.createTranslationRequest());
			}
			return getParameters().getTranslationRequest();
		}
		
		private VideoRequest getVideoRequest() {
			if (getParameters().getVideoRequest() == null) {
				getParameters().setVideoRequest(factory.createVideoRequest());
			}
			return getParameters().getVideoRequest();
		}
		
		private WebRequest getWebRequest() {
			if (getParameters().getWebRequest() == null) {
				getParameters().setWebRequest(factory.createWebRequest());
			}
			return getParameters().getWebRequest();
		}
		
		private  List<String> getImageRequestFilters() {
			return getImageRequest().getFilterList();
		}

		private  List<MobileWebSearchOption> getMobileWebRequestOptions() {
			return getMobileWebRequest().getMobileWebSearchOptionList();
		}
		
		private  List<SearchOption> getParameterOptions() {
			return getParameters().getSearchOptionList();
		}

		private  List<SourceType> getParameterSources() {
			return getParameters().getSourceTypeList();
		}

		private  List<String> getVideoRequestFilters() {
			return getVideoRequest().getFilterList();
		}
		
		private  List<WebSearchOption> getWebRequestOptions() {
			return getWebRequest().getWebSearchOptionList();
		}
		
		private  List<String> getWebRequestSearchTags() {
			return getWebRequest().getSearchTagList();
		}
	}

	@Override
	public SearchRequestBuilder newSearchRequestBuilder() {
		return new SearchRequestBuilderImpl(OBJECT_FACTORY);
	}

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

	protected abstract SchemaElementFactory createObjectFactory();
}
