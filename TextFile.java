package com.test.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TextFile
{
	// attributes
	private String path; 
	
	
	// constructors
	TextFile(String path)
	{
		this.path = path;
	}
	
	// methods
	String[] ScanDocument() throws FileNotFoundException
	{
		List<String> text = new ArrayList<String>();
		Scanner sc = new Scanner(new File(this.path));
		
		while(sc.hasNext())
		{
			text.add(sc.next());
		}
		sc.close();
		String[] words = new String[text.size()];
		words = text.toArray(words);
		return words;
	}
	
}
	/*String[] words1 = new String[f1.size()];
	words1 = f1.toArray(words1);
	
	List<String> similarWords = new ArrayList<String>();
	
	ArrayList<Integer> wordPercentageTxt1 = new ArrayList<Integer>();
	ArrayList<Integer> wordPercentageTxt2 = new ArrayList<Integer>();
	int percentage1 = 0, percentage2 = 0, counter = 0;
	
	
	System.out.println(similarWords);*/




