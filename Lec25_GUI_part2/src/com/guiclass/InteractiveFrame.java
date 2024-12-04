package com.guiclass;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InteractiveFrame { //extends JFrame implements ActionListener (one option), this keyword to be added.
	JFrame frame;
	JPanel panel1;
	JLabel myLabel, southLabel;
	JTextField myTextField ;
	JList<String>myList;
	JComboBox mycomboBox;
	String numbers[] = {"0", "1", "2", "3", "4"};
	String names[] = {"Adam", "Eve", "Sue", "Mary", "Bob"};
	JLabel nameLabel;
	
	
	InteractiveFrame()
	{
		frame = new JFrame("My Interactive Frame");
		myTextField = new JTextField("Type Here");
		panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JButton button1 = new JButton("Button 1");
		ButtonHandler handler = new ButtonHandler();
		button1.addActionListener(handler);
		JButton button2 = new JButton("Button 2");
		
		myList = new JList<String>(names);
		myList.setVisibleRowCount(3); //it sets the number of rows of the list visible at first.
		myList.addListSelectionListener(new ListListenerHandler()); //Create an object and pass it to the addListSelectionListener method
		
		JScrollPane sPane  = new JScrollPane(myList);
		
		panel2.add(sPane);
		
		//this is just another option to add Listeners in general
		//it is clear that with whom I'm associating what. This is a good reminder for me to follow what I have coded.
		//anonymous class
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myLabel.setText("Button 2 clicked");
			}
			
		});
		
		myLabel = new JLabel("First Label");
		nameLabel = new JLabel("This is a label :)"); //initialize this instance variable here
		panel2.add(nameLabel);
		panel1.add(myTextField);
		panel1.add(button1);
		panel1.add(myLabel);
		panel1.add(button2);
		
		panel1.setLayout(new GridLayout(2,2));
		//frame.add(eastPanel, BorderLayout.EAST);
		//frame.add(westPanel, BorderLayout.WEST);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteractiveFrame myFrame = new InteractiveFrame();

	}
	
	//another option for ActionListener
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) { //you can even leave the method body empty during the implementation to avoid interface warnings
			// TODO Auto-generated method stub
			//System.out.println("Button 1 Clicked");
			myLabel.setText("Button 1 Clicked. Texbox: " + myTextField.getText());
			
		}
		
	}
	
	private class ListListenerHandler implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			String item = myList.getSelectedValue();
			nameLabel.setText(item);
			
		}
		
	}
	

}
