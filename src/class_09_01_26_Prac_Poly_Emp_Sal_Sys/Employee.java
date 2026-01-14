package class_09_01_26_Prac_Poly_Emp_Sal_Sys;

class Employee {
	public double calculateSalary() {
		return 0.0;
	}
}
class Developer extends Employee {
	public double calculateSalary() {
		double baseSalary = 50000;
		double bonus = 10000;
		return baseSalary + bonus;
	}
}

class Manager extends Employee{
	public double calculateSalary() {
		double baseSalary = 100000;
		double bonus = 20000;
		return baseSalary + bonus;
		
	}
}