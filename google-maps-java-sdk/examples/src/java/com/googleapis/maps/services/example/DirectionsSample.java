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
package com.googleapis.maps.services.example;

import java.text.MessageFormat;
import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.googleapis.maps.schema.DirectionsResult;
import com.googleapis.maps.schema.Leg;
import com.googleapis.maps.schema.Step;
import com.googleapis.maps.services.DirectionsQuery;
import com.googleapis.maps.services.GoogleMapsQueryFactory;

/**
 * The Class TranslationSample.
 */
public class DirectionsSample {

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
        } else {
    		GoogleMapsQueryFactory factory = GoogleMapsQueryFactory.newInstance(line.getOptionValue(APPLICATION_KEY_OPTION));
    		DirectionsQuery query = factory.newDirectionsQuery();
    		query.withOrigin("Boston,MA").withDestination("Concord,MA");
    		query.withWaypoints("Charlestown,MA", "Lexington,MA");
    		query.withSensor(false);
    		List<DirectionsResult> response = query.list();
    		for (DirectionsResult directionsResult : response) {
        		printResponse(directionsResult);
			}
        }
	}


	private static void printResponse(DirectionsResult response) {
		System.out.println(response.getSummary());
		for (Leg leg : response.getLegs()) {
			System.out.println(leg.getStartAddress() + ":" + leg.getEndAddress());
			System.out.println(leg.getDistance() + ":" + leg.getDuration());
			for(Step step : leg.getSteps()) {
				System.out.println(step.getDistance() + ":" + step.getDuration());
				System.out.println(step.getTravelMode());
			}
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
        String syntax = DirectionsSample.class.getName() + " <options>";
        String header = MessageFormat.format("\nThe -{0} and -{1} options are required. All others are optional.", APPLICATION_KEY_OPTION, QUERY_OPTION);
        new HelpFormatter().printHelp(width, syntax, header, options, null, false);
    }
}
