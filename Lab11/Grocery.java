import java.util.Scanner;

public class Grocery {

	private Item [] items;
	
	public Grocery(Item [] theItems)
	{
		items = theItems;
	}
	
	public double calculateCost()
	{
		double total = 0;
		for(Item item: items)
		{
			total += item.getPrice();
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item("Grapes", 2.5);
		Item item2 = new Item("Oranges", 3.5);
		Item [] myItems = {item1, item2};
		
		Grocery grocery = new Grocery(myItems);
		System.out.println(grocery.calculateCost());
		

	}

}
