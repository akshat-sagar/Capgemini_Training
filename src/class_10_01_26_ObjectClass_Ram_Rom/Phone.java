package class_10_01_26_ObjectClass_Ram_Rom;

public class Phone {
	int ram;
	int rom;
	
	Phone(int ram, int rom){
		this.ram = ram;
		this.rom = rom;
	}
	
	public String toStrin() {
        return "Phone-- [ Ram: " + ram + " Rom: " + rom + " ]";
	}

}
