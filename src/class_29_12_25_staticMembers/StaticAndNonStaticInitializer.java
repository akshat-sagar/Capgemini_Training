package class_29_12_25_staticMembers;

class A {
	static {
		System.out.println("I am from Static 1");
	}
	static {
		System.out.println("I m from Static 2");
	}
	{
		System.out.println("I am from Non Static Block");
	}
}

public class StaticAndNonStaticInitializer {

	public static void main(String[] args) {
		A a = new A();
		A a1 = new A();
		// Non static block executes n no of time depending upon number of objects we
		// created.

	}

}
