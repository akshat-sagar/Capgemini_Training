package class_22_12_25;
import java.util.*;
public class Pattern_topRight_to_bottomLeft_Diagonal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length -->  ");
		int num = s.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=num; j++) {
				if(i+j==num) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}

	}

}
