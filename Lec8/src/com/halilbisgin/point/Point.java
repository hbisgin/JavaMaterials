package com.halilbisgin.point;

public class Point {
	private int x;
	private int y;
	
	public Point()
	{
		x=0;
		y=0;
	} //default constructor
	
	public Point(int theX, int theY)
	{
		x = theX;
		y = theY;
	}//explicit constructor
	
	public Point(int theX)
	{
		x = theX;
		y = 0;
	}//explicit constructor
	
	private double average()
	{
		return (double)(x+y)/2;
	}
	
	public void displayAverage()
	{
		System.out.println("Average is " + average());
	}
	public void setX(int theX)
	{
		x = theX;
	}
	
	public void setY(int theY)
	{
		y = theY;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}

}
