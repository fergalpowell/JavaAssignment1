package com.test.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	
	ArrayList<String> ScanDocument() throws FileNotFoundException
	{
		String content = new Scanner(new File(path)).useDelimiter("\\Z").next();
		String[] words = content.replaceAll("\\p{P}", "").toLowerCase().split("\\s+");
		ArrayList<String> text = new ArrayList<String>(Arrays.asList(words));	
		return text;
	}
	
	ArrayList<String> ScanTitle() throws FileNotFoundException
	{
		String title;
		Scanner sc = new Scanner(new File(path));
		
		title = sc.nextLine();
		title.trim();
		List<String> buffer = Arrays.asList(title.split(" "));
		ArrayList<String> titleWords = new ArrayList<String>(buffer.size());
		titleWords.addAll(buffer);
		sc.close();
		
		return titleWords;
	}
	
	int GetFileLength() throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File(path));
		int count=0;
		while(sc.hasNext()){
		    sc.next();
		    count++;
		}
		return count;
	}
	
	long GetFileSize()
	{
		File textFile = new File(path);
		long size = textFile.length();
		return size;
	}
	
}





