package com.test.assignment1;

import java.util.ArrayList;
import java.util.Collection;

public class TextSimiliarity 
{
	// attributes
	private ArrayList<String> words1;
	private ArrayList<String> words2;
	
	// constructor
	TextSimiliarity(ArrayList<String> words1, ArrayList<String> words2)
	{
		this.words1 = words1;
		this.words2 = words2;
	}
	
	// methods
	ArrayList<String> FindSimiliarWords()
	{
		if(words1.size() < words2.size())
		{
			words1.retainAll(words2);
			return words1;
		}
		else
		{
			words2.retainAll(words1);
			return words2;
		}	
	}
	

}
