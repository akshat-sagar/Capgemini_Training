package class_13_01_26_StringPrograms_Practice;

public class ReverseString {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "";
		
		for(int i = 0; i < s1.length(); i++) {
			s2 =  s1.charAt(i) + s2;
		}
		System.out.println(s2);

	}

}
