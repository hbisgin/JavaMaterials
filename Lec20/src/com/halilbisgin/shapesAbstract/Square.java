package com.halilbisgin.shapesAbstract;

public class Square extends Shape {
	private double side;
	
	public Square(double side)
	{
		super(side*side, 4*side);
		this.side = side;
	}
	
	public void setArea(double area)
	{
		this.side = Math.sqrt(area);
		this.area = area;
		
		this.perimeter = 4*side;
	}
	
	public void setPerimeter(double perimeter)
	{
		this.side = perimeter/4;
		this.perimeter = perimeter;
		
		this.area = side*side;
	}
	
	//if you had the getArea or getPerimeter defined abstract earlier, you could recalculate them here
	//you can also override your getters. 

}
