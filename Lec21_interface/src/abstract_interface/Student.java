package abstract_interface;

public class Student extends Person {
	private int sID;
	private String major;
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " ID " + sID + " major: " + major );
		
	}

}
