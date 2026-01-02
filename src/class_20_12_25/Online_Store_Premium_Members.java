package class_20_12_25;
import java.util.*;
public class Online_Store_Premium_Members {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the total purchase amount: ");
		int total_purchase = s.nextInt();
		
		System.out.print("Are you a premium Customer?: (true / false)  ");
		boolean premium = s.nextBoolean();
		//we need true
		
		System.out.print("Are you a first time Customer?: (true / false)  ");
		//we need false
		boolean first_time = s.nextBoolean();
		
		boolean eligible = (total_purchase > 2000 && premium) || !first_time ? true : false;
		double final_price =  total_purchase;
		final_price = eligible ? final_price - (total_purchase*0.1) :  final_price;
		System.out.print("Final Price: ");
		System.out.print(final_price);
		
		
				
		//amount > 2000 && user premium || not first time customer
		
		
	}

}
