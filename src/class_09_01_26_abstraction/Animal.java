package class_09_01_26_abstraction;

public abstract class Animal {
	public void walk() {
		System.out.println("walks on 4 leg");
	}
	public abstract void sound();
		// even if we complete, this won't be visible 
		// so we can do this abstract
		// class should be abstract to make incomplete class

}
