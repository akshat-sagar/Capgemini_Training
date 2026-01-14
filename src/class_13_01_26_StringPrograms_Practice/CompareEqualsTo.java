package class_13_01_26_StringPrograms_Practice;

public class CompareEqualsTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "akshat";
		String s2 = "akshat";
		String s3 = new String("sagar");
		System.out.println(s1 == s2);      // true (same memory location)
		System.out.println(s1 == s3);      // false (different memory locations)
		System.out.println(s1.equals(s3));
	}

}
