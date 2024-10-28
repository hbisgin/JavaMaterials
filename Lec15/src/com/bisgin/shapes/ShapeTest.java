package com.bisgin.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square(3);
		Rectangle rt = new Rectangle(4,6);
		Shape shape = new Shape(); // you don't know what shape you're working with yet. There is no default value
		System.out.println("for side " + sq.getSide() + " Area: " + sq.getArea() + " Perimeter " + sq.getPerimeter());
		System.out.println("Rectangle"+ " Area: " + rt.getArea() + " Perimeter " + rt.getPerimeter());
		System.out.println( "Area: " + shape.getArea() + " Perimeter " + shape.getPerimeter());

	}

}
