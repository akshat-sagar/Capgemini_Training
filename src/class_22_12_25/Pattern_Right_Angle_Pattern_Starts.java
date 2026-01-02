package class_22_12_25;
import java.util.*;

public class Pattern_Right_Angle_Pattern_Starts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of times you want to print a star -> ");
		
		int num = s.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
