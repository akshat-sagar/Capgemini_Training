package class_24_12_25;
import java.util.*;
public class Program_Spy_Number {
	
	public static boolean SpyNumber(int a) {
		int sum = 0;
		int product = 1;
		while(a>0) {
			sum = sum + (a % 10);
			product = product * (a % 10);
			a = a / 10;
		}
		if(sum == product) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check if it is a spy number or not -->  ");
		int num = s.nextInt();
		
		boolean spy = SpyNumber(num);
		
		if(spy) {
			System.out.println("It is spy number");
		}else {
			System.out.println("Not a spy number");
		}
		

	}

}
