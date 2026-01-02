package class_24_12_25;
import java.util.*;

public class Program_Count_Digits {
	
	
	
	public static int CountDigits(int a) {
		int count = 0;
		
		while (a>0) {
			a = a / 10;
			count++;
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the numbers to count digits -->  ");
		int num = s.nextInt();
	
		int digits = CountDigits(num);
		System.out.println("The number of digits are " + digits);
		


	}

}
