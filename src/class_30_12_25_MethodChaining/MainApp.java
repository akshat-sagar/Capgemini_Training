package class_30_12_25_MethodChaining;

public class MainApp {

	public static void main(String[] args) {

		Demo d1 = new Demo();
		Demo obj = d1.m1().m2();
		System.out.println(obj);
	}

}
