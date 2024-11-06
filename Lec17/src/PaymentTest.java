
public class PaymentTest {
	
	public static void main(String [] args)
	{
	Date myDate = new Date(1,1,2024);
	
	Payment payment = new Payment(100);
	Payment payment2 = new Payment();
	Cash cash = new Cash(1000);
	
	String name = "JOsh";
	Check check = new Check(name, 10000,  myDate);
	
	payment.makePayment();
	payment2.makePayment();
	cash.makePayment();
	check.makePayment();
			
	}

}
