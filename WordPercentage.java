package com.test.assignment1;

import java.util.ArrayList;

public class WordPercentage
{
	// attributes
	private ArrayList<String> commonWords;
	private ArrayList<String> fileWords;

	
	// constructors
	WordPercentage(ArrayList<String> commonWords, ArrayList<String> fileWords)
	{
		this.commonWords = commonWords;
		this.fileWords = fileWords;
	}
	
	// methods
	int GetPercentage()
	{
		int filePercentage;
		filePercentage = (int) ((float)100 * ((float)commonWords.size() / (float)fileWords.size()));
		System.out.println(commonWords.size());
		System.out.println(fileWords.size());
		return filePercentage;
	}
}
