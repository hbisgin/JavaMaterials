import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;

public class ExceptionTest {

	public static void boo() throws InputMismatchException
	{
		//assume there is a scenario something unexpected happen such user enters a wrong character.
		throw new InputMismatchException("Exception thrown in the boo method");
	}
	
	public static void foo()
	{
		try {
			//assume there is a scenario something unexpected happen such user enters a wrong character.
			InputMismatchException exception = new InputMismatchException ("Exception filled inside foo");
			//exception.initCause(exception)
			throw exception;
		}catch(Exception e)
		{
			System.err.println("got the exception through Exception " + e.getMessage());
			throw e; //I can "re-throw" an exception in case I want to defer it to some other mechanism
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			boo();
		}catch(InputMismatchException e)
		{
			System.err.println("caught with InputMismatchException " + e);
		}catch(Exception e)
		{
			System.err.println("caught with Exception and " + e);
		}finally {
			System.out.println("Finall block called");
		}

		String fileName="Students.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName)); //an example of checked exception, compiler checks
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //this prints all the details. It's like the history/log of the events that you
			//may want to read through to get more information
			System.out.println(e.getCause());
		}
		
		try {
			foo();
		}catch(Exception e) {
			System.err.println("I'm in main and I got the exceptio which is " + e);
		}
		
		System.out.println("My code proudly worked maybe with some exceptions :) ");
	}

}
