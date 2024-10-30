package com.halilbisgin.zoo;

public class ZooKeeper {
	private String name;
	
	public void takeCare(Animal animal)
	{
		System.out.println("Taking care ID " + animal.ID); //since Id is protected, we can say animal.ID here
	}
}
