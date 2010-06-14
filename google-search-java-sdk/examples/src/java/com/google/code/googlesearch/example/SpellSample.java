/**
 * 
 */
package com.google.code.googlesearch.example;

import java.text.MessageFormat;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.google.code.bing.search.client.ApiProtocol;
import com.google.code.googlesearch.client.BingSearchClient;
import com.google.code.googlesearch.client.BingSearchServiceClientFactory;
import com.google.code.googlesearch.client.BingSearchClient.SearchRequestBuilder;
import com.google.code.googlesearch.schema.SearchOption;
import com.google.code.googlesearch.schema.SearchRequest;
import com.google.code.googlesearch.schema.SearchResponse;
import com.google.code.googlesearch.schema.SourceType;
import com.google.code.googlesearch.schema.spell.SpellResult;

/**
 * @author nmukhtar
 *
 */
public class SpellSample {

    /**
     * Application Key
     */
    private static final String APPLICATION_KEY_OPTION = "appid";
	
    /**
     * Query
     */
    private static final String QUERY_OPTION = "query";
	
    /**
     * Query
     */
    private static final String PROTOCOL_OPTION = "protocol";
    
    /**
     * Name of the help command line option.
     */
    private static final String HELP_OPTION = "help";
    
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		Options options = buildOptions();
        try {
            CommandLine line = new BasicParser().parse(options, args);
            processCommandLine(line, options);
        } catch(ParseException exp ) {
            System.err.println(exp.getMessage());
            printHelp(options);
        }
	}
    
	/**
	 * @param args
	 */
    private static void processCommandLine(CommandLine line, Options options) {
        if(line.hasOption(HELP_OPTION)) {
            printHelp(options);            
        } else if(line.hasOption(APPLICATION_KEY_OPTION) && line.hasOption(QUERY_OPTION)) {
        	ApiProtocol protocol = ApiProtocol.JSON;
        	if (line.hasOption(PROTOCOL_OPTION)) {
        		protocol = ApiProtocol.fromValue(line.getOptionValue(PROTOCOL_OPTION));
        		if (protocol == null) {
        			printHelp(options);
        			return;
        		}
        	}
        	
    		BingSearchServiceClientFactory factory = BingSearchServiceClientFactory.newInstance();
    		BingSearchClient client = factory.createBingSearchClient(protocol);
    		SearchResponse response = client.search(createSearchRequest(client, line.getOptionValue(APPLICATION_KEY_OPTION), line.getOptionValue(QUERY_OPTION)));
    		printResponse(response);
        } else {
        	printHelp(options);
        }
	}

	/**
     * Build command line options object.
     */
    private static Options buildOptions() {
       
        Options opts = new Options();
        
        String helpMsg = "Print this message.";
        Option help = new Option(HELP_OPTION, helpMsg);
        opts.addOption(help);

        String applicationKeyMsg = "You Application ID.";
        OptionBuilder.withArgName("appid");
        OptionBuilder.hasArg();
        OptionBuilder.withDescription(applicationKeyMsg);
        Option applicationKey = OptionBuilder.create(APPLICATION_KEY_OPTION);
        opts.addOption(applicationKey);
        
        String queryMsg = "Search Query.";
        OptionBuilder.withArgName("query");
        OptionBuilder.hasArg();
        OptionBuilder.withDescription(queryMsg);
        Option query = OptionBuilder.create(QUERY_OPTION);
        opts.addOption(query);
        
        String protocolMsg = "API Protocol";
        OptionBuilder.withArgName("protocol");
        OptionBuilder.hasArg();
        OptionBuilder.withDescription(protocolMsg);
        Option protocol = OptionBuilder.create(PROTOCOL_OPTION);
        opts.addOption(protocol);
        
        return opts;
    }
    
    /**
     * Print help and usage.
     */
    private static void printHelp(Options options) {
        int width = 80;
        String syntax = SpellSample.class.getName() + " <options>";
        String header = MessageFormat.format("\nThe -{0} and -{1} options are required. All others are optional.", APPLICATION_KEY_OPTION, QUERY_OPTION);
        String footer = MessageFormat.format("\nThe valid values for -{0} option are xml|json|soap. The default is json.", PROTOCOL_OPTION);
        new HelpFormatter().printHelp(width, syntax, header, options, footer, false);
    }

	private static void printResponse(SearchResponse response) {
		System.out.println("Bing API Version " + response.getVersion());
		System.out.println("Spell results for " + response.getQuery().getSearchTerms());
		for (SpellResult result : response.getSpell().getResults().getSpellResultList()) {
			System.out.println(result.getValue());
		}
	}

	private static SearchRequest createSearchRequest(BingSearchClient client, String applicationId, String query) {
		SearchRequestBuilder builder = client.newSearchRequestBuilder();
		builder.withAppId(applicationId);
		builder.withQuery(query);
		builder.withSourceType(SourceType.SPELL);
		builder.withVersion("2.0");
		builder.withMarket("en-us");
		builder.withSearchOption(SearchOption.ENABLE_HIGHLIGHTING);
		return builder.getResult();
	}
}
