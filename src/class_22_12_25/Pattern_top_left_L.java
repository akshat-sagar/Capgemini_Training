package class_22_12_25;
import java.util.*;

public class Pattern_top_left_L {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number for length -->  ");
		int num = s.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				if(i == 1 || j == 1 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}

	}

}
