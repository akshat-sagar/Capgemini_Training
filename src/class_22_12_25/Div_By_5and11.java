package class_22_12_25;
import java.util.*;

public class Div_By_5and11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number to check it's divisibilty by 5 and 11 or not: ");
		int num = s.nextInt();
		
		if(num%5==0 && num%11==0) {
			System.out.println("Number is Divisible by 5 and 11");
		}else {
			System.out.println("Number is not Divisible at all ");
		}
		
	}

}
