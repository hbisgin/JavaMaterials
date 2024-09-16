package com.halilbisgin;

/*Created by HB
 * this is a block comment
 * as you can tell
 * and this program is about formatting your strings and numbers
 */
import java.util.Scanner;

public class FormatPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is a comment
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to ");
		System.out.println("Java programming");
		int num0 = 9;
		float num1 = 2.5f;
		double num2 = 3.5;
		double d1 = 2.7249123;
		double num4 = 2.745;
		
		System.out.printf("Number 1 is %f, and number 2 is %f\n", num1, num2);
		System.out.println("did you like it?");
		System.out.printf("Num zero is %d\n", num0);
		System.out.printf("Num zero is %6d\n", num0);
		System.out.printf("%f\n", d1);
		System.out.printf("%.2f\n", d1);
		System.out.printf("%.3f\n", d1);
		System.out.printf("%.4f\n", d1);
		System.out.printf("%.2f\n", num4);
		System.out.printf("%.1f\n", num4);
		//System.out.print ("One\t\"Two\"\tThree\n ");
		
		System.out.printf ("%-9s %9s\n", "Name", "Marks");

		//System.out.println ("Four\t\\Five\\\tSix");
	}

}
