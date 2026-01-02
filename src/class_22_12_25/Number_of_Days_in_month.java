package class_22_12_25;
import java.util.*;

public class Number_of_Days_in_month {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the month name of the Year to find number of days!  ->  ");
		String month = s.nextLine().toLowerCase();
		
		switch(month) {
	case "january":
    case "march":
    case "may":
    case "july":
    case "august":
    case "october":
    case "december":
				System.out.println(month + " have 31 days") ;
				break;
	case "february":
				System.out.println(month + "have 28/29 days");
				break;
				
	 case "april":
     case "june":
     case "september":
     case "november":
				System.out.println(month + "have 30 days");
				break;
				
			
		
		

	}

	}
}
