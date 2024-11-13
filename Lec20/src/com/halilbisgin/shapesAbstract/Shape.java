package com.halilbisgin.shapesAbstract;

public abstract class Shape {
	protected double area;
	protected double perimeter;
	
	public Shape(double area, double perimeter)
	{
		this.area = area;
		this.perimeter = perimeter;
	}
	
	public abstract void setArea(double area); //When setting the area and perimeter
	public abstract void setPerimeter(double perimeter);
	
	public double getArea()
	{
		return area;
	}
	
	public double getPerimeter()
	{
		return perimeter;
	}
	
}
