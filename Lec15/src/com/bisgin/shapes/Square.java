package com.bisgin.shapes;

public class Square extends Shape {
	double side;
	
	public Square(double s)
	{
		this.side = s;
		setArea(s*s); //who is this setArea, and how come can I call this like this? 
		//it is coming from the parent which would allow you to use without the help of an object reference
		setPerimeter(4*s);
	}
	
	public void setSide(double side)
	{
		this.side=side;
	}
	
	public double getSide()
	{
		return side;
	}

	//you can also create a main method here to test this relationship out. 
}
