package com.example.websocketdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class TwitterController {
	
	public static final String TWITTER_BASE_URI = "tweets";
	
	@Autowired
	private Twitter twitter;
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Tweet> getTweets() {
		return twitter.timelineOperations().getUserTimeline("taylorswift13");
	}
}
