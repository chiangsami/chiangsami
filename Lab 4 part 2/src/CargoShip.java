public class CargoShip extends Ship {
	
	private String CargoType; 
	private String loadingMethod; 
	private int numberofCranes; 
	private String contraband; 
	private int cargoValue; 

	
	 public  CargoShip() { //default constructor 
		CargoType= " "; 
		loadingMethod= " ";
		numberofCranes = 1; 
		contraband = " "; 
		cargoValue = 0; 
		
	}  
	
	public  CargoShip(String floating, int cap, int len, int width, String name, int height, String origin, String departure, String arrival, String departingp, String arrivalp, String owner , String CargoType, String load, int numberofCranes, String cont, int value) {  // overloaded constructor 
		super(floating, cap, len, width, name, height, origin, departure, arrival, departingp, arrivalp, owner); 
		this.setCargoType(CargoType);
		this.setLoadingMethod(load); 
		this.setNumberofCranes(numberofCranes); 
		this.setContraband(cont); 
		this.setCargoValue(value); 
		
		
		
	}
	

	
	public String getCargoType() {
		return CargoType;
	}

	public void setCargoType(String cargoType) {
		CargoType = cargoType;
	}

	public String getLoadingMethod() {
		return loadingMethod;
	}

	public void setLoadingMethod(String loadingMethod) {
		this.loadingMethod = loadingMethod;
	}

	public int getNumberofCranes() {
		return numberofCranes;
	}

	public void setNumberofCranes(int numberofCranes) {
		this.numberofCranes = numberofCranes;
	}

	public String getContraband() {
		return contraband;
	}

	public void setContraband(String contraband) {
		this.contraband = contraband;
	}

	public int getCargoValue() {
		return cargoValue;
	}

	public void setCargoValue(int cargoValue) {
		this.cargoValue = cargoValue;
	}
	
	
	public void print() { // override 
		System.out.println("-=- Cargo Ship details -=- ");
		System.out.printf("Floating or not: %s \n", this.getFloating());
		System.out.printf("Name: %s \n", this.getName());
		System.out.printf("Owner: %s \n",this.getOwner());
		System.out.printf("Capacity: %d \n",this.getCapacity());
		System.out.printf("Length: %d%s",this.getLength(),"ft \n");
		System.out.printf("Height: %d%s", this.getHeight(),"ft \n");
		System.out.printf("Width: %d%s",this.getWidth(),"ft\n");
		System.out.printf("Arrival Date: %s \n", this.getArrivaldate());
		System.out.printf("Departure Date: %s \n",this.getDepartureDate());
		System.out.printf("Origin: %s \n",this.getOrigin()); 
		System.out.printf("Arrival Port: %s \n",this.getArrivalport());
		System.out.printf("Departing Port: %s \n",this.getDepartingport());
		System.out.printf("Cargo Type: %s \n", this.getCargoType());
		System.out.printf("Loading Method: %s \n", this.getLoadingMethod()); 
		System.out.printf("Number of Cranes: %d \n", this.getNumberofCranes()); 
		System.out.printf("Contraband: %s \n", this.getContraband()); 
		System.out.printf("Number of Cargo: %d \n", this.getCargoValue()); 
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- ");
		
	}

}
