package abstract_interface;

public abstract class Person {
	private String name;
	
	public abstract void displayDetails();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
