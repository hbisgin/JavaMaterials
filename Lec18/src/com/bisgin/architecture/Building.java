package com.bisgin.architecture;

public class Building {
	protected String address;
	protected int numRooms;
	
	public void tellMore()
	{
		System.out.println("I am a bulding at " +  address + " and have " + numRooms + " rooms");
	}
	

}
