package class_24_12_25;
import java.util.*;

public class Program_Sum_Of_All_Digits {
	
	public static int SumOfDigits(int a) {
		int sum = 0;
		
		while(a > 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the numbers to get sum of the digits --> ");
		int num = s.nextInt();
		
		int sum = SumOfDigits(num);
		System.out.println("The sum of the digits are -->  " + sum);

	}

}
