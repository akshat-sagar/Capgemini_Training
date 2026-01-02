package class_22_12_25;
import java.util.*;

public class typeCasting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Widening
		System.out.print("Enter the value for a:(int)  ");
		int a = s.nextInt();
		
		
		//Narrowing
		System.out.print("Enter the value of x:(Double)  ");
		double x = s.nextDouble();
		
		
		
		double b =  a;
		int z = (int) x;
		System.out.print("Int to Double: " + b + " Double to int: " + z);
		
		

	}

}
