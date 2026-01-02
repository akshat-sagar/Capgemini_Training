package class_20_12_25;
import java.util.*;
public class Store_Stock_Quantity {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		
		//stock less than 10 || fast moving item -- but not discontinued 
		// whether to reorder to increase stock quantity
		
		System.out.print("Enter the stock quantity of your product:  - ");
		int stock_quantity = s.nextInt();
		
		System.out.print("Is product fast moving item? (true / false):  -  ");
		boolean fast = s.nextBoolean();
		
		System.out.print("Is item discontinued by manufacturer? (true / false):  -  ");
		boolean continued = s.nextBoolean();
		
		boolean order = (stock_quantity < 10 || fast) && !continued ? true : false;
		
		System.out.println(order ? "Order this stock in this amount: ->  "+ (stock_quantity += 10) : "No need to order");
		

	}

}
