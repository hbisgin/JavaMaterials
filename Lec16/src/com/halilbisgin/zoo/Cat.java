package com.halilbisgin.zoo;

public class Cat extends Animal{

	private String breed;
	
	public Cat(String breed) // just relying on the default constructor of my parent class to initialize name and ID;
	{
		this.breed = breed;
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("Meaowwww");
	}
	
	@Override
	public void displayInfo() //Remember the setPerimeter==> Remember the Titans
	{
		System.out.println("My id is :" + ID);
		super.displayInfo(); //super means you're referring to your superclass
		//System.out.println("My id is :" + ID + " my name is " + getName()); 
		//the sdifference between name and ID is their access levels
	}
	
}
