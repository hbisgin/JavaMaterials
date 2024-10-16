import java.util.ArrayList;

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
		ArrayList<String> sArray = new ArrayList<String>(); 
		System.out.println("Arguments " + args[0] + " " + args[1] + " "+ args[2]);
		System.out.println("Average is " + getAverage(3.5, 7.5, 1));
		
		sArray.add("Adam");
		sArray.add("Eve");
		sArray.add("Joe");
		sArray.add("Jane");
		sArray.add("Mary");
		
		for(int i=0;i<sArray.size();i++)
		{
			System.out.println(sArray.get(i));
		}
		
		System.out.println("******************************");
		sArray.add(0, "Sue");
		if(!sArray.isEmpty()) //isEmpty: if it is false and I want to print, then I should use ! in front of it
		{
			for(int i=0;i<sArray.size();i++)
			{
				System.out.println(sArray.get(i));
			}
		}

	}

}
