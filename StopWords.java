package com.test.assignment1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StopWords 
{
	// attributes
	private ArrayList<String> similiarWords;
	private ArrayList<String> stopWords;
	
	// constructors
	StopWords(ArrayList<String> stopWords, ArrayList<String> similiarWords)
	{
		this.stopWords = stopWords;
		this.similiarWords = similiarWords;
	}
	
	// methods
	ArrayList<String> RemoveStopWords()
	{
		ArrayList<String> filteredWords = new ArrayList<String>();
		filteredWords.addAll(similiarWords);
		
		for (String word1 : similiarWords)
		{
			for (String word2 : stopWords)
			{
				if(word1.equals(word2))
				{
					filteredWords.remove(word1);
					break;
				}
			}
		}
		return filteredWords;
	}
	
	void DisplayStopWords() throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("src/com/test/assignment1/Stopwords.txt"));
		ArrayList<String> allStopWords = new ArrayList<String>();
		while(sc.hasNext())
		{
			allStopWords.add(sc.next());
		}
		for(String word : allStopWords)
		{
			System.out.println(word);
		}
	}
	
	void AddStopWord() throws IOException
	{
		Scanner newStopWord = new Scanner(System.in);
		FileWriter fileWritter = new FileWriter("src/com/test/assignment1/Stopwords.txt",true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.newLine();
        bufferWritter.newLine();
        bufferWritter.write(newStopWord.next());
        bufferWritter.close();
	}

}
