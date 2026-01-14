package class_07_01_26_Prac_Inheritance_Overriding_Bank;

public class TestApp {

	public static void main(String[] args) {

		Bank b1 = new SBI();
		Bank b2 = new HDFC();
		
		b1.getInterestRate();
		b2.getInterestRate();

	}

}
