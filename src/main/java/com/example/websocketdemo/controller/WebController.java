package com.example.websocketdemo.controller;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.websocketdemo.model.AppUser;

import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	public String login() {
	    return "login.html"; 
	}
	
	
	@RequestMapping(value = "/discover", method = RequestMethod.GET)
	public String discover() {
	    return "discover.html";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
	    return "about.html";
	}
	
	@RequestMapping(value = "/agriculture", method = RequestMethod.GET)
	public String agriculture() {
	    return "agriculture.html";
	}
	
	@RequestMapping(value = "/business", method = RequestMethod.GET)
	public String business() {
	    return "business.html";
	}
	
	@RequestMapping(value = "/education", method = RequestMethod.GET)
	public String education() {
	    return "education.html";
	}
	
	@RequestMapping(value = "/engineering", method = RequestMethod.GET)
	public String engineering() {
	    return "engineering.html";
	}
	
	@RequestMapping(value = "/environmentaldesign", method = RequestMethod.GET)
	public String environmentaldesign() {
	    return "environmentaldesign.html";
	}
	
	@RequestMapping(value = "/hospitality", method = RequestMethod.GET)
	public String hospitality() {
	    return "hospitality.html";
	}
	
	@RequestMapping(value = "/lettersArtsSocialSciences", method = RequestMethod.GET)
	public String lettersArtsSocialSciences() {
	    return "lettersArtsSocialSciences.html";
	}
	
	@RequestMapping(value = "/science", method = RequestMethod.GET)
	public String science() {
	    return "science.html";
	}
}
