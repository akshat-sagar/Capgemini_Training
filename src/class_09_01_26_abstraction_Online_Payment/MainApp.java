package class_09_01_26_abstraction_Online_Payment;

public class MainApp {

	public static void main(String[] args) {

		Payment p1 = new UPIPayment();
		Payment p2 = new NetBankingPayments();
		Payment p3 = new CreditCardPayment();
		
		p1.printReceipt();
		p2.processPayment(900);
		
		p3.processPayment(90);
		p1.printReceipt();
	}

}
