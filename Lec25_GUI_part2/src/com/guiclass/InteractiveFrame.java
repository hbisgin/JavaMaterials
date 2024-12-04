package com.guiclass;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InteractiveFrame {
	JFrame frame;
	JPanel panel1;
	JLabel myLabel, southLabel;
	JTextField myTextField ;
	JList<String>myList;
	JComboBox mycomboBox;
	String numbers[] = {"0", "1", "2", "3", "4"};
	String names[] = {"Adam", "Eve", "Sue", "Mary", "Bob"};
	
	
	InteractiveFrame()
	{
		frame = new JFrame("My Interactive Frame");
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteractiveFrame myFrame = new InteractiveFrame();

	}

}
