package com.example.websocketdemo.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Scraper {
	public static void test2() {
		Document doc;
		try {
			doc = Jsoup.connect("https://www.ebay.com/").get();
			
			Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
			
			for (Element image : images) {
				System.out.println(image.attr("src"));
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
