package class_23_12_25;
import java.util.*;


public class Pattern_Triangle_Up_Down_SquareShapeTypeInAngle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length for this -->  ");
		int num = s.nextInt();
		
		
		for(int i = 1; i<num*2; i++) {
			for(int j = 1; j<num*2; j++) {
				if(i+j > num+1 && j-i < num-1 && i-j <=num-1 && i+j <num*3) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
