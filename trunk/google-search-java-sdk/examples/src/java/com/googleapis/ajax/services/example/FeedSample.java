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
package com.googleapis.ajax.services.example;

import java.text.MessageFormat;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.googleapis.ajax.schema.FeedEntry;
import com.googleapis.ajax.schema.FindFeedResult;
import com.googleapis.ajax.schema.LoadFeedResult;
import com.googleapis.ajax.services.FindFeedQuery;
import com.googleapis.ajax.services.GoogleSearchQueryFactory;
import com.googleapis.ajax.services.LoadFeedQuery;

/**
 * The Class TranslationSample.
 */
public class FeedSample {

    /** The Constant APPLICATION_KEY_OPTION. */
    private static final String APPLICATION_KEY_OPTION = "appid";
	
    /** The Constant QUERY_OPTION. */
    private static final String QUERY_OPTION = "query";
	
    /** The Constant HELP_OPTION. */
    private static final String HELP_OPTION = "help";
    
    /**
     * The main method.
     * 
     * @param args the arguments
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
	 * Process command line.
	 * 
	 * @param line the line
	 * @param options the options
	 */
    private static void processCommandLine(CommandLine line, Options options) {
        if(line.hasOption(HELP_OPTION)) {
            printHelp(options);            
        } else if(line.hasOption(APPLICATION_KEY_OPTION) && line.hasOption(QUERY_OPTION)) {
    		GoogleSearchQueryFactory factory = GoogleSearchQueryFactory.newInstance(line.getOptionValue(APPLICATION_KEY_OPTION));
    		FindFeedQuery findFeedQuery = factory.newFindFeedQuery();
    		FindFeedResult findResponse = findFeedQuery.withQuery("hadoop").singleResult();
    		printResponse(findResponse);
    		LoadFeedQuery loadFeedQuery = factory.newLoadFeedQuery();
    		LoadFeedResult loadResponse = loadFeedQuery.withNumber(10).withQuery(line.getOptionValue(QUERY_OPTION)).singleResult();
			printResponse(loadResponse);
        } else {
        	printHelp(options);
        }
	}

	private static void printResponse(LoadFeedResult result) {
		System.out.println(result.getTitle());
		for (FeedEntry entry : result.getEntries()) {
			System.out.println(entry.getTitle());
		}
	}

	private static void printResponse(FindFeedResult result) {
		System.out.println(result.getQuery());
		for (FeedEntry entry : result.getEntries()) {
			System.out.println(entry.getTitle() + ":" + entry.getLink());
		}
	}
	
	/**
	 * Builds the options.
	 * 
	 * @return the options
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
        
        return opts;
    }
    
    /**
     * Prints the help.
     * 
     * @param options the options
     */
    private static void printHelp(Options options) {
        int width = 80;
        String syntax = FeedSample.class.getName() + " <options>";
        String header = MessageFormat.format("\nThe -{0} and -{1} options are required. All others are optional.", APPLICATION_KEY_OPTION, QUERY_OPTION);
        new HelpFormatter().printHelp(width, syntax, header, options, null, false);
    }
}
