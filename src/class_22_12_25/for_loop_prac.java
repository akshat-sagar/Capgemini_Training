package class_22_12_25;
import java.util.*;
public class for_loop_prac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the numbers of time you want to print star ->  ");
		int num = s.nextInt();
		
		for(int i =0; i < num; i++) {
			System.out.print(" * ");
		}
		

	}

}
