package com.halilbisgin.zoo;

public class Animal {
	private String name;
	protected int ID;
	
	public Animal()
	{
		this.name = "Shadow";
		this.ID = 123;
	}
	
	public void makeSound()
	{
		System.out.println("You should not be calling me! I'm not a defined animal yet :)");
	}

	public String getName()
	{
		return name;
	}
	
	public void displayInfo()
	{
		System.out.println("my name is " + name);
	}
}
