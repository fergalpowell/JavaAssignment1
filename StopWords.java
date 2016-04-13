package com.test.assignment1;

import java.util.ArrayList;
import java.util.Arrays;

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

}
