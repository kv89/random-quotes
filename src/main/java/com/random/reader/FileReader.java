package com.random.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.random.reader.model.Quote;

/*
 * https://sites.google.com/site/gson/streaming
 * http://www.acuriousanimal.com/2015/10/23/reading-json-file-in-stream-mode-with-gson.html
 * 
*/
public class FileReader {
	private static String inputFile = "G:\\codebase\\quotes.json";
	private static File quoteFile = new File(inputFile);
	private static InputStream in = null;
	private static JsonReader jsonReader;
	private static Gson gson;
	private static Quote[] quote;
	
	public static void init() throws JsonIOException, JsonSyntaxException, IOException {
//		if(null == in) {
//			in = FileReader.getFileInputStream();
//			jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(quoteFile)));
//			gson = new GsonBuilder().create();
//
//			// Read file in stream mode
////			jsonReader.beginArray(); //   <----- important line for streaming of file
//			
//			if(jsonReader.hasNext()) {
//				quote = gson.fromJson(jsonReader, Quote[].class);
//			}
//		}
		quote = getQuotes();
	}
	
//	private static InputStream getFileInputStream() throws FileNotFoundException {
//		in = new FileInputStream(quoteFile);
//		return in; 
//	}
	
	public static Quote readNextQuote() throws JsonIOException, JsonSyntaxException, IOException {
		int quoteNum = ThreadLocalRandom.current().nextInt(0, quote.length);
		return quote[quoteNum];		
	}
	
	 
	
	private static Quote[] getQuotes() {
		String quotes = "[\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"Don't cry because it's over, smile because it happened.\",\r\n" + 
				"    \"Author\": \"Dr. Seuss\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"cry\",\r\n" + 
				"      \"crying\",\r\n" + 
				"      \"experience\",\r\n" + 
				"      \"happiness\",\r\n" + 
				"      \"joy\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"misattributed-dr-seuss\",\r\n" + 
				"      \"optimism\",\r\n" + 
				"      \"sadness\",\r\n" + 
				"      \"smile\",\r\n" + 
				"      \"smiling \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.15566615566615566,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"Don't cry because it's over, smile because it happened.\",\r\n" + 
				"    \"Author\": \"Dr. Seuss\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"cry\",\r\n" + 
				"      \"crying\",\r\n" + 
				"      \"experience\",\r\n" + 
				"      \"happiness\",\r\n" + 
				"      \"joy\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"misattributed-dr-seuss\",\r\n" + 
				"      \"optimism\",\r\n" + 
				"      \"sadness\",\r\n" + 
				"      \"smile\",\r\n" + 
				"      \"smiling \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.15566615566615566,\r\n" + 
				"    \"Category\": \"happiness\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.\",\r\n" + 
				"    \"Author\": \"Marilyn Monroe\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"best\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"mistakes\",\r\n" + 
				"      \"out-of-control\",\r\n" + 
				"      \"truth\",\r\n" + 
				"      \"worst \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.12912212912212911,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.\",\r\n" + 
				"    \"Author\": \"Marilyn Monroe\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"best\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"mistakes\",\r\n" + 
				"      \"out-of-control\",\r\n" + 
				"      \"truth\",\r\n" + 
				"      \"worst \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.12912212912212911,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.\",\r\n" + 
				"    \"Author\": \"Marilyn Monroe\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"best\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"mistakes\",\r\n" + 
				"      \"out-of-control\",\r\n" + 
				"      \"truth\",\r\n" + 
				"      \"worst \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.12912212912212911,\r\n" + 
				"    \"Category\": \"truth\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"Be yourself; everyone else is already taken.\",\r\n" + 
				"    \"Author\": \"Oscar Wilde\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"be-yourself\",\r\n" + 
				"      \"honesty\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"misattributed-oscar-wilde \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.11322311322311322,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.\",\r\n" + 
				"    \"Author\": \"Albert Einstein\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"human-nature\",\r\n" + 
				"      \"humor\",\r\n" + 
				"      \"infinity\",\r\n" + 
				"      \"philosophy\",\r\n" + 
				"      \"science\",\r\n" + 
				"      \"stupidity\",\r\n" + 
				"      \"universe \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.10312710312710313,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.\",\r\n" + 
				"    \"Author\": \"Albert Einstein\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"human-nature\",\r\n" + 
				"      \"humor\",\r\n" + 
				"      \"infinity\",\r\n" + 
				"      \"philosophy\",\r\n" + 
				"      \"science\",\r\n" + 
				"      \"stupidity\",\r\n" + 
				"      \"universe \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.10312710312710313,\r\n" + 
				"    \"Category\": \"philosophy\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.\",\r\n" + 
				"    \"Author\": \"Albert Einstein\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"human-nature\",\r\n" + 
				"      \"humor\",\r\n" + 
				"      \"infinity\",\r\n" + 
				"      \"philosophy\",\r\n" + 
				"      \"science\",\r\n" + 
				"      \"stupidity\",\r\n" + 
				"      \"universe \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.10312710312710313,\r\n" + 
				"    \"Category\": \"science\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.\",\r\n" + 
				"    \"Author\": \"Bernard M. Baruch\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"ataraxy\",\r\n" + 
				"      \"be-yourself\",\r\n" + 
				"      \"confidence\",\r\n" + 
				"      \"fitting-in\",\r\n" + 
				"      \"individuality\",\r\n" + 
				"      \"those-who-matter \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.10189010189010189,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"You've gotta dance like there's nobody watching,Love like you'll never be hurt,Sing like there's nobody listening,And live like it's heaven on earth.\",\r\n" + 
				"    \"Author\": \"William W. Purkey\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"dance\",\r\n" + 
				"      \"heaven\",\r\n" + 
				"      \"hurt\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"sing \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.10005610005610005,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"You've gotta dance like there's nobody watching,Love like you'll never be hurt,Sing like there's nobody listening,And live like it's heaven on earth.\",\r\n" + 
				"    \"Author\": \"William W. Purkey\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"dance\",\r\n" + 
				"      \"heaven\",\r\n" + 
				"      \"hurt\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"sing \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.10005610005610005,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"You've gotta dance like there's nobody watching,Love like you'll never be hurt,Sing like there's nobody listening,And live like it's heaven on earth.\",\r\n" + 
				"    \"Author\": \"William W. Purkey\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"dance\",\r\n" + 
				"      \"heaven\",\r\n" + 
				"      \"hurt\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"sing \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.10005610005610005,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"You know you're in love when you can't fall asleep because reality is finally better than your dreams.\",\r\n" + 
				"    \"Author\": \"Dr. Seuss\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"dreams\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"reality\",\r\n" + 
				"      \"sleep \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.09572409572409572,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"A room without books is like a body without a soul.\",\r\n" + 
				"    \"Author\": \"Marcus Tullius Cicero\",\r\n" + 
				"    \"Tags\": [\"attributed-no-source\", \"books\", \"simile\", \"soul \"],\r\n" + 
				"    \"Popularity\": 0.09537509537509538,\r\n" + 
				"    \"Category\": \"soul\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"A room without books is like a body without a soul.\",\r\n" + 
				"    \"Author\": \"Marcus Tullius Cicero\",\r\n" + 
				"    \"Tags\": [\"attributed-no-source\", \"books\", \"simile\", \"soul \"],\r\n" + 
				"    \"Popularity\": 0.09537509537509538,\r\n" + 
				"    \"Category\": \"books\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"So many books, so little time.\",\r\n" + 
				"    \"Author\": \"Frank Zappa\",\r\n" + 
				"    \"Tags\": [\"books\", \"humor \"],\r\n" + 
				"    \"Popularity\": 0.09506809506809506,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"So many books, so little time.\",\r\n" + 
				"    \"Author\": \"Frank Zappa\",\r\n" + 
				"    \"Tags\": [\"books\", \"humor \"],\r\n" + 
				"    \"Popularity\": 0.09506809506809506,\r\n" + 
				"    \"Category\": \"books\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"You only live once, but if you do it right, once is enough.\",\r\n" + 
				"    \"Author\": \"Mae West\",\r\n" + 
				"    \"Tags\": [\"humor\", \"life \"],\r\n" + 
				"    \"Popularity\": 0.08772108772108772,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"You only live once, but if you do it right, once is enough.\",\r\n" + 
				"    \"Author\": \"Mae West\",\r\n" + 
				"    \"Tags\": [\"humor\", \"life \"],\r\n" + 
				"    \"Popularity\": 0.08772108772108772,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"Be the change that you wish to see in the world.\",\r\n" + 
				"    \"Author\": \"Mahatma Gandhi\",\r\n" + 
				"    \"Tags\": [\"action\", \"change\", \"inspirational\", \"philosophy\", \"wish \"],\r\n" + 
				"    \"Popularity\": 0.08524808524808525,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"Be the change that you wish to see in the world.\",\r\n" + 
				"    \"Author\": \"Mahatma Gandhi\",\r\n" + 
				"    \"Tags\": [\"action\", \"change\", \"inspirational\", \"philosophy\", \"wish \"],\r\n" + 
				"    \"Popularity\": 0.08524808524808525,\r\n" + 
				"    \"Category\": \"philosophy\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"In three words I can sum up everything I've learned about life: it goes on.\",\r\n" + 
				"    \"Author\": \"Robert Frost\",\r\n" + 
				"    \"Tags\": [\"life \"],\r\n" + 
				"    \"Popularity\": 0.08117608117608117,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Friendship ... is born at the moment when one man says to another \\\"What! You too? I thought that no one but myself . . .\",\r\n" + 
				"    \"Author\": \"C.S. Lewis,  The Four Loves\",\r\n" + 
				"    \"Tags\": [\"friendship \"],\r\n" + 
				"    \"Popularity\": 0.07332207332207333,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.\",\r\n" + 
				"    \"Author\": \"J.K. Rowling,  Harry Potter and the Goblet of Fire\",\r\n" + 
				"    \"Tags\": [\"from-charles-bayard-miliken\", \"misattributed-j-k-rowling \"],\r\n" + 
				"    \"Popularity\": 0.07218607218607219,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Don’t walk in front of me… I may not followDon’t walk behind me… I may not leadWalk beside me… just be my friend\",\r\n" + 
				"    \"Author\": \"Albert Camus\",\r\n" + 
				"    \"Tags\": [\"friends\", \"friendship\", \"misattributed-albert-camus \"],\r\n" + 
				"    \"Popularity\": 0.07155007155007155,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"No one can make you feel inferior without your consent.\",\r\n" + 
				"    \"Author\": \"Eleanor Roosevelt,  This is My Story\",\r\n" + 
				"    \"Tags\": [\"confidence\", \"inspirational\", \"wisdom \"],\r\n" + 
				"    \"Popularity\": 0.06906506906506907,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"No one can make you feel inferior without your consent.\",\r\n" + 
				"    \"Author\": \"Eleanor Roosevelt,  This is My Story\",\r\n" + 
				"    \"Tags\": [\"confidence\", \"inspirational\", \"wisdom \"],\r\n" + 
				"    \"Popularity\": 0.06906506906506907,\r\n" + 
				"    \"Category\": \"wisdom\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"If you tell the truth, you don't have to remember anything.\",\r\n" + 
				"    \"Author\": \"Mark Twain\",\r\n" + 
				"    \"Tags\": [\"lies\", \"lying\", \"memory\", \"truth \"],\r\n" + 
				"    \"Popularity\": 0.06795206795206796,\r\n" + 
				"    \"Category\": \"truth\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"A friend is someone who knows all about you and still loves you.\",\r\n" + 
				"    \"Author\": \"Elbert Hubbard\",\r\n" + 
				"    \"Tags\": [\"friend\", \"friendship\", \"knowledge\", \"love \"],\r\n" + 
				"    \"Popularity\": 0.0661000661000661,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"A friend is someone who knows all about you and still loves you.\",\r\n" + 
				"    \"Author\": \"Elbert Hubbard\",\r\n" + 
				"    \"Tags\": [\"friend\", \"friendship\", \"knowledge\", \"love \"],\r\n" + 
				"    \"Popularity\": 0.0661000661000661,\r\n" + 
				"    \"Category\": \"knowledge\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"Always forgive your enemies; nothing annoys them so much.\",\r\n" + 
				"    \"Author\": \"Oscar Wilde\",\r\n" + 
				"    \"Tags\": [\"attributed-no-source\", \"enemies\", \"forgiveness\", \"strategy \"],\r\n" + 
				"    \"Popularity\": 0.061497061497061495,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.\",\r\n" + 
				"    \"Author\": \"Maya Angelou\",\r\n" + 
				"    \"Tags\": [\"61419 likes \"],\r\n" + 
				"    \"Popularity\": 0.06141906141906142,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Live as if you were to die tomorrow. Learn as if you were to live forever.\",\r\n" + 
				"    \"Author\": \"Mahatma Gandhi\",\r\n" + 
				"    \"Tags\": [\"carpe-diem\", \"education\", \"inspirational\", \"learning \"],\r\n" + 
				"    \"Popularity\": 0.05958405958405959,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Live as if you were to die tomorrow. Learn as if you were to live forever.\",\r\n" + 
				"    \"Author\": \"Mahatma Gandhi\",\r\n" + 
				"    \"Tags\": [\"carpe-diem\", \"education\", \"inspirational\", \"learning \"],\r\n" + 
				"    \"Popularity\": 0.05958405958405959,\r\n" + 
				"    \"Category\": \"education\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I am so clever that sometimes I don't understand a single word of what I am saying.\",\r\n" + 
				"    \"Author\": \"Oscar Wilde,  The Happy Prince and Other Stories\",\r\n" + 
				"    \"Tags\": [\"intelligence\", \"self-deprecation \"],\r\n" + 
				"    \"Popularity\": 0.05826905826905827,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that.\",\r\n" + 
				"    \"Author\":\r\n" + 
				"      \"Martin Luther King Jr.,  A Testament of Hope: The Essential Writings and Speeches\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"darkness\",\r\n" + 
				"      \"drive-out\",\r\n" + 
				"      \"hate\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"light\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"peace \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.05806205806205806,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that.\",\r\n" + 
				"    \"Author\":\r\n" + 
				"      \"Martin Luther King Jr.,  A Testament of Hope: The Essential Writings and Speeches\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"darkness\",\r\n" + 
				"      \"drive-out\",\r\n" + 
				"      \"hate\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"light\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"peace \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.05806205806205806,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"To live is the rarest thing in the world. Most people exist, that is all.\",\r\n" + 
				"    \"Author\": \"Oscar Wilde\",\r\n" + 
				"    \"Tags\": [\"life \"],\r\n" + 
				"    \"Popularity\": 0.058033058033058034,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"Without music, life would be a mistake.\",\r\n" + 
				"    \"Author\": \"Friedrich Nietzsche,  Twilight of the Idols\",\r\n" + 
				"    \"Tags\": [\"inspirational\", \"music\", \"philosophy \"],\r\n" + 
				"    \"Popularity\": 0.05467605467605468,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"Without music, life would be a mistake.\",\r\n" + 
				"    \"Author\": \"Friedrich Nietzsche,  Twilight of the Idols\",\r\n" + 
				"    \"Tags\": [\"inspirational\", \"music\", \"philosophy \"],\r\n" + 
				"    \"Popularity\": 0.05467605467605468,\r\n" + 
				"    \"Category\": \"philosophy\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Insanity is doing the same thing, over and over again, but expecting different results.\",\r\n" + 
				"    \"Author\": \"Narcotics Anonymous\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"humor\",\r\n" + 
				"      \"insanity\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"misattributed-ben-franklin\",\r\n" + 
				"      \"misattributed-mark-twain\",\r\n" + 
				"      \"misattributed-to-einstein \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.054046054046054046,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Insanity is doing the same thing, over and over again, but expecting different results.\",\r\n" + 
				"    \"Author\": \"Narcotics Anonymous\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"humor\",\r\n" + 
				"      \"insanity\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"misattributed-ben-franklin\",\r\n" + 
				"      \"misattributed-mark-twain\",\r\n" + 
				"      \"misattributed-to-einstein \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.054046054046054046,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.\",\r\n" + 
				"    \"Author\": \"Ralph Waldo Emerson\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"accomplishment\",\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"be-yourself\",\r\n" + 
				"      \"conformity\",\r\n" + 
				"      \"individuality \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.05383405383405383,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I believe that everything happens for a reason. People change so that you can learn to let go, things go wrong so that you appreciate them when they're right, you believe lies so you eventually learn to trust no one but yourself, and sometimes good things fall apart so better things can fall together.\",\r\n" + 
				"    \"Author\": \"Marilyn Monroe\",\r\n" + 
				"    \"Tags\": [\"attributed-no-source \"],\r\n" + 
				"    \"Popularity\": 0.05256605256605257,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Twenty years from now you will be more disappointed by the things that you didn't do than by the ones you did do. So throw off the bowlines. Sail away from the safe harbor. Catch the trade winds in your sails. Explore. Dream. Discover.\",\r\n" + 
				"    \"Author\": \"H. Jackson Brown Jr.,  P.S. I Love You\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"actions\",\r\n" + 
				"      \"disappointed\",\r\n" + 
				"      \"disappointment\",\r\n" + 
				"      \"dream\",\r\n" + 
				"      \"dreams\",\r\n" + 
				"      \"explore\",\r\n" + 
				"      \"misattributed-mark-twain\",\r\n" + 
				"      \"sail \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.05128305128305128,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"We accept the love we think we deserve.\",\r\n" + 
				"    \"Author\": \"Stephen Chbosky,  The Perks of Being a Wallflower\",\r\n" + 
				"    \"Tags\": [\"inspirational\", \"love \"],\r\n" + 
				"    \"Popularity\": 0.0504030504030504,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"We accept the love we think we deserve.\",\r\n" + 
				"    \"Author\": \"Stephen Chbosky,  The Perks of Being a Wallflower\",\r\n" + 
				"    \"Tags\": [\"inspirational\", \"love \"],\r\n" + 
				"    \"Popularity\": 0.0504030504030504,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"It is better to be hated for what you are than to be loved for what you are not.\",\r\n" + 
				"    \"Author\": \"André Gide,  Autumn Leaves\",\r\n" + 
				"    \"Tags\": [\"life\", \"love \"],\r\n" + 
				"    \"Popularity\": 0.04762504762504763,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"It is better to be hated for what you are than to be loved for what you are not.\",\r\n" + 
				"    \"Author\": \"André Gide,  Autumn Leaves\",\r\n" + 
				"    \"Tags\": [\"life\", \"love \"],\r\n" + 
				"    \"Popularity\": 0.04762504762504763,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Imperfection is beauty, madness is genius and it's better to be absolutely ridiculous than absolutely boring.\",\r\n" + 
				"    \"Author\": \"Marilyn Monroe\",\r\n" + 
				"    \"Tags\": [\"attributed-no-source\", \"be-yourself\", \"inspirational \"],\r\n" + 
				"    \"Popularity\": 0.04319004319004319,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"All that is gold does not glitter,Not all those who wander are lost;The old that is strong does not wither,Deep roots are not reached by the frost.From the ashes a fire shall be woken,A light from the shadows shall spring;Renewed shall be blade that was broken,The crownless again shall be king.\",\r\n" + 
				"    \"Author\": \"J.R.R. Tolkien,  The Fellowship of the Ring\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"frost\",\r\n" + 
				"      \"glitter\",\r\n" + 
				"      \"gold\",\r\n" + 
				"      \"lost\",\r\n" + 
				"      \"poetry\",\r\n" + 
				"      \"roots\",\r\n" + 
				"      \"strength\",\r\n" + 
				"      \"strong\",\r\n" + 
				"      \"wander\",\r\n" + 
				"      \"wither \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.043077043077043076,\r\n" + 
				"    \"Category\": \"poetry\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"The person, be it gentleman or lady, who has not pleasure in a good novel, must be intolerably stupid.\",\r\n" + 
				"    \"Author\": \"Jane Austen,  Northanger Abbey\",\r\n" + 
				"    \"Tags\": [\"aliteracy\", \"books\", \"classic\", \"humor \"],\r\n" + 
				"    \"Popularity\": 0.04092704092704093,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"The person, be it gentleman or lady, who has not pleasure in a good novel, must be intolerably stupid.\",\r\n" + 
				"    \"Author\": \"Jane Austen,  Northanger Abbey\",\r\n" + 
				"    \"Tags\": [\"aliteracy\", \"books\", \"classic\", \"humor \"],\r\n" + 
				"    \"Popularity\": 0.04092704092704093,\r\n" + 
				"    \"Category\": \"books\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.\",\r\n" + 
				"    \"Author\": \"Albert Einstein\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"live\",\r\n" + 
				"      \"miracle\",\r\n" + 
				"      \"miracles \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.040579040579040576,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.\",\r\n" + 
				"    \"Author\": \"Albert Einstein\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"live\",\r\n" + 
				"      \"miracle\",\r\n" + 
				"      \"miracles \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.040579040579040576,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"It is better to remain silent at the risk of being thought a fool, than to talk and remove all doubt of it.\",\r\n" + 
				"    \"Author\": \"Maurice Switzer\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"misattributed-to-abraham-lincoln\",\r\n" + 
				"      \"remaining-silent\",\r\n" + 
				"      \"wisdom \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.04028004028004028,\r\n" + 
				"    \"Category\": \"wisdom\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"As he read, I fell in love the way you fall asleep: slowly, and then all at once.\",\r\n" + 
				"    \"Author\": \"John Green,  The Fault in Our Stars\",\r\n" + 
				"    \"Tags\": [\"love \"],\r\n" + 
				"    \"Popularity\": 0.039633039633039636,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"It is our choices, Harry, that show what we truly are, far more than our abilities.\",\r\n" + 
				"    \"Author\": \"J.K. Rowling,  Harry Potter and the Chamber of Secrets\",\r\n" + 
				"    \"Tags\": [\"abilities\", \"choices \"],\r\n" + 
				"    \"Popularity\": 0.03955003955003955,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Life is what happens to you while you're busy making other plans.\",\r\n" + 
				"    \"Author\": \"Allen Saunders\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"fate\",\r\n" + 
				"      \"life\",\r\n" + 
				"      \"misattributed-john-lennon\",\r\n" + 
				"      \"planning\",\r\n" + 
				"      \"plans \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03891403891403891,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Good friends, good books, and a sleepy conscience: this is the ideal life.\",\r\n" + 
				"    \"Author\": \"Mark Twain\",\r\n" + 
				"    \"Tags\": [\"books\", \"contentment\", \"friends\", \"friendship\", \"life \"],\r\n" + 
				"    \"Popularity\": 0.038455038455038455,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Good friends, good books, and a sleepy conscience: this is the ideal life.\",\r\n" + 
				"    \"Author\": \"Mark Twain\",\r\n" + 
				"    \"Tags\": [\"books\", \"contentment\", \"friends\", \"friendship\", \"life \"],\r\n" + 
				"    \"Popularity\": 0.038455038455038455,\r\n" + 
				"    \"Category\": \"books\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Whenever you find yourself on the side of the majority, it is time to reform (or pause and reflect).\",\r\n" + 
				"    \"Author\": \"Mark Twain\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"individuality\",\r\n" + 
				"      \"majority\",\r\n" + 
				"      \"minority\",\r\n" + 
				"      \"pause\",\r\n" + 
				"      \"reflect\",\r\n" + 
				"      \"wisdom \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03822203822203822,\r\n" + 
				"    \"Category\": \"wisdom\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"It does not do to dwell on dreams and forget to live.\",\r\n" + 
				"    \"Author\": \"J.K. Rowling,  Harry Potter and the Sorcerer's Stone\",\r\n" + 
				"    \"Tags\": [\"dreams\", \"life \"],\r\n" + 
				"    \"Popularity\": 0.03810703810703811,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"The fool doth think he is wise, but the wise man knows himself to be a fool.\",\r\n" + 
				"    \"Author\": \"William Shakespeare,  As You Like It\",\r\n" + 
				"    \"Tags\": [\"wisdom \"],\r\n" + 
				"    \"Popularity\": 0.03784503784503784,\r\n" + 
				"    \"Category\": \"wisdom\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"A woman is like a tea bag; you never know how strong it is until it's in hot water.\",\r\n" + 
				"    \"Author\": \"Eleanor Roosevelt\",\r\n" + 
				"    \"Tags\": [\"attributed-no-source\", \"misattributed-eleanor-roosevelt \"],\r\n" + 
				"    \"Popularity\": 0.036795036795036797,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Yesterday is history, tomorrow is a mystery, today is a gift of God, which is why we call it the present.\",\r\n" + 
				"    \"Author\": \"Bil Keane\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"hope\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"misattributed-eleanor-roosevelt\",\r\n" + 
				"      \"past\",\r\n" + 
				"      \"present\",\r\n" + 
				"      \"widely-misattributed \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.036685036685036684,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Yesterday is history, tomorrow is a mystery, today is a gift of God, which is why we call it the present.\",\r\n" + 
				"    \"Author\": \"Bil Keane\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"attributed-no-source\",\r\n" + 
				"      \"hope\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"misattributed-eleanor-roosevelt\",\r\n" + 
				"      \"past\",\r\n" + 
				"      \"present\",\r\n" + 
				"      \"widely-misattributed \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.036685036685036684,\r\n" + 
				"    \"Category\": \"hope\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"We are all in the gutter, but some of us are looking at the stars.\",\r\n" + 
				"    \"Author\": \"Oscar Wilde,  Lady Windermere's Fan\",\r\n" + 
				"    \"Tags\": [\"inspirational\", \"optimism\", \"perception\", \"pessimism \"],\r\n" + 
				"    \"Popularity\": 0.035583035583035584,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"If you don't stand for something you will fall for anything.\",\r\n" + 
				"    \"Author\": \"Gordon A. Eadie\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"belief\",\r\n" + 
				"      \"integrity\",\r\n" + 
				"      \"misattributed-to-malcolm-x\",\r\n" + 
				"      \"misattributed-to-rosa-parks \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03557703557703558,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"The man who does not read has no advantage over the man who cannot read.\",\r\n" + 
				"    \"Author\": \"Mark Twain\",\r\n" + 
				"    \"Tags\": [\"aliteracy\", \"attributed-no-source\", \"literacy \"],\r\n" + 
				"    \"Popularity\": 0.0346990346990347,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"I have not failed. I've just found 10,000 ways that won't work.\",\r\n" + 
				"    \"Author\": \"Thomas A. Edison\",\r\n" + 
				"    \"Tags\": [\"edison\", \"failure\", \"inspirational\", \"paraphrased \"],\r\n" + 
				"    \"Popularity\": 0.03406803406803407,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"It is not a lack of love, but a lack of friendship that makes unhappy marriages.\",\r\n" + 
				"    \"Author\": \"Friedrich Nietzsche\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"friendship\",\r\n" + 
				"      \"lack-of-friendship\",\r\n" + 
				"      \"lack-of-love\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"marriage\",\r\n" + 
				"      \"unhappy-marriage \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03397803397803398,\r\n" + 
				"    \"Category\": \"friendship\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"It is not a lack of love, but a lack of friendship that makes unhappy marriages.\",\r\n" + 
				"    \"Author\": \"Friedrich Nietzsche\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"friendship\",\r\n" + 
				"      \"lack-of-friendship\",\r\n" + 
				"      \"lack-of-love\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"marriage\",\r\n" + 
				"      \"unhappy-marriage \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03397803397803398,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"The opposite of love is not hate, it's indifference. The opposite of art is not ugliness, it's indifference. The opposite of faith is not heresy, it's indifference. And the opposite of life is not death, it's indifference.\",\r\n" + 
				"    \"Author\": \"Elie Wiesel\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"activism\",\r\n" + 
				"      \"apathy\",\r\n" + 
				"      \"hate\",\r\n" + 
				"      \"indifference\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"opposite\",\r\n" + 
				"      \"philosophy \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03324703324703325,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"The opposite of love is not hate, it's indifference. The opposite of art is not ugliness, it's indifference. The opposite of faith is not heresy, it's indifference. And the opposite of life is not death, it's indifference.\",\r\n" + 
				"    \"Author\": \"Elie Wiesel\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"activism\",\r\n" + 
				"      \"apathy\",\r\n" + 
				"      \"hate\",\r\n" + 
				"      \"indifference\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"opposite\",\r\n" + 
				"      \"philosophy \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03324703324703325,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"The opposite of love is not hate, it's indifference. The opposite of art is not ugliness, it's indifference. The opposite of faith is not heresy, it's indifference. And the opposite of life is not death, it's indifference.\",\r\n" + 
				"    \"Author\": \"Elie Wiesel\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"activism\",\r\n" + 
				"      \"apathy\",\r\n" + 
				"      \"hate\",\r\n" + 
				"      \"indifference\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"opposite\",\r\n" + 
				"      \"philosophy \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03324703324703325,\r\n" + 
				"    \"Category\": \"philosophy\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Fairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten.\",\r\n" + 
				"    \"Author\": \"Neil Gaiman,  Coraline\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"books\",\r\n" + 
				"      \"dragons\",\r\n" + 
				"      \"fairy-tales\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"paraphrasing-g-k-chesterton \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03288803288803289,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Fairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten.\",\r\n" + 
				"    \"Author\": \"Neil Gaiman,  Coraline\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"books\",\r\n" + 
				"      \"dragons\",\r\n" + 
				"      \"fairy-tales\",\r\n" + 
				"      \"inspirational\",\r\n" + 
				"      \"paraphrasing-g-k-chesterton \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.03288803288803289,\r\n" + 
				"    \"Category\": \"books\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Outside of a dog, a book is man's best friend. Inside of a dog it's too dark to read.\",\r\n" + 
				"    \"Author\":\r\n" + 
				"      \"Groucho Marx,  The Essential Groucho: Writings For By And About Groucho Marx\",\r\n" + 
				"    \"Tags\": [\"animals\", \"books\", \"dogs\", \"friends\", \"humor \"],\r\n" + 
				"    \"Popularity\": 0.03286403286403287,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Outside of a dog, a book is man's best friend. Inside of a dog it's too dark to read.\",\r\n" + 
				"    \"Author\":\r\n" + 
				"      \"Groucho Marx,  The Essential Groucho: Writings For By And About Groucho Marx\",\r\n" + 
				"    \"Tags\": [\"animals\", \"books\", \"dogs\", \"friends\", \"humor \"],\r\n" + 
				"    \"Popularity\": 0.03286403286403287,\r\n" + 
				"    \"Category\": \"books\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I may not have gone where I intended to go, but I think I have ended up where I needed to be.\",\r\n" + 
				"    \"Author\": \"Douglas Adams,  The Long Dark Tea-Time of the Soul\",\r\n" + 
				"    \"Tags\": [\"life\", \"navigation \"],\r\n" + 
				"    \"Popularity\": 0.03283903283903284,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I am enough of an artist to draw freely upon my imagination. Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world.\",\r\n" + 
				"    \"Author\": \"Albert Einstein\",\r\n" + 
				"    \"Tags\": [\"1929\", \"imagination\", \"inspirational\", \"viereck-interview \"],\r\n" + 
				"    \"Popularity\": 0.03210403210403211,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"A day without sunshine is like, you know, night.\",\r\n" + 
				"    \"Author\": \"Steve Martin\",\r\n" + 
				"    \"Tags\": [\"humor\", \"obvious\", \"simile \"],\r\n" + 
				"    \"Popularity\": 0.03204503204503204,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I like nonsense, it wakes up the brain cells. Fantasy is a necessary ingredient in living.\",\r\n" + 
				"    \"Author\": \"Dr. Seuss\",\r\n" + 
				"    \"Tags\": [\"fantasy \"],\r\n" + 
				"    \"Popularity\": 0.031993031993031995,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Never put off till tomorrow what may be done day after tomorrow just as well.\",\r\n" + 
				"    \"Author\": \"Mark Twain\",\r\n" + 
				"    \"Tags\": [\"humor\", \"procrastination \"],\r\n" + 
				"    \"Popularity\": 0.03153803153803154,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I love you without knowing how, or when, or from where. I love you simply, without problems or pride: I love you in this way because I do not know any other way of loving but this, in which there is no I or you, so intimate that your hand upon my chest is my hand, so intimate that when I fall asleep your eyes close.\",\r\n" + 
				"    \"Author\": \"Pablo Neruda,  100 Love Sonnets\",\r\n" + 
				"    \"Tags\": [\"love\", \"poetry \"],\r\n" + 
				"    \"Popularity\": 0.03138303138303138,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I love you without knowing how, or when, or from where. I love you simply, without problems or pride: I love you in this way because I do not know any other way of loving but this, in which there is no I or you, so intimate that your hand upon my chest is my hand, so intimate that when I fall asleep your eyes close.\",\r\n" + 
				"    \"Author\": \"Pablo Neruda,  100 Love Sonnets\",\r\n" + 
				"    \"Tags\": [\"love\", \"poetry \"],\r\n" + 
				"    \"Popularity\": 0.03138303138303138,\r\n" + 
				"    \"Category\": \"poetry\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"I solemnly swear that I am up to no good.\",\r\n" + 
				"    \"Author\": \"J.K. Rowling,  Harry Potter and the Prisoner of Azkaban\",\r\n" + 
				"    \"Tags\": [\"mischief \"],\r\n" + 
				"    \"Popularity\": 0.031184031184031184,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"That which does not kill us makes us stronger.\",\r\n" + 
				"    \"Author\": \"Friedrich Nietzsche\",\r\n" + 
				"    \"Tags\": [\"paraphrased\", \"strength \"],\r\n" + 
				"    \"Popularity\": 0.03055903055903056,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Have you ever been in love? Horrible isn't it? It makes you so vulnerable. It opens your chest and it opens up your heart and it means that someone can get inside you and mess you up.\",\r\n" + 
				"    \"Author\": \"Neil Gaiman,  The Sandman, Vol. 9: The Kindly Ones\",\r\n" + 
				"    \"Tags\": [\"love \"],\r\n" + 
				"    \"Popularity\": 0.030386030386030386,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"Love all, trust a few, do wrong to none.\",\r\n" + 
				"    \"Author\": \"William Shakespeare,  All's Well That Ends Well\",\r\n" + 
				"    \"Tags\": [\"do-wrong\", \"love\", \"trust\", \"wrong \"],\r\n" + 
				"    \"Popularity\": 0.03012703012703013,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose. You're on your own. And you know what you know. And YOU are the one who'll decide where to go...\",\r\n" + 
				"    \"Author\": \"Dr. Seuss,  Oh, The Places You'll Go!\",\r\n" + 
				"    \"Tags\": [\"inspirational \"],\r\n" + 
				"    \"Popularity\": 0.02965902965902966,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"If you judge people, you have no time to love them.\",\r\n" + 
				"    \"Author\": \"Mother Teresa\",\r\n" + 
				"    \"Tags\": [\"attributed-no-source \"],\r\n" + 
				"    \"Popularity\": 0.029295029295029296,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"There is never a time or place for true love. It happens accidentally, in a heartbeat, in a single flashing, throbbing moment.\",\r\n" + 
				"    \"Author\": \"Sarah Dessen,  The Truth About Forever\",\r\n" + 
				"    \"Tags\": [\"love \"],\r\n" + 
				"    \"Popularity\": 0.028858028858028857,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"For every minute you are angry you lose sixty seconds of happiness.\",\r\n" + 
				"    \"Author\": \"Ralph Waldo Emerson\",\r\n" + 
				"    \"Tags\": [\"happiness \"],\r\n" + 
				"    \"Popularity\": 0.028285028285028286,\r\n" + 
				"    \"Category\": \"happiness\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Being deeply loved by someone gives you strength, while loving someone deeply gives you courage.\",\r\n" + 
				"    \"Author\": \"Lao Tzu\",\r\n" + 
				"    \"Tags\": [\r\n" + 
				"      \"courage\",\r\n" + 
				"      \"deeply-loved\",\r\n" + 
				"      \"love\",\r\n" + 
				"      \"strength\",\r\n" + 
				"      \"widely-misattributed \"\r\n" + 
				"    ],\r\n" + 
				"    \"Popularity\": 0.027698027698027698,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"My thoughts are stars I cannot fathom into constellations.\",\r\n" + 
				"    \"Author\": \"John Green,  The Fault in Our Stars\",\r\n" + 
				"    \"Tags\": [\"27515 likes \"],\r\n" + 
				"    \"Popularity\": 0.027515027515027515,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I love deadlines. I love the whooshing noise they make as they go by.\",\r\n" + 
				"    \"Author\": \"Douglas Adams,  The Salmon of Doubt\",\r\n" + 
				"    \"Tags\": [\"deadlines\", \"humor\", \"humour\", \"work\", \"writing \"],\r\n" + 
				"    \"Popularity\": 0.027476027476027474,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I love deadlines. I love the whooshing noise they make as they go by.\",\r\n" + 
				"    \"Author\": \"Douglas Adams,  The Salmon of Doubt\",\r\n" + 
				"    \"Tags\": [\"deadlines\", \"humor\", \"humour\", \"work\", \"writing \"],\r\n" + 
				"    \"Popularity\": 0.027476027476027474,\r\n" + 
				"    \"Category\": \"writing\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"It is never too late to be what you might have been.\",\r\n" + 
				"    \"Author\": \"George Eliot\",\r\n" + 
				"    \"Tags\": [\"inspirational \"],\r\n" + 
				"    \"Popularity\": 0.026834026834026834,\r\n" + 
				"    \"Category\": \"inspiration\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Anyone who thinks sitting in church can make you a Christian must also think that sitting in a garage can make you a car.\",\r\n" + 
				"    \"Author\": \"Garrison Keillor\",\r\n" + 
				"    \"Tags\": [\"humor\", \"religion \"],\r\n" + 
				"    \"Popularity\": 0.026595026595026595,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Anyone who thinks sitting in church can make you a Christian must also think that sitting in a garage can make you a car.\",\r\n" + 
				"    \"Author\": \"Garrison Keillor\",\r\n" + 
				"    \"Tags\": [\"humor\", \"religion \"],\r\n" + 
				"    \"Popularity\": 0.026595026595026595,\r\n" + 
				"    \"Category\": \"religion\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"A reader lives a thousand lives before he dies, said Jojen. The man who never reads lives only one.\",\r\n" + 
				"    \"Author\": \"George R.R. Martin,  A Dance with Dragons\",\r\n" + 
				"    \"Tags\": [\"read\", \"readers\", \"reading\", \"reading-books \"],\r\n" + 
				"    \"Popularity\": 0.026393026393026393,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"I'm not upset that you lied to me, I'm upset that from now on I can't believe you.\",\r\n" + 
				"    \"Author\": \"Friedrich Nietzsche\",\r\n" + 
				"    \"Tags\": [\"lies\", \"lying\", \"trust \"],\r\n" + 
				"    \"Popularity\": 0.026019026019026018,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"If you can't explain it to a six year old, you don't understand it yourself.\",\r\n" + 
				"    \"Author\": \"Albert Einstein\",\r\n" + 
				"    \"Tags\": [\"attributed-no-source\", \"simplicity\", \"understand \"],\r\n" + 
				"    \"Popularity\": 0.025967025967025967,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Women and cats will do as they please, and men and dogs should relax and get used to the idea.\",\r\n" + 
				"    \"Author\": \"Robert A. Heinlein\",\r\n" + 
				"    \"Tags\": [\"cats\", \"humor\", \"women \"],\r\n" + 
				"    \"Popularity\": 0.025792025792025792,\r\n" + 
				"    \"Category\": \"humor\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"It takes a great deal of bravery to stand up to our enemies, but just as much to stand up to our friends.\",\r\n" + 
				"    \"Author\": \"J.K. Rowling,  Harry Potter and the Sorcerer's Stone\",\r\n" + 
				"    \"Tags\": [\"courage\", \"friends \"],\r\n" + 
				"    \"Popularity\": 0.02565802565802566,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Love is that condition in which the happiness of another person is essential to your own.\",\r\n" + 
				"    \"Author\": \"Robert A. Heinlein,  Stranger in a Strange Land\",\r\n" + 
				"    \"Tags\": [\"essential\", \"happiness\", \"love \"],\r\n" + 
				"    \"Popularity\": 0.025575025575025574,\r\n" + 
				"    \"Category\": \"love\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Love is that condition in which the happiness of another person is essential to your own.\",\r\n" + 
				"    \"Author\": \"Robert A. Heinlein,  Stranger in a Strange Land\",\r\n" + 
				"    \"Tags\": [\"essential\", \"happiness\", \"love \"],\r\n" + 
				"    \"Popularity\": 0.025575025575025574,\r\n" + 
				"    \"Category\": \"happiness\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\":\r\n" + 
				"      \"Sometimes the questions are complicated and the answers are simple.\",\r\n" + 
				"    \"Author\": \"Dr. Seuss\",\r\n" + 
				"    \"Tags\": [\"attributed-no-source\", \"life \"],\r\n" + 
				"    \"Popularity\": 0.02498002498002498,\r\n" + 
				"    \"Category\": \"life\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"I have always imagined that Paradise will be a kind of library.\",\r\n" + 
				"    \"Author\": \"Jorge Luis Borges\",\r\n" + 
				"    \"Tags\": [\"books\", \"library \"],\r\n" + 
				"    \"Popularity\": 0.024943024943024944,\r\n" + 
				"    \"Category\": \"books\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"Quote\": \"We read to know we're not alone.\",\r\n" + 
				"    \"Author\": \"William Nicholson,  Shadowlands\",\r\n" + 
				"    \"Tags\": [\"misattributed-to-c-s-lewis\", \"reading \"],\r\n" + 
				"    \"Popularity\": 0.024803024803024803,\r\n" + 
				"    \"Category\": \"\"\r\n" + 
				"  }]";
		
		return new Gson().fromJson(quotes, Quote[].class);
		
	}
	
}
