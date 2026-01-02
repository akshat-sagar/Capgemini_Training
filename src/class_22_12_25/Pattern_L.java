package class_22_12_25;
import java.util.*;
public class Pattern_L {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of nums -->  ");
		int num = s.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j =1; j<=num; j++) {
				
				if(j == 1 || i == num) {
					System.out.print("*");
				}
				
			}
			System.out.println("");
		}

	}

}
