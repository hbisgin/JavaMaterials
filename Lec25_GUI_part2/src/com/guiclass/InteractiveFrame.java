package com.guiclass;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InteractiveFrame { //extends JFrame
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
		myTextField = new JTextField("Type Here");
		panel1 = new JPanel();
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		myLabel = new JLabel("First Label");
		panel1.add(myTextField);
		panel1.add(button1);
		panel1.add(myLabel);
		panel1.add(button2);
		
		panel1.setLayout(new GridLayout(2,2));
		frame.add(panel1);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteractiveFrame myFrame = new InteractiveFrame();

	}

}
