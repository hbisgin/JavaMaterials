
public class Point {
	int x, y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point(int x)
	{
		this.x = x;
		this.y = 0;
	}
	
	public String toString()
	{
		return x + " " + y;
	}
	
	public static void main(String[] args)
	{
		Point p1 = new Point(2,3);
		Point p2 = new Point(2);
		System.out.println(p1);
		System.out.println(p2);
	}
	
}
