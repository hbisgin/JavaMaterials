
public class Cash extends Payment {
	public Cash(double amount)
	{
		super(amount);
	}
	
	@Override
	public void makePayment()
	{
		System.out.println("Paid in cash");
		System.out.println(amount + " paid");
		
	}

}
