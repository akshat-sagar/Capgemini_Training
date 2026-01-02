package class_30_12_25_Encapsulation;

public class Product {

	// java bean class
	// which have setter and getter
	private int price;
	
	// setter
	// in set we should pass the price to set
	public void setPrice(int price) {
		// validation
		if(price > 0 ) {
			this.price = price;
		}
	}
	// getter
	// we need to access so no argument method
		public int getPrice() {
			return price;
		}
	
	
}
