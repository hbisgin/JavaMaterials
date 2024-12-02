import javax.swing.JOptionPane;

public class GUI_Dialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Welcome!");
		String message = JOptionPane.showInputDialog("give me a number"); //return a string
		System.out.println("You entered " + message); //note that message is still a String
		

	}

}
