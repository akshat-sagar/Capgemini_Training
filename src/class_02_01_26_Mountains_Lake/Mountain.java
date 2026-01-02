package class_02_01_26_Mountains_Lake;

public class Mountain {
	private String mName;

	public String getMountainName() {
		return mName;
	}

	public void setMountainName(String mountainName) {
		this.mName = mountainName;
	}
	
	// constructors
	
	Mountain(){
		
	}
	Mountain(String mName){
		this.mName = mName;
	}
	
	// has - a relationship
	
	public Lake l = new Lake("Dall Lake");
	
	

}
