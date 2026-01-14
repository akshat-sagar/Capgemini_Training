package class_09_01_26_abstraction_Online_Payment;

public abstract class Payment {

	public void printReceipt() {
		System.out.println("Printing the receipt! ");
		
	}
	public abstract void processPayment(double amount);
	
	
}
