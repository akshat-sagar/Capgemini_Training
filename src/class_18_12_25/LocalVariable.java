package class_18_12_25;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 19;
		System.out.println(a);
		int b = 26;
		System.out.println(b);
		
		int result = add(a,b);
		System.out.println(result);
		
		
	}
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
		
	}

	

}
