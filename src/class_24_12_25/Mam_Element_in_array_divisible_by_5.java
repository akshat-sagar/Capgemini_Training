package class_24_12_25;
import java.util.*;

public class Mam_Element_in_array_divisible_by_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of  array  -->  ");
		int nums = sc.nextInt();
		
		System.out.print("Enter the data in array -->  ");
		int [] a = new int[nums];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("The array given is :  ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		int [] div = new int[nums];
		for(int i = 0; i <a.length; i++) {
			if(a[i] % 5 == 0) {
				for(int j = 0; i<a.length; i++) {
					div[j] = a[i];
				}				
			}
		}
		System.out.println("The array elements div by 5 are as follows : ");
		for(int i = 0; i < div.length; i++) {
			System.out.print(div[i] + " ");
	}
	}
}
