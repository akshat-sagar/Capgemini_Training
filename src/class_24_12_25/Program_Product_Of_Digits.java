package class_24_12_25;
import java.util.*;
public class Program_Product_Of_Digits {
	
	public static int ProductOfDigits(int a) {
		int product = 1;
		
		while(a>0) {
			product = product * (a % 10);
			a = a / 10;
		}
		return product;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to get product of it's digits -->  ");
		int num = s.nextInt();
		int prod = ProductOfDigits(num);
		System.out.println("The product of digits are --> " + prod);

	}

}
