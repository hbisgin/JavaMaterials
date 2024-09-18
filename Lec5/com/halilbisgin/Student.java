package com.halilbisgin;

public class Student {
	private int id;
	private String name;
	
	public void setName(String the_name)
	{
		name = the_name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setId(int theId)
	{
		id = theId;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void display()
	{
		System.out.println("Student 1 name: " + name + " ID " + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1;
		s1 = new Student(); //first approach. Declare then initialize
		
		Student s2  = new Student(); //second approch. Declare + initialize
		s1.setId(12345); //I called the setter for ID to set the ID to 12345
		System.out.println(s1.id); //This is how to access to your attribute. 
		System.out.println("Student 1 id: " + s1.getId()); //we called the getter her to retrieve
		s1.setName("Adam");
		System.out.println("Student 1 name: " + s1.getName()); //we called the getter her to retrieve
		s1.display();
	}

}
