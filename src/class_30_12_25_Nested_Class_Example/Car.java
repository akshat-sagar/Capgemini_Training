package class_30_12_25_Nested_Class_Example;

public class Car {
	
	static class Engine{
		static void start() {
			System.out.println("Engine Started");
		}
		
		void stop() {
			System.out.println("Engine Stopped");
		}
	}

}
