package com.guistuff;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class InteractiveFrame {

	JFrame frame;
	JPanel panel1;
	JLabel myLabel, southLabel;
	JTextField myTextField ;
	JList<String>myList;
	JComboBox mycomboBox;
	String numbers[] = {"0", "1", "2", "3", "4"};
	
	InteractiveFrame()
	{
		frame = new JFrame("Interactive Frame");
		
		myList = new JList<>(numbers);
		ListSelectionHandler lsHandler = new ListSelectionHandler();
		myList.addListSelectionListener(lsHandler);
		
		mycomboBox = new JComboBox(numbers);
		mycomboBox.addItemListener(new ItemListenerHandler());
        
		JButton button0 = new JButton("1");
		JButton button1 = new JButton("2");
		myTextField = new JTextField();
		myLabel = new JLabel("First Text");
		southLabel = new JLabel("south label");
		myLabel.setHorizontalAlignment(SwingConstants.CENTER); 
		
		panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		GridLayout layout = new GridLayout(3,2);
		panel1.setLayout(layout);
		panel1.add(myTextField);
		panel1.add(myLabel);
		panel1.add(button0);
		panel1.add(button1);
		
		panel2.add(new JScrollPane(myList));
		panel2.add(southLabel);
		panel2.add(mycomboBox);
       

		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myLabel.setText("Second Text");		
			}
		});
		
		ButtonHandler handler = new ButtonHandler();
		button0.addActionListener(handler);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);

		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteractiveFrame frame = new InteractiveFrame();

	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			myLabel.setText("First Text");
			southLabel.setText(myTextField.getText());
			
		}
		
	}
	
	private class ListSelectionHandler implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			String item = myList.getSelectedValue();
			myLabel.setText(item);
			
		}

	}
	
	private class ItemListenerHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if (e.getStateChange()==ItemEvent.SELECTED)
			{
				southLabel.setText(numbers[mycomboBox.getSelectedIndex()]);
			}
			
		}
		
	}

}
