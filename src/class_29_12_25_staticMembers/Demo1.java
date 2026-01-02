package class_29_12_25_staticMembers;

 class staticVar {
	static int a;
	public static void D1() {
		System.out.println("Static Value is D1;");
	}
 }
public class Demo1{
	public static void main(String[] args) {

			staticVar.D1();
			staticVar.a = 10;
			System.out.println("Static new value is: "+ staticVar.a);

	}
}