
public class Item {

	private String name;
	private double price;
	
	public Item()
	{
		name = "banana";
		price = 0.49;
	}
	
	public Item(String theName, double thePrice)
	{
		name = theName;
		price = thePrice;
	}
	
	public String getName() {return name;}
	public double getPrice() {return price;}
}
