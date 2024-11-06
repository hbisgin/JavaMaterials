
public class Check extends Payment{
	
	private String name;
	private Date checkDate;
	
	public Check(String name, double amount, Date checkDate)
	{
		super(amount);
		this.name = name;
		this.checkDate= checkDate;
	}
	
	
	@Override 
	public void makePayment()
	{
		System.out.println("Amount paid in check is " + amount);
		System.out.println("Date: " + checkDate.getDay() + " " + checkDate.getMonth() + " " + checkDate.getYear());
	}

	
}
