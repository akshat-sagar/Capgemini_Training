package class_13_01_26_StringPrograms;

public class StringBufferEx {

	public static void main(String[] args) {

					
		
		StringBuffer s1 = new StringBuffer();
		s1.append ("Hello");
		System.out.println(s1);
		// insert
		s1.insert(1, "hii");
		System.out.println(s1);
		// replace
		s1.replace(1,  3, "Zero");
		System.out.println(s1);
		// delete
		System.out.println(s1.delete(4, s1.length()));
		// capacity
		System.out.println(s1.capacity());
		s1.append("abcdefghijklm");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		

	}

}
