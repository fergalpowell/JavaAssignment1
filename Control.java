package com.test.assignment1;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Control 
{
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException
	{
	
		TextFile file1 = new TextFile("src/com/test/assignment1/text1.txt");
		TextFile file2 = new TextFile("src/com/test/assignment1/text2.txt");
		TextFile file3 = new TextFile("src/com/test/assignment1/Stopwords.txt");
		
		TextSimiliarity commonWords = new TextSimiliarity(file1.ScanDocument(),file2.ScanDocument());
		StopWords relevantCommonWords = new StopWords(file3.ScanDocument(), commonWords.FindSimiliarWords());
		
		StopWords relevantFile1Words = new StopWords(file3.ScanDocument(), file1.ScanDocument());
		StopWords relevantFile2Words = new StopWords(file3.ScanDocument(), file2.ScanDocument());
		WordPercentage file1Percentage = new WordPercentage(relevantCommonWords.RemoveStopWords(), 
				relevantFile1Words.RemoveStopWords());
		WordPercentage file2Percentage = new WordPercentage(relevantCommonWords.RemoveStopWords(), 
				relevantFile2Words.RemoveStopWords());
		
		TextSimiliarity commonTitleWords = new TextSimiliarity(file1.ScanTitle(),file2.ScanTitle());
		StopWords relevantCommonTitleWords = new StopWords(file3.ScanDocument(), commonTitleWords.FindSimiliarWords());
		
		StopWords relevantTitle1Words = new StopWords(file3.ScanDocument(), file1.ScanTitle());
		StopWords relevantTitle2Words = new StopWords(file3.ScanDocument(), file2.ScanTitle());
		WordPercentage title1Percentage = new WordPercentage(relevantCommonTitleWords.RemoveStopWords(), 
				relevantTitle1Words.RemoveStopWords());
		WordPercentage title2Percentage = new WordPercentage(relevantCommonTitleWords.RemoveStopWords(),
				relevantTitle2Words.RemoveStopWords());
		
		Results output = new Results(relevantCommonWords.RemoveStopWords(), file1Percentage.GetPercentage(), 
				file2Percentage.GetPercentage(), title1Percentage.GetPercentage(), title2Percentage.GetPercentage(),
				file1.GetFileLength(), file2.GetFileLength(), file1.GetFileSize(), file2.GetFileSize());
		output.WriteResultsToFile();
		
		//GUI demo = new GUI();
	
	}

}
