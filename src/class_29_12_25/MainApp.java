package class_29_12_25;

public class MainApp {

	public static void main(String[] args) {
		
		
		// System.out.println(new book());
		// reference variable 
		
		// book d = new book();
		// System.out.println(d);
		
		book b1 = new book("JAVA", 2000);
		book b2 = new book("Python", 1000);
		book b3 = new book("SQL", 5000);
		
//		b1.title = "Java";
//		b1.price = 2000;
//		b2.title = "Python";
//		b2.price = 1000;
//		b3.title = "SQL";
//		b3.price = 3000;
		
		
		// access 
		System.out.println((b1.title));
		System.out.println(b1.price);

		System.out.println(b2.title);
		System.out.println(b2.price);

		System.out.println(b3.title);
		System.out.println(b3.price);

	}

}
