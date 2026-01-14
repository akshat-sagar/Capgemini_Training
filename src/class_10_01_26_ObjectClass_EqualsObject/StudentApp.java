package class_10_01_26_ObjectClass_EqualsObject;

public class StudentApp {

	public static void main(String[] args) {

		Student s1 = new Student("Kavya", 1);
		Student s2 = new Student("Kavya", 1);
		Student s3 = s1;

		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		// one memory block created and 
	}

}
