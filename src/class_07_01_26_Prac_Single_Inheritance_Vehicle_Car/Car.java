package class_07_01_26_Prac_Single_Inheritance_Vehicle_Car;

public class Car extends Vehicle{
	
	String brandName;
	
	void show() {
		System.out.println("Brand name : " + brandName);
		
		System.out.println("Speed : " + speed);

		System.out.println("Fuel Type : " + fuelType);

	}

}
