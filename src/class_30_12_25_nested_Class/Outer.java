package class_30_12_25_nested_Class;

public class Outer {
	static class Inner{
		static void display() {
			System.out.println("Static method");
		}
		
		void test() {
			System.out.println("Non-Static method");
		}
	}

}
