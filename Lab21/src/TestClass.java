import java.util.InputMismatchException;
import java.util.Scanner;

public class TestClass {
	
	public static int quotient(int num, int dem)
	{
		return num/dem;
	}
	
	public static void main (String[] args)
	{
		int n, d;
		Scanner input = new Scanner(System.in);
		try {
		System.out.println("Can you give me numerator?");
		n = input.nextInt();
		
		System.out.println("Can you give me denominator?");
		d = input.nextInt();
	
		System.out.println(" The quotient is " + quotient(n,d));
		}catch(ArithmeticException e)
		{
			System.err.println("You can't divide by zero " + e.getMessage());
		}catch(InputMismatchException e)
		{
			System.err.println("Your entry is not a number!!! " + e.getMessage());
		}
		
		System.out.println("Your code didn't crash"); //This is my benchmark to show that my program is not terminated
	}

}
