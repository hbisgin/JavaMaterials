package com.halilbisgin.shapesAbstract;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle(double width, double length) 
	{
		super(width*length, 2*(width+length));//
		this.width = width;
		this.length = length;
	}

}
