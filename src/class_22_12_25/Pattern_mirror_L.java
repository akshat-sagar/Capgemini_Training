package class_22_12_25;
import java.util.*;

public class Pattern_mirror_L {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*    -----------
		 * 				-
		 * 				-
		 * 				-
		 * 				-
		 */
		System.out.println("Enter the length of L --> ");
		int num = s.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=num; j++) {
				if(j == num || i == num) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

	}

}
