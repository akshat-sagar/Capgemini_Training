package class_07_01_26_Prac_Employee_inheritance;

public class Manager extends Employee {

	String department;
	
	void show() {
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Department : " + department);
	}
}
