package class_23_12_25;
import java.util.*;
public class Pattern_Triangle_Left_To_Right {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Give length -->  ");
		int num = s.nextInt();
		
		for(int i=1 ; i<num*2; i++) {
			for(int j=1; j<=num; j++) {
				if(i>=j && i+j <num*2) {
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			System.out.println("");
		}
		
		

	}

}
