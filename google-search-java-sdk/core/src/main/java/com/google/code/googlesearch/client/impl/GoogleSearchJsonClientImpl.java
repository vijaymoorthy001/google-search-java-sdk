/**
 *
 */
package com.google.code.googlesearch.client.impl;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebResult;
import javax.management.Query;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.code.googlesearch.client.GoogleSearchException;
import com.google.code.googlesearch.client.constant.GoogleSearchApiUrls.BingSearchApiUrlBuilder;
import com.google.code.googlesearch.schema.SchemaEntity;
import com.google.code.googlesearch.schema.adapter.Adaptable;

/**
 * @author Nabeel Mukhtar
 *
 */
public class GoogleSearchJsonClientImpl extends BaseGoogleSearchApiClient {

    /** Field description */
    private static final SchemaElementFactory OBJECT_FACTORY = new JsonElementFactory();
    
    /** Field description */
    private final JSONParser parser = new JSONParser();
    
    /** Field description */
	private static final Map<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>> ADAPTER_CLASSES_MAP = new HashMap<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>>();
	
	static {
		ADAPTER_CLASSES_MAP.put(SearchResponse.class, SearchResponseImpl.class);
	}
    
    /**
     * Method description
     *
     *
     * @param xmlContent
     * @param <T>
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    protected <T> T unmarshallObject(Class<T> clazz, InputStream jsonContent) {
        try {
        	Object response = parser.parse(new InputStreamReader(jsonContent));
        	if (response instanceof JSONObject) {
        		if (((JSONObject) response).get("SearchResponse") != null) {
            		Adaptable<?, JSONObject> adaptable = (Adaptable<?, JSONObject>) ADAPTER_CLASSES_MAP.get(clazz).newInstance();
            		adaptable.adaptFrom((JSONObject) ((JSONObject) response).get("SearchResponse"));
            		return (T) adaptable;
        		}
        	}
        	throw new GoogleSearchException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new GoogleSearchException(e);
        }
    }

    /**
     * Method description
     *
     *
     * @param element
     *
     * @return
     */
    protected String marshallObject(Object element) {
        try {
            StringWriter writer = new StringWriter();
            
            // TODO-NM: Implement this method.
            return writer.toString();
        } catch (Exception e) {
            throw new GoogleSearchException(e);
        }
    }

    /**
     * Method description
     *
     * @return
     */
    protected SchemaElementFactory createObjectFactory() {
    	return OBJECT_FACTORY;
    }
    
    /**
     * Method description
     *
     *
     * @param urlFormat
     *
     * @return
     */
    protected BingSearchApiUrlBuilder createBingSearchApiUrlBuilder(String urlFormat) {
        return new BingSearchApiUrlBuilder(urlFormat, SUPPORTED_PROTOCOL);
    }
    
	private static class JsonElementFactory implements SchemaElementFactory {
		public JsonElementFactory() {
			super();
		}

		@Override
		public DeepLink createDeepLink() {
			return new DeepLinkImpl();
		}

		@Override
		public Error createError() {
			return new ErrorImpl();
		}

		@Override
		public ImageRequest createImageRequest() {
			return new ImageRequestImpl();
		}

		@Override
		public ImageResponse createImageResponse() {
			return new ImageImpl();
		}

		@Override
		public ImageResult createImageResult() {
			return new ImageResultImpl();
		}

		@Override
		public InstantAnswerResponse createInstantAnswerResponse() {
			return new InstantAnswerImpl();
		}

		@Override
		public InstantAnswerResult createInstantAnswerResult() {
			return new InstantAnswerResultImpl();
		}

		@Override
		public MobileWebRequest createMobileWebRequest() {
			return new MobileWebRequestImpl();
		}

		@Override
		public MobileWebResponse createMobileWebResponse() {
			return new MobileWebImpl();
		}

		@Override
		public MobileWebResult createMobileWebResult() {
			return new MobileWebResultImpl();
		}

		@Override
		public NewsArticle createNewsArticle() {
			return new NewsArticleImpl();
		}

		@Override
		public NewsCollection createNewsCollection() {
			return new NewsCollectionImpl();
		}

		@Override
		public NewsRelatedSearch createNewsRelatedSearch() {
			return new NewsRelatedSearchImpl();
		}

		@Override
		public NewsRequest createNewsRequest() {
			return new NewsRequestImpl();
		}

		@Override
		public NewsResponse createNewsResponse() {
			return new NewsImpl();
		}

		@Override
		public NewsResult createNewsResult() {
			return new NewsResultImpl();
		}

		@Override
		public PhonebookRequest createPhonebookRequest() {
			return new PhonebookRequestImpl();
		}

		@Override
		public PhonebookResponse createPhonebookResponse() {
			return new PhonebookImpl();
		}

		@Override
		public PhonebookResult createPhonebookResult() {
			return new PhonebookResultImpl();
		}

		@Override
		public Query createQuery() {
			return new QueryImpl();
		}

		@Override
		public RelatedSearchResponse createRelatedSearchResponse() {
			return new RelatedSearchImpl();
		}

		@Override
		public RelatedSearchResult createRelatedSearchResult() {
			return new RelatedSearchResultImpl();
		}

		@Override
		public SearchRequest createSearchRequest() {
			return new SearchRequestImpl();
		}

		@Override
		public SearchResponse createSearchResponse() {
			return new SearchResponseImpl();
		}

		@Override
		public SpellResponse createSpellResponse() {
			return new SpellImpl();
		}

		@Override
		public SpellResult createSpellResult() {
			return new SpellResultImpl();
		}

		@Override
		public Thumbnail createThumbnail() {
			return new ThumbnailImpl();
		}

		@Override
		public TranslationRequest createTranslationRequest() {
			return new TranslationRequestImpl();
		}

		@Override
		public TranslationResponse createTranslationResponse() {
			return new TranslationImpl();
		}

		@Override
		public TranslationResult createTranslationResult() {
			return new TranslationResultImpl();
		}

		@Override
		public VideoRequest createVideoRequest() {
			return new VideoRequestImpl();
		}

		@Override
		public VideoResponse createVideoResponse() {
			return new VideoImpl();
		}

		@Override
		public VideoResult createVideoResult() {
			return new VideoResultImpl();
		}

		@Override
		public WebRequest createWebRequest() {
			return new WebRequestImpl();
		}

		@Override
		public WebResponse createWebResponse() {
			return new WebImpl();
		}

		@Override
		public WebResult createWebResult() {
			return new WebResultImpl();
		}

		@Override
		public WebSearchTag createWebSearchTag() {
			return new WebSearchTagImpl();
		}
	}
}
