package class_07_01_26_MethodOverriding_Shapes;

public class Triangle extends Shape {

	
	int l;
	int  b;
	void area() {
		area = (int) (0.5* l * b);

		System.out.println("Area of Triangle is : " + area);
	}
}
