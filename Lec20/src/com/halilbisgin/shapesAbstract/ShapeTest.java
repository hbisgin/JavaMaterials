package com.halilbisgin.shapesAbstract;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape shape = new Shape(); //we can't instantiate an abstract class object. Illegal.
		Rectangle rect1 = new Rectangle(4,7); //I call the constructor for the Rectangle class w=4, l=7
		Shape shape = new Rectangle(4,7); //Looks like we CAN. If you do anything like shape.blah, it would call Rectangle method
		//This is an example of Polymorphism again!!!
		System.out.println(shape.getArea() + " " + shape.getPerimeter());
		

	}

}
