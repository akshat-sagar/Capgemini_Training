package class_24_12_25;
import java.util.*;
public class Program_Factors_of_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,8,10,15};
		System.out.print("Elements divisible by 5 Are: ");
		for(int x: arr) {
			if(x%5==0) {
				System.out.print(x+" ");
			}
		}
	}
}
