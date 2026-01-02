package class_20_12_25;
import java.util.*;

public class System_Allows_Login {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//user pass correct && acnt not locked 
		//if fails - > attmpt counter increase 
		//lock after 5 invalid attmpts
		
		int max_attempts = 3;
		int attempts = 0;
		
		System.out.print("Is user ID and Password correct? [true / false]:  -  ");
		boolean cred = s.nextBoolean();
		
		
		System.out.print("Is account locked? [true / false]:  -  ");
		boolean account_lock = s.nextBoolean();
		
		boolean login_allowed = cred && !account_lock ? true : false;
		
		
		
		System.out.println(login_allowed ? "Login" : (++attempts <= 3) + "Login failed " + attempts);
	}

}
