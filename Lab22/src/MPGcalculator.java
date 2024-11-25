import java.util.Scanner;

class DivisionByZeroException extends Exception
{
	DivisionByZeroException(String message)
	{
		super(message);
	}
	
}

class NegativeValueException extends Exception
{
	NegativeValueException(String message)
	{
		super(message);
	}
}


public class MPGcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int miles, galons;
		Scanner input = new Scanner(System.in);
		System.out.println("How many miles did you travel?");
		miles = input.nextInt();
		System.out.println("How much gas did you consume?");
		galons = input.nextInt();
		
		System.out.println("Your mpg is " + miles/galons);
	

	}

}
