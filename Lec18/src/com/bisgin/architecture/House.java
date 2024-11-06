package com.bisgin.architecture;

public class House extends Building{
	private double yardSize;
	
	@Override
	public void tellMore()
	{
		System.out.println("I am a house at " +  address + " and have " + numRooms + " rooms");
		System.out.println("My yard size is " + yardSize);
	}

}
