package class_06_01_26_Heirarchial_inheritance;

public class Trianlge extends Shape {
	
	int b;
	int h;
	
	Trianlge(int b, int h){
		this.b = b;
		this.h = h;
		
		System.out.println("Height is -> " + h);
		System.out.println("Base is -> " + b);
		
		area = (int)(0.5 * b * h);
		System.out.println("The area of this triangle is -> " + area);

	}

}
