package class_29_12_25;

public class Box {
	
	// non-static variables
	double length;
	double breadth;
	
	// constructor
	Box(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	// non-static method
	public double getArea() {
		return length * breadth;
	}

	public static void main(String[] args) {
		Box b1 = new Box(3,4);
		System.out.println(b1.getArea());
		
	}

}
