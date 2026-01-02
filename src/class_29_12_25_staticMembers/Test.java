package class_29_12_25_staticMembers;

public class Test {
	

	public static void main(String[] args) {
		// m1();  only by method signature we cant' do this
		
		// so we can use call by reference
		
		Demo.m1();
		System.out.println(Demo.a);

	}

}
