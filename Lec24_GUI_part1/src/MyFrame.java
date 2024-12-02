import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame { //extends JFrame

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("My First Frame");
		JPanel eastPanel = new JPanel();
		JPanel westPanel = new JPanel();
		
		JButton east1Button = new JButton("East Button 1");
		JButton west1Button = new JButton("West Button 1");
		
		//there is no connection between panel and the frame yet!
		
		frame.add(eastPanel, BorderLayout.EAST);
		frame.add(westPanel, BorderLayout.WEST);
		
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
