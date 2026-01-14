package class_06_01_26_Heirarchial_inheritance;

public class Square extends Shape{

	int side;
	
	Square(int side){
		this.side = side;
		
		System.out.println("The side of the square is -> " + side);
		
		
		area = (int) (side * side);
		
		System.out.println("The area of this square is -> " + area);
	}
}
