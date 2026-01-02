package class_22_12_25;
import java.util.*;
public class Pattern_Right_Angle_RightSide {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length -->  ");
		int num = s.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = num; j>=i ; j-- ) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		

	}

}
