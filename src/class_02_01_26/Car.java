package class_02_01_26;

public class Car {
	private String modelName;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	// constructors
	Car(){
		
	}
	Car(String modelName){
		this.modelName = modelName;
	}

	// Achieve has - a relationship
	private Engine e = new Engine(1000);
	
	public Engine getEngine() {
		return e;
	}
	
	private Tyre[] tyres = 
		{
			new Tyre("MRF"),
			new Tyre("MRF"),
			new Tyre("MRF"),
			new Tyre("MRF")
			};

	public Tyre[] getTyres() {
		return tyres;
	}

	public void setTyres(Tyre[] tyres) {
		this.tyres = tyres;
	}
	
	
}
