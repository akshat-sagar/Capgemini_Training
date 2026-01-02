package class_23_12_25;
import java.util.*;

public class Method_Return_WIthArgs {
	
	
	public static int add(int a, int b) {
		int sum = a + b;
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a --> ");
		int a = s.nextInt();
		System.out.println("Enter the value of b --> ");

		int b = s.nextInt();
		
		System.out.println(add(a,b));


	}

}
