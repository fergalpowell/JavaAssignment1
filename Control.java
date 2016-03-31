package com.test.assignment1;

import java.io.FileNotFoundException;

public class Control 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		TextFile file1 = new TextFile("src/com/test/assignment1/text1.txt");
		TextFile file2 = new TextFile("src/com/test/assignment1/text2.txt");
		
		SimiliarWords commonWords = new SimiliarWords(file1.ScanDocument(),file2.ScanDocument());
		
		WordPercentage file1Percentage = new WordPercentage(commonWords.FindSimiliarWords(), file1.ScanDocument());
		WordPercentage file2Percentage = new WordPercentage(commonWords.FindSimiliarWords(), file2.ScanDocument());
		System.out.println(file1Percentage.GetPercentage());
		System.out.println(file2Percentage.GetPercentage());
		
		
		
		
		
	}

}
