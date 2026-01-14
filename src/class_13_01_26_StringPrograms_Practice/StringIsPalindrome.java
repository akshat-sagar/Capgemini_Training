package class_13_01_26_StringPrograms_Practice;

public class StringIsPalindrome {

	public static void main(String[] args) {

		// STRING PALINDROM
		
		String str = "helleh";
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase())){
			System.out.println("Palindrom");
		}else {
			System.out.println("NOT");
		}
	}

}
