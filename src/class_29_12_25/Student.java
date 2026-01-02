package class_29_12_25;

public class Student {
	String pan;
	String aadhar;
	String voterID;
	
	// Constructors
	
	Student(){
		
	}
	// only pan card
		Student(String pan){
			this();
			this.pan = pan;
		}
		
	// only pan and aadhar
	Student(String pan, String aadhar){
		this(pan);
		//this.pan = pan;
		this.aadhar = aadhar;
	}
	
	
	// all docs present
	Student(String pan, String aadhar, String voterID){
		this(pan, aadhar);
//		this.pan = pan;
//		this.aadhar = aadhar;
		this.voterID = voterID;
		System.out.println(pan + aadhar + voterID);
		
	}
	
	

}
