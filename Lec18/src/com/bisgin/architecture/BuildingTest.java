package com.bisgin.architecture;

public class BuildingTest {

	public void callBuilding(Building building)
	{
		building.tellMore();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building building1 = new Building();
		House house1 = new  House();
		
		BuildingTest btest = new BuildingTest();
		
		
		building1.tellMore();
		System.out.println("-----------------------------------------");
		house1.tellMore();
		System.out.println("-----------------------------------------");
		btest.callBuilding(house1); //Recall that the method/function definition was involving the parent class reference variable

	}

}
