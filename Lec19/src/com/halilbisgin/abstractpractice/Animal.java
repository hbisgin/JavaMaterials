package com.halilbisgin.abstractpractice;

public abstract class Animal {
	protected String name;
	
	public abstract void makeSound(); //abstract
	
	public void displayInfo() //concrete method
	{
		System.out.println("My name is " + name);
	}

}
