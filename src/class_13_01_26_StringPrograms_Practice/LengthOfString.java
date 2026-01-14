package class_13_01_26_StringPrograms_Practice;

public class LengthOfString {

	public static void main(String[] args) {

		int count = 0;
		String str = "Hello";
		for(char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		
	}

}
