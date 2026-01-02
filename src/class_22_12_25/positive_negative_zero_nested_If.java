package class_22_12_25;
import java.util.*;

public class positive_negative_zero_nested_If {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = s.nextInt();
		
		
		if(num > 0) {
			System.out.println("Number is positive");
		}else if(num < 0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is zero");
		}

	}
}
