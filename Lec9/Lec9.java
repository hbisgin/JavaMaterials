
public class Lec9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=4, num1=6;
		int result = 3*(b++);
		System.out.println("Result " + result + " b: " + b);
		
		boolean flag = false;
		char c='b'; 
		System.out.println("a is equal to b? "+ (a==b) + "\t" + flag + " ~flag is " + !flag + " " + (c=='d'));
		if (a%2==0)
		{
			System.out.println(a + " is even" );
		}
		
		System.out.println("left shifted 6 is " + (num1<<1) + " right shifted 6 is " + (num1>>1) + " Bitwise OR " + (a|b) );
		
		if(a==b)
		{
			System.out.println("they are equal");
		}

	}

}
