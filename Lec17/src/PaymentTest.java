
public class PaymentTest {
	
	public static void main(String [] args)
	{
	Payment payment = new Payment(100);
	Cash cash = new Cash(1000);
	
	payment.makePayment();
	cash.makePayment();
			
	}

}
