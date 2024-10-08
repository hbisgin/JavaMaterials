
public class Circle {
	final static double PI=3.14;
	private static int count;
	private double radius;
	
	public Circle()
	{
		radius=1;
		count++;
	}
	
	public Circle(double r)
	{
		radius = r;
		count++;
	}
	
	public double getRadius() {return radius;}
	
	public static int getCount()
	{
		//radius = 2.5; //we can't put a non-static variable inside a static method
		return count;
	}
	
	public int getCount2()
	{
		return count;
	}

	public void displayCount()
	{
		System.out.println("Calling static method getCount" + getCount()); //inside a non-static, call static
	}
	
	public static void displayCountS()
	{
		System.out.println("Calling static method getCount" + getCount()); //inside static, call static
		//System.out.println("Calling static method getCount" + getCount2()); //inside static, can't call non-static
		System.out.println(PI);
	}
	
	public int foo(int x)
	{
		int count = x; //this count is local, and specific to foo function
		return count;
	}
		
}
