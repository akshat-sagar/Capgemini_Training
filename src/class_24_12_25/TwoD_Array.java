package class_24_12_25;
import java.util.*;
public class TwoD_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows -->  ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of Cols --> ");
		int cols = sc.nextInt();
		
		int a [] [] = new int[rows][cols];
		
		System.out.println("Enter the elements in array -->  ");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				a [i] [j] = sc.nextInt();
				
			}
			
		}
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println("");

	}

	}
}

