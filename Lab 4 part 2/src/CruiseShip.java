public class CruiseShip extends Ship{
	
	private double ticketprice; 
	private int numberofRooms; 
	private String buffetMenu; 
	private String services[];  
	private String cruiseType; 
	

	
	public  CruiseShip() { //overloaded constructor 
		ticketprice =0.0; 
		numberofRooms= 0; 
		buffetMenu = " "; 
		cruiseType = " ";
		
	}
	
	public CruiseShip(String floating, int cap, int len, int width, String name, int height, String origin, String departure, String arrival, String departingp, String arrivalp, String owner, double ticketprice, int room, String CruiseT, String Bu) { //empty constructor 
		super(floating, cap, len, width, name, height, origin, departure, arrival, departingp, arrivalp, owner); 
		this.setTicketprice(ticketprice); 
		this.setNumberofRooms(room); 
		this.setBuffetMenu(Bu);
		this.setCruiseType(CruiseT);
		
	} 
	
	
	public double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}

	public int getNumberofRooms() {
		return numberofRooms;
	}

	public void setNumberofRooms(int numberofRooms) {
		this.numberofRooms = numberofRooms;
	}

	public String getBuffetMenu() {
		return buffetMenu;
	}

	public void setBuffetMenu(String buffetMenu) {
		this.buffetMenu = buffetMenu;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

	public String getCruiseType() {
		return cruiseType;
	}

	public void setCruiseType(String cruiseType) {
		this.cruiseType = cruiseType;
	}
	
	public void print() { 
		System.out.println(" -=- Cruise details -=- ");
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
		System.out.printf("Ticket Price: %f \n", this.getTicketprice());
		System.out.printf("Number of Rooms: %d \n", this.getNumberofRooms());
		System.out.printf("Buffet Menu: %s \n", this.getBuffetMenu()); 
		System.out.printf("Cruise Type: %s",this.getCruiseType());
		
		
	}
	

}
