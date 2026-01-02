package class_22_12_25;
import java.util.*;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		
		
		System.out.print("enter a letter->  ");
		char a = Character.toLowerCase(s.next().charAt(0));
		
		
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("This is a vowel!");
		}else {
			System.out.println("This is consonant");
		}
		
		
		
	
	}

}
