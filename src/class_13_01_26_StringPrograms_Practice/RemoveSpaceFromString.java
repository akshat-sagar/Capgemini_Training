package class_13_01_26_StringPrograms_Practice;

public class RemoveSpaceFromString {

	public static void main(String[] args) {

		String str = "Hi my name is akshat sagar ";
		String s1 = str.replaceAll("\\s" , "");
		System.out.println(str);
		System.out.println(s1);

	}

}
