package class_22_12_25;
import java.util.*;


public class Decision_Making {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the age please:  ");
		int age = sc.nextInt();
		
		if(age >= 18)
			System.out.println("You are eligible for voting!");
		
		if(age < 18)
			System.out.println("You are not eligible, \nThank you");

	}

}
