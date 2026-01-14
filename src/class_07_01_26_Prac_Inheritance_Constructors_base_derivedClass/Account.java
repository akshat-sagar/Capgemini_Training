package class_07_01_26_Prac_Inheritance_Constructors_base_derivedClass;

public class Account {
	int accNum;
	
	Account(int accNum){
		this.accNum = accNum;
		System.out.println("The account number initilized : " + accNum);
	}

}
