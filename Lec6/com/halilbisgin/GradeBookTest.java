package com.halilbisgin;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a;
		int cSize;
		Scanner input  = new Scanner(System.in);
		System.out.println("What is the size of your class?");
		cSize = input.nextInt();
		
		GradeBook gb1;
		gb1 = new GradeBook(); //this will create a GradeBook object
		
		gb1.setCourseSize(cSize);
		
		System.out.println("What is the size of your class?");
		cSize = input.nextInt();
		
		GradeBook gb2 = new GradeBook();
		gb2.setCourseSize(cSize);
		gb1.setCourse("CSC276");
		gb2.setCourse("CSC384");
		gb1.displayMessage();
		gb2.displayMessage();
		//System.out.println(gb1.course); //private doesn't let this to happen
		
	}

}
