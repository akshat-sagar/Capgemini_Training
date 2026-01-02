package class_19_12_25;
import java.util.*;
public class MultipleOf10 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check:  ");
		
		int num = sc.nextInt();
		
		System.out.println(num%2==0 || num%5==0  ? num +" Number is divisible" : num+ " Number is not divisible" );
		
		
	}

}
