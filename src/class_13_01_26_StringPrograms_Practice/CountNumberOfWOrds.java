package class_13_01_26_StringPrograms_Practice;

public class CountNumberOfWOrds {

	public static void main(String[] args) {

		String str = "Hello my name is akshat sagar";
		int count = str.split("\\s").length;
		System.out.println(count);

	}

}
