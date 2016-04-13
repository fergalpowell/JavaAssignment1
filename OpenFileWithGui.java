package com.test.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;

public class OpenFileWithGui
{
	JFileChooser fileChooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();
	
	public String SelectFileGui()
	{
		JButton open = new JButton();
		JFileChooser fc = new JFileChooser();
		String path;
		
		fc.setCurrentDirectory(new java.io.File("."));
		fc.setDialogTitle("Docu Sim");
		if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION)
		{
			
		}
		return path = fc.getSelectedFile().getPath();
	}
	public void DisplayResultsGui() throws Exception
	{
		String path = "results.txt";
		Scanner input = new Scanner(new File(path));
		while(input.hasNext())
		{
			sb.append(input.nextLine());
			sb.append("\n");
		}
		input.close();
	}
	
	void DisplayStopWords() throws FileNotFoundException
	{
		String path = "src/com/test/assignment1/StopWords.txt";
		Scanner input = new Scanner(new File(path));
		while(input.hasNext())
		{
			sb.append(input.nextLine());
			sb.append("\n");
		}
		input.close();
	}

}
