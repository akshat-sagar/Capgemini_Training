package class_22_12_25;
import java.util.*;

public class Student_Information {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your Name : ");
		String name = s.next();
		
		System.out.print("Enter your Age : ");
		int age = s.nextInt();
		
		System.out.print("Enter your Address : ");
		String address = s.nextLine();
		s.nextLine();
		
		System.out.println("Welcom " + name + " you are " + age + " years old and you are from " + " address");
		
		
		

	}

}
