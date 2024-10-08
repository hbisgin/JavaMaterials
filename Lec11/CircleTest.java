import java.util.Random;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle();
		System.out.println("using getCount " + Circle.getCount());
		Circle.displayCountS();
		
		Circle circle2 = new Circle();
		System.out.println("using getCount " + Circle.getCount());

		Circle circle3 = new Circle(3);
		System.out.println("using getCount " + Circle.getCount());
		
		System.out.println(circle1.getRadius() + " " + circle2.getRadius() + " " + circle3.getRadius());
		System.out.println(Math.pow(4, 3));
		System.out.println("here is the result " + (5 + 2));
		
		for(int i=0; i<10; i++)
		{
			System.out.println(Math.random());
		}
		
		Random gen = new Random();
		for(int i=0; i<10; i++)
		{
			System.out.println(gen.nextDouble());
		}
		
		//System.out.println(i); // because i is spcific to the for loop above
		
		System.out.println("using foo count is  " + circle3.foo(300));
		System.out.println("using getCount count is " + Circle.getCount());
		
		
		int myThrows = 1000000;
		int pointsInside=0;
		
		for(int i=0; i<myThrows; i++)
		{
			double x = gen.nextDouble();
			double y = gen.nextDouble();
			
			if( (Math.pow(x, 2) + Math.pow(y, 2))<=1)
			{
				pointsInside++;
			}
		
		}
		
		System.out.println("approximate PI: " + 4*(double)pointsInside/myThrows);
		
		
	}

}
