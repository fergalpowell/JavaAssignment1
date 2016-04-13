package com.test.assignment1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Results 
{
	private ArrayList<String> similarWords;
	private int file1Percent;
	private int file2Percent;
	private int title1Percent;
	private int title2Percent;
	private int file1Length;
	private int file2Length;
	private long file1Size;
	private long file2Size;
	
	Results( ArrayList<String> similarWords, int file1Percent, int file2Percent, int title1Percent, int title2Percent,
			int file1Length, int file2Length, long file1Size, long file2Size)
	{
		this.similarWords = similarWords;
		this.file1Percent = file1Percent;
		this.file2Percent = file2Percent;
		this.title1Percent = title1Percent;
		this.title2Percent = title2Percent;
		this.file1Length = file1Length;
		this.file2Length = file2Length;
		this.file1Size = file1Size;
		this.file2Size = file2Size;
		
	}
	
	void WriteResultsToFile() throws FileNotFoundException, UnsupportedEncodingException
	{
		PrintWriter writer = new PrintWriter("results.txt", "UTF-8");
		writer.println("File 1 is " + file1Percent + "% similar to file 2");
		writer.println("File 2 is " + file2Percent + "% similar to file 1");
		writer.println("Title 1 is " + title1Percent + "% similar to title 2");
		writer.println("Title 2 is " + title2Percent + "% similar to title 1");
		writer.println("The length of file 1 is: " + file1Length + " words");
		writer.println("The length of file 2 is: " + file2Length + " words");
		writer.println("The size of file 1 is: " + file1Size + " Bytes");
		writer.println("The size of file 2 is: " + file2Size + " Bytes");
		writer.println("\nHere is a list of all the common words from both text files and the number of occurrences of the word:");
		
		Set<String> unique = new HashSet<String>(similarWords);
		int counter = 1;
		
		for (String key : unique) {
		    writer.println(counter + ": '" + key + "', number of occurrences: " + Collections.frequency(similarWords, key));
		    counter++;
		}
		
		writer.close();
	}

}
