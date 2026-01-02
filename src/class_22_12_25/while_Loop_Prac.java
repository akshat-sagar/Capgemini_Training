package class_22_12_25;
import java.util.*;

public class while_Loop_Prac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of times you want to print star: ->  ");
		int num = s.nextInt();
		int i = 0;
		
		while(i<=num) {
			System.out.println("*");
			i++;
		}
		

	}

}
