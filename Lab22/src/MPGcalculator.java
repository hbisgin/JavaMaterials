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
	
	public static int CalculateMPG(int miles, int galons) throws DivisionByZeroException, NegativeValueException
	{
		if(miles<0 || galons<0)
		{
			throw new NegativeValueException("no negative entries please");
		}
	
		if(galons==0)
		{
			throw new DivisionByZeroException("non zero galons please");
		}
		
		return miles/galons; //this throws the division exception by itself
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int miles, galons;
		Scanner input = new Scanner(System.in);
		System.out.println("How many miles did you travel?");
		miles = input.nextInt(); //Assume that inputs are numbers. I rely on the user that they don't put characters.
		System.out.println("How much gas did you consume?");
		galons = input.nextInt();
		
		try {
			int mpg = CalculateMPG(miles, galons);
			System.out.println("Your mpg is " + mpg);
		}
		catch (DivisionByZeroException e) {
			System.err.println(e);
		}catch(NegativeValueException e) {
			System.err.println(e);
		}finally{
			System.out.println("I hope you had a good experience with MPG calculator ");
		}
			

	}

}
