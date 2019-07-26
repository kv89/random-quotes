package com.random.reader.model;

import java.util.List;

public class Quote {
	private String Quote;
	private String Auther;
	private List<String> Tags;
	private String Category;

	public Quote(String quote, String auther, List<String> tags, String category) {
		super();
		Quote = quote;
		Auther = auther;
		Tags = tags;
		Category = category;
	}

	public String getQuote() {
		return Quote;
	}

	public void setQuote(String quote) {
		Quote = quote;
	}

	public String getAuther() {
		return Auther;
	}

	public void setAuther(String auther) {
		Auther = auther;
	}

	public List<String> getTags() {
		return Tags;
	}

	public void setTags(List<String> tags) {
		Tags = tags;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	@Override
	public String toString() {
		return "Quote [Quote=" + Quote + ", Auther=" + Auther + ", Tags=" + Tags + ", Category=" + Category + "]";
	}
}
