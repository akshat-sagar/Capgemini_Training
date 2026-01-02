package class_22_12_25;
import java.util.*;

public class even_odd_mod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number to check:  ");
		int num = s.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even");
			
		}else {
			System.out.println("Number is odd!");
		}
		

	}

}
