package class_09_01_26_abstraction_Self;

public class MainApp {

	public static void main(String[] args) {

		Phone p1 = new SmartPhone();
		Phone p2 = new FeaturePhone();
		
		p1.display();
		p2.display();
		p1.ring();
		

	}

}
