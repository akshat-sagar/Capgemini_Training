package class_20_12_25;
import java.util.*;

public class CheckStudentMark {

	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the marks of student: ");
		int marks = s.nextInt();
		
		System.out.println("Enter the marks of attendance: ");
		int att = s.nextInt();
		
		System.out.println(marks>=40 && att > 75 ? marks + 5 + "  Pass & Bonus Added" : "Fail");
		
		
		

	}

}
