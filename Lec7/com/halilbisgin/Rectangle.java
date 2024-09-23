package com.halilbisgin;

public class Rectangle {
	private double length;
	private double width;
	
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public void setLength(double theLength)
	{
		length = theLength;
	}
	public void setWidth(double theWidth)
	{
		width = theWidth;
	}
	public double CalcArea()
	{
		return length*width;
	}
	
	public static double CalcArea(double theLength, double theWidth)
	{
		return theLength*theWidth;
	}
	
	public double CalcPerimeter()
	{
		return 2*(length+width);
	}
	
	public void displayArea()
	{
		
		System.out.println("Area " + CalcArea());
		
	}
	
	public void displayPerimeter()
	{
		
		System.out.println("Perimeter " + CalcPerimeter());
		
	}
	
	

}
