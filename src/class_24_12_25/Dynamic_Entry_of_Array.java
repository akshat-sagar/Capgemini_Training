package class_24_12_25;
import java.util.*;


public class Dynamic_Entry_of_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array to make first -->  ");
		int nums = sc.nextInt();
		
		System.out.println("Enter the data in array -->  ");
		int [] a = new int [nums];
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
			
		}

	}

}
