package com.halilbisgin.point;

import javax.swing.JOptionPane;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=100;
		b=a;
		a = 200; //this change doesn't effect b because these are not reference variables
		int theX = Integer.parseInt(JOptionPane.showInputDialog("What is your X coordinate?"));

		Point point1 = new Point(30, 60);
		Point point2 = new Point(15, 45);
		Point point3 = new Point(theX);
		
		System.out.println("Point 1: " + point1.getX() + ", " + point1.getY());
		System.out.println("Point 2: " + point2.getX() + ", " + point2.getY());
		System.out.println("Point 3: " + point3.getX() + ", " + point3.getY());
		System.out.println("**************************************************");
		
		
		point1.setX(10);
		point1.setY(10);
		point2.setX(20);
		point2.setY(20);
		System.out.println("Point 1: " + point1.getX() + ", " + point1.getY());
		System.out.println("Point 2: " + point2.getX() + ", " + point2.getY());
		
		point2 = point1; //we assigned point1 to point2, which implicates that both will oversee the same memory location
		
		point1.setX(100);
		point1.setY(100);
		System.out.println("After the assignment and changing point 2 coordinates:");
		System.out.println("Point 1: " + point1.getX() + ", " + point1.getY());
		System.out.println("Point 2: " + point2.getX() + ", " + point2.getY());
		
		point2.displayAverage();

	}

}
