package com.test.assignment1;

public class WordPercentage
{
	// attributes
	private String[] commonWords;
	private String[] fileWords;

	
	// constructors
	WordPercentage(String[] commonWords, String[] fileWords)
	{
		this.commonWords = commonWords;
		this.fileWords = fileWords;
	}
	
	// methods
	int GetPercentage()
	{
		int filePercentage;
		filePercentage = (int) ((float)100 * ((float)commonWords.length / (float)fileWords.length));
		System.out.println(commonWords.length);
		System.out.println(fileWords.length);
		
		return filePercentage;
	}
}
