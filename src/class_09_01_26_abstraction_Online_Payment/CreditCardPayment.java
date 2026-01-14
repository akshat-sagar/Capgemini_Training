package class_09_01_26_abstraction_Online_Payment;

public class CreditCardPayment extends Payment {

	public void processPayment(double amount) {
		System.out.println("Credit card payment processing");
	}
	
}
