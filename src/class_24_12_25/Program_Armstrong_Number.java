package class_24_12_25;
import java.util.*;

public class Program_Armstrong_Number {
	
	public static boolean isArmstrong(int a) {

		int count = 0;
		
		while(a<=0) {
			
			a = a / 10; //
			count ++;
		}
		// count ker liye
		// ab har ek digit ko count k times multiply kernge
		
		for(int i = 1; i <=count; i++) {
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to check if it is armstorng or not -->  ");
		int num = s.nextInt();
		
		boolean arm = isArmstrong(num);
		
		if(arm) {

			System.out.println("is armstrong number");
		}
		else {

			System.out.println("Not an armstrong number");
		}
		

	}

}
