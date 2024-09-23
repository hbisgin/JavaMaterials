package com.halilbisgin;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		double length = input.nextDouble();
		double width = input.nextDouble();
		r1.setLength(length);
		r1.setWidth(width);
		r1.displayArea();
		r1.displayPerimeter();
        System.out.println("area with static Calc " + Rectangle.CalcArea(length, width));
	}

}
