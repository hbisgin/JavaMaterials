
public class Payment {

	protected double amount;
	
	public Payment()
	{
		this.amount = 0;
	}
	
	public Payment(double amount)
	{
		this.amount = amount;
	}
	
	public void makePayment()
	{
		System.out.println(amount + " paid");
	}
}
