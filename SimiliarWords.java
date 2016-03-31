package com.test.assignment1;

import java.util.ArrayList;

public class SimiliarWords 
{
	// attributes
	private String[] words1;
	private String[] words2;
	
	// constructor
	SimiliarWords(String[] words1, String[] words2)
	{
		this.words1 = words1;
		this.words2 = words2;
	}
	
	// methods
	String[] FindSimiliarWords()
	{
		ArrayList<String> similiarWords = new ArrayList<String>();
		String[] commonWords = new String[similiarWords.size()];
		
		for (int i = 0;i < words1.length;i++)
		{
			for(int j = 0;j < words2.length;j++)
			{
				if((words1[i].equals(words2[j])))
				{
					similiarWords.add(words1[i]);					
				}
			}
		}
		commonWords = similiarWords.toArray(commonWords);
		return commonWords;
	}

}
