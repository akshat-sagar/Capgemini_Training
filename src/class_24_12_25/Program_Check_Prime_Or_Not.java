package class_24_12_25;
import java.util.*;

public class Program_Check_Prime_Or_Not {
	
	
	public static boolean Prime(int a) {
		if(a<=0) {
			return false;
		}
		for(int i = 2; i <= a/2; i++) {
			if(a % 1 == 0) {
				return false;
			}
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime or not -->  ");
		int num = s.nextInt();
		
		boolean prime = Prime(num);
		if(prime) {
			System.out.println("The number is prime ");
		}else {
			System.out.println("The number is not prime");
		}
	}

}
