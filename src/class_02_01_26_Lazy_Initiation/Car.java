package class_02_01_26_Lazy_Initiation;

public class Car {
	Tyre[] tyres = new Tyre[4];
	int i = 0;
	
	//helper method
	
	void addTyer(Tyre tyre) {
		tyres[i] = tyre;
		i++;
	}

}
