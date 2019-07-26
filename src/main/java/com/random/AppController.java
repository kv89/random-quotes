package com.random;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.random.reader.FileReader;
import com.random.reader.model.Quote;

@RestController
public class AppController {
	private final AtomicLong counter = new AtomicLong(0);
	
	@RequestMapping("/quote")// later consume 'tag' parameter for tag specific random quotes
	public Quote getQuote() throws JsonIOException, JsonSyntaxException, IOException {
		System.out.println("User no:- " + counter.incrementAndGet());
		
		return FileReader.readNextQuote();
	}
}
