package class_20_12_25;
import java.util.*;
public class Extra_TIme_In_Exam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//extra time - if physically challanged - or - att low 60 -- but approved but admin
		//add extra min
		
		
		System.out.print("Enter your attendance: ");
		int attendance = s.nextInt();
		
		System.out.print("Are you physically challanged? (true / false) - ");
		boolean challanged = s.nextBoolean();
		
		System.out.print("Approved by Administration? (true / false) - ");
		boolean admin_approved = s.nextBoolean();
		
		boolean eligible = challanged || (attendance < 60 && admin_approved) ? true : false;
		
		System.out.println(eligible ? "Extra minute added" : "No Extra time given");
	}

}
