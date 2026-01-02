package class_22_12_25;
import java.util.*;
public class Max_Of_Three {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		
		System.out.print("Enter the first number: ");
		int num1 = s.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = s.nextInt();
		System.out.print("Enter the third number: ");
		int num3 = s.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("First number is maximum!" + num1);
			}else {
				System.out.println("Third number is maximum! " +num3);

			}
			
		}else if(num2 > num3) {
			System.out.println("Second number is maximum! " + num2);
			
		}else {
			System.out.println("Third number is Maximum!" + num3);
		}
		
		
	}

}
