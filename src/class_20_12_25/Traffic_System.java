package class_20_12_25;
import java.util.*;
public class Traffic_System {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//speed greater than the limit && the driver is not an an emergency 
		//
		System.out.print("Enter the speed you were in [Speed limit is : 40km/hr]:  - ");
		int speed = s.nextInt();
		
		System.out.print("Are you an emergency driver? (true / false):  -  ");
		boolean emergency_driver = s.nextBoolean();
		
		boolean eligible_for_fine = speed > 40 && !emergency_driver ? true : false;
		
		System.out.println(eligible_for_fine ? "Penalty Rs. 1000" : "Free to go!");

	
	
	}

}
