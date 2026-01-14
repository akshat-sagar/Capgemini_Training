package class_06_01_26_Heirarchial_inheritance;

public class Circle extends Shape{
	
	int r;
	Circle(int r){
		this.r = r;
		System.out.println("Radius = " + r);
		
		area = (int) (3.14 * r * r);
		
		System.out.println("The area of this cirlce is -> " + area);

	}
	

}
