package com.random;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.random.reader.FileReader;

/*
 * https://itnext.io/using-java-to-read-really-really-large-files-a6f8a3f44649
 * https://www.baeldung.com/java-read-lines-large-file
 * 
 * 
*/
@SpringBootApplication
public class App {
	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, IOException {
		SpringApplication.run(App.class, args);
		FileReader.init();
	}
	
	
	public void displayQuotes(Integer n) throws JsonIOException, JsonSyntaxException, IOException {
		for(int i=0; i<n; i++) {
			System.out.println("Quote : " + FileReader.readNextQuote().getQuote());
		}
	}
}
