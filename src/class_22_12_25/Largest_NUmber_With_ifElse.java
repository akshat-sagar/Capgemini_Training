package class_22_12_25;
import java.util.*;
public class Largest_NUmber_With_ifElse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the First number");
		int num1 = s.nextInt();
		System.out.println("Enter the Second number");
		int num2 = s.nextInt();
		
		if(num1 == num2) {
			System.out.println("Both Numbers are same");
		}else if(num1 > num2) {
			System.out.println("First Number is larger than Second ");
		}else {
			System.out.println("Second Number is larger than First");
		}
		
		
		

	}

}
