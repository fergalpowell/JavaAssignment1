package com.test.assignment1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Control 
{
	public static void main(String args[]) throws IOException
	{
		OpenFileWithGui f1 = new OpenFileWithGui();
		OpenFileWithGui f2 = new OpenFileWithGui();
		TextFile file1 = new TextFile(f1.SelectFileGui());
		TextFile file2 = new TextFile(f2.SelectFileGui());
		TextFile file3 = new TextFile("src/com/test/assignment1/Stopwords.txt");
		
		StopWords relevantFile1Words = new StopWords(file3.ScanDocument(), file1.ScanDocument());
		StopWords relevantFile2Words = new StopWords(file3.ScanDocument(), file2.ScanDocument());
		
		TextSimiliarity commonWords = new TextSimiliarity(relevantFile1Words.RemoveStopWords(),
				relevantFile2Words.RemoveStopWords());		
		System.out.println(commonWords.FindSimiliarWords());
		
		WordPercentage file1Percentage = new WordPercentage(commonWords.FindSimiliarWords(), 
				relevantFile1Words.RemoveStopWords());
		WordPercentage file2Percentage = new WordPercentage(commonWords.FindSimiliarWords(), 
				relevantFile2Words.RemoveStopWords());
		
		TextSimiliarity commonTitleWords = new TextSimiliarity(file1.ScanTitle(),file2.ScanTitle());
		StopWords relevantCommonTitleWords = new StopWords(file3.ScanDocument(), commonTitleWords.FindSimiliarWords());
		
		StopWords relevantTitle1Words = new StopWords(file3.ScanDocument(), file1.ScanTitle());
		StopWords relevantTitle2Words = new StopWords(file3.ScanDocument(), file2.ScanTitle());
		WordPercentage title1Percentage = new WordPercentage(relevantCommonTitleWords.RemoveStopWords(), 
				relevantTitle1Words.RemoveStopWords());
		WordPercentage title2Percentage = new WordPercentage(relevantCommonTitleWords.RemoveStopWords(),
				relevantTitle2Words.RemoveStopWords());
		
		Results output = new Results(commonWords.FindSimiliarWords(), file1Percentage.GetPercentage(), 
				file2Percentage.GetPercentage(), title1Percentage.GetPercentage(), title2Percentage.GetPercentage(),
				file1.GetFileLength(), file2.GetFileLength(), file1.GetFileSize(), file2.GetFileSize());
		output.WriteResultsToFile();
		//relevantFile1Words.AddStopWord();
		//relevantFile1Words.DisplayStopWords();
		GUI window = new GUI();
		window.main(args);
		
		//GUI demo = new GUI();
	
	}

}
