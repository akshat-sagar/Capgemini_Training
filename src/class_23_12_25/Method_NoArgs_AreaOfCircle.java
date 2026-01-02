package class_23_12_25;
import java.util.*;

public class Method_NoArgs_AreaOfCircle {
	
	//circle, triangle, square
	public static void AreaOfCircle() {
		//piRsquare
		Scanner sc = new Scanner(System.in);
		double pie = 3.1428;
		System.out.print("Enter the Radius of Circle to find area -->  ");
		int r =sc.nextInt();
		
		double area = pie * r * r;
		
		System.out.println("Area of Circle is -->  "+ area);
	}
	
	public static void AreaOfSquare() {
		//l*4 baar
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Side of Square to find area -->  ");
		int side = sc.nextInt();
		double area = side * side;
		System.out.println("Area of Square --> " + area);
	}
	
	public static void AreaOfTriangle() {
		Scanner s = new Scanner(System.in);

		
		System.out.println("Enter the sides of Triangle to find area -->  ");
		System.out.print("Side 1 -->  ");
		int side1 = s.nextInt();
		System.out.print("Side 2 -->  ");
		int side2 = s.nextInt();
		System.out.print("Side 3 -->  ");
		int side3 = s.nextInt();
		
		double semi = (side1 + side2 + side3)/2;
		double area = Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));
		System.out.printf("Area of Triangle is :  %.2f\n", area);
		
	}

	public static void main(String[] args) {
		//AreaOfCircle();
		//AreaOfSquare();
		AreaOfTriangle();
		

	}

}
