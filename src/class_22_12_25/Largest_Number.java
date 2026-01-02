package class_22_12_25;
import java.util.*;
public class Largest_Number {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the first number:  ");
		int num1 = s.nextInt();
		System.out.print("Enter the second number:  ");
		int num2 = s.nextInt();
		
		if(num1>num2) {
			System.out.println("First Number is greater than Second");
		}
		else {
			System.out.println("Second Number is greater than First");	
		}

		
	}

}
