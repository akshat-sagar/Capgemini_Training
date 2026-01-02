package class_02_01_26_Lazy_Initiation;

public class MainApp {

	public static void main(String[] args) {
		Car c = new Car();
		c.addTyer(new Tyre("MRF"));
		c.addTyer(new Tyre("MRF"));
		c.addTyer(new Tyre("MRF"));
		c.addTyer(new Tyre("MRF"));
		
		for(int i = 0; i < c.tyres.length; i++) {
			System.out.println(c.tyres[i].getTyreBrand());
		}

	}

}
