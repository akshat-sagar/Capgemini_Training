package class_10_01_26_ObjectClass_Ram_Rom;
import java.util.*;
public class PhoneApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		Phone[] phone = new Phone[5];
		
		for(int i = 0; i <phone.length; i++) {
			System.out.println("Enter details of phoen : " + (i + 1));
			
			 System.out.print("Enter RAM: ");
	            int ram = sc.nextInt();

	            System.out.print("Enter ROM: ");
	            int rom = sc.nextInt();
	            
	            phone[i] = new Phone(ram, rom);

		}
		System.out.println("\nPhone Details:");
        for (Phone p : phone) {
            System.out.println(phone);
        }

        sc.close();
		
		

	}

}
