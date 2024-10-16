
public class Person {

	private String name;
	
	public static double getAverage(double... numbers)
	{
		double total = 0;
		for(double num:numbers)
		{
			total+=num;
		}
		
		return total/numbers.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Average is " + getAverage(3.5, 7.5, 1));

	}

}
