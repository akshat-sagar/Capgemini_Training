package class_22_12_25;
import java.util.*;
public class percentage_of_5_Subjects {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter marks of Hindi: ");
		int hindi = s.nextInt();
		
		System.out.println("Enter marks of English: ");
		int eng = s.nextInt();
		
		System.out.println("Enter marks of Maths: ");
		int math = s.nextInt();
		
		System.out.println("Enter marks of SST: ");
		int sst = s.nextInt();
		
		System.out.println("Enter marks of Science: ");
		int sci = s.nextInt();
		
		
		double sum = hindi + eng + math + sst + sci;
		
		double per = (sum/500)*100;
		
		System.out.println("Percentage is: " + per);

		
		if(per >90) {
			System.out.println("Grade A");
			
		}else if(per >=70 && per >=89) {
			System.out.println("Grade B");
		}else if( per>=69 && per >=40) {
			System.out.println("Grade C");
		}else {
			System.out.println("Fail!!!!!");
		}
		

	}

}
