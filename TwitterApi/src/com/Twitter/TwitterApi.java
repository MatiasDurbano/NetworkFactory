package com.Twitter;


import java.util.ArrayList;
import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;



public class TwitterApi {
	private TwitterConfiguration configuration;
	private Twitter twitter;
	
	
	public TwitterApi(TwitterConfiguration arg0) {
		configuration = arg0;
		twitter= configuration.getTwitter();

	}

	@SuppressWarnings("finally")
	public List<Status> obtenerTwitters()  {
		
		List<Status> statuses = new ArrayList<Status>();
		try {
			
        statuses = twitter.getUserTimeline();
     
         return statuses;
         
		} catch (TwitterException  e) {
			System.out.println("error, codigo: "+ e.getErrorCode());
		}
		finally {
			return statuses;
		}
	}
	
	

}
