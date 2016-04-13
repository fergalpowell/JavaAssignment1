package com.test.assignment1;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class OpenFileWithGui
{
	JFileChooser fileChooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();
	
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
		/*if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
			java.io.File file = fileChooser.getSelectedFile();
			String path = file.getPath();
			
			
			
		}
		else
		{
			sb.append("No File has been selected");
		}*/
	}

}
