
public class Cash extends Payment {
	public Cash(double amount)
	{
		super(amount);
	}
	
	public Cash()
	{
		super();
	}
	
	@Override
	public void makePayment()
	{
		System.out.println("Paid in cash");
		System.out.println(amount + " paid");
		
	}

}
