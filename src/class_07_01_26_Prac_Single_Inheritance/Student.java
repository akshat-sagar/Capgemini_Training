package class_07_01_26_Prac_Single_Inheritance;

public class Student extends Person {
	

	int roll;
	int marks;
	
	void show() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Marks: " + marks);
		System.out.println("Roll: " + roll);
	}
	
	
}
