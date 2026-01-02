package class_20_12_25;
import java.util.*;

public class BankSystem {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the balance amount: ");
		int balance = s.nextInt();
		s.nextLine();		
		
		System.out.print("Enter the account status (active or disable): ");
		String status = s.nextLine();
		
		System.out.println("Enter the amount to withdraw: ");
		int withdraw = s.nextInt();
		
		System.out.println(balance > 0 && status.equals("active") ? "Allow Withdrawal "  : "Withdrawal Denied" );
		
		System.out.print("Remaining balance: " );
		System.out.println(balance - withdraw );
		
		System.out.print("Withdrawed amount: " );
		System.out.println(withdraw );
		
	}

}
	