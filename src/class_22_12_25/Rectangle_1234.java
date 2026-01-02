package class_22_12_25;
import java.util.*;

public class Rectangle_1234 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of times you want to print -->  ");
		int num = s.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
