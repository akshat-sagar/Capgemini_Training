package class_22_12_25;
import java.util.*;

public class upper_lower_Digit_Special {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a character to check -> ");
		char a = s.next().charAt(0);
		
		if(a >= 'A' && a <= 'Z') {
			System.out.println("Upper Case");
		}else if(a >= 'a' && a <= 'z') {
			System.out.println("Lower Case");
		}else if(a >= '0' && a <= '9') {
			System.out.println("Digits");
		}else {
			System.out.println("Special Characters! ");
		}
		

	}

}
