package com.test.assignment1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Scrollbar;
import java.awt.Button;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Calibri", Font.PLAIN, 14));
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 351, 420);
		frame.getContentPane().add(textArea);
		
		JButton btnDisplayResults = new JButton("Display Results");
		btnDisplayResults.setFont(new Font("MonoSpaced", Font.PLAIN,14));
		btnDisplayResults.setBounds(20, 520, 167, 30);
		frame.getContentPane().add(btnDisplayResults);
		btnDisplayResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenFileWithGui of = new OpenFileWithGui();
				
				try
				{
					of.DisplayResultsGui();
				}
				catch (Exception e1)
				{
					e1.printStackTrace();
				}
				textArea.setText(of.sb.toString());
			}
		});
		
		
		JButton DisplayStopWords = new JButton("Display Stop Words");
		DisplayStopWords.setBounds(194, 520, 167, 30);
		frame.getContentPane().add(DisplayStopWords);
		DisplayStopWords.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			OpenFileWithGui of1 = new OpenFileWithGui();
			
			try
			{
				of1.DisplayStopWords();
			}
			catch (Exception e1)
			{
				e1.printStackTrace();
			}
			textArea.setText(of1.sb.toString());
			}
		});
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(357, 11, 17, 420);
		frame.getContentPane().add(scrollbar);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(20, 442, 167, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(20, 481, 167, 28);
		frame.getContentPane().add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(197, 446, 164, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(194, 485, 167, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
