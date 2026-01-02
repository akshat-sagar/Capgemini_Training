package class_22_12_25;
import java.util.*;

public class do_While_prac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char a;
		
		do {
			System.out.println("Welcome \nDo You want me to print again? \npress Y for yes and N for no -> ");
			 a = s.next().charAt(0);
			 
			 
			 
			 
		}
		while(a == 'y' || a =='Y');

	}

}
