package class_30_12_25_MultipleObjectsCreation;

public class Box {
	double lenght;
	// no args
	Box(){
		
	}
	Box(double length){
		this.lenght = lenght;
	}


// helper method helping us to create the object
// helper method
	public static Box createBox() {
		return new Box();
	}
	//overloading
	public static Box createBox(double lenght) {
		return new Box(lenght);
	}
}
