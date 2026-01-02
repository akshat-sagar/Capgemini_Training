package class_20_12_25;

import java.util.*;

public class Employee_Increment_Eligiblity {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Salary of the employee: ");
		int salary = s.nextInt();
		
		System.out.print("Enter the performace rating of the employee: ");
		int performance_rating = s.nextInt();
		
		System.out.println("Enter the Years of experince of the employee: ");
		int experience = s.nextInt();
		
		System.out.print("Employee have any Discplinary Actions?: (true / false) ");
		boolean actions = s.nextBoolean();
		
		boolean eligible = (performance_rating > 4 || experience > 6) && !actions ? true : false;
		
		System.out.println(eligible  ? "Salary Increment Allowed" : "Salary Increment Not Allowed" );
		
		
	}

}
