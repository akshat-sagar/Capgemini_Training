package class_06_01_26_inheritance;

public class Son extends Father{
	String name = "Akshat";
	
	public void display() {
		System.out.println("My father's name : " + super.name);
		System.out.println("My name : " + this.name);
	}
	

	public static void main(String[] args) {

		Son s1 = new Son();
		s1.display();
		
	}

}
