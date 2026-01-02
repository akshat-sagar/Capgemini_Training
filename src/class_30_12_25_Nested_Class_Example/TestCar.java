package class_30_12_25_Nested_Class_Example;

import class_30_12_25_Nested_Class_Example.Car.Engine;

public class TestCar {

	public static void main(String[] args) {
		Car.Engine.start();

		Car.Engine e = new Car.Engine();
		e.stop();

	}

}
