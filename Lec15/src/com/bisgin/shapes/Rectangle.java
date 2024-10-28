package com.bisgin.shapes;

public class Rectangle extends Shape {
	double width;
	double length;
	
	public Rectangle(double width, double length)
	{
		this.length = length;
		this.width = width;
		setArea(length*width);
		setPerimeter(2*(width+length));
	}

}
