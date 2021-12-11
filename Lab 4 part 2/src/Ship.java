public class Ship {
	
	
	private String floating; 
	private int length; 
	private int width; 
	private String name; 
	private int height; 
	private String origin; 
	private String departureDate; 
	private String arrivaldate; 
	private String departingport; 
	private String arrivalport; 
	private String owner;  
	private int capacity; 
	 
	public Ship() { // default constructor 
		
	 length = 0; 
	 width= 0; 
	 name = " "; 
	 height = 0; 
	 origin = " "; 
	 departureDate = " "; 
	 arrivaldate = " "; 
	 departingport = " "; 
	 arrivalport = " "; 
	 owner =" "; 
	 
	 
		
	}
	
	public Ship(String floating, int cap, int len, int width, String name, int height, String origin, String departure, String arrival, String departingp, String arrivalp, String owner) { // overloaded constructor 
		
		this.setFloating(floating);
		this.setCapacity(cap);
		this.setLength(len);
		this.setWidth(width); 
		this.setName(name); 
		this.setHeight(height);
		this.setOrigin(origin); 
		this.setDepartureDate(departure); 
		this.setArrivaldate(arrival); 
		this.setDepartingport(departingp); 
		this.setArrivalport(arrivalp);
		this.setOwner(owner); 
		
		
	}
	
	
	
	public String getFloating() {
		return floating;
	}

	public void setFloating(String floating) {
		this.floating = floating;
	}

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivaldate() {
		return arrivaldate;
	}
	public void setArrivaldate(String arrivaldate) {
		this.arrivaldate = arrivaldate;
	}
	public String getDepartingport() {
		return departingport;
	}
	public void setDepartingport(String departingport) {
		this.departingport = departingport;
	}
	public String getArrivalport() {
		return arrivalport;
	}
	public void setArrivalport(String arrivalport) {
		this.arrivalport = arrivalport;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void print () { 
		
		System.out.println("-=- Ship Details -=- ");
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
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ");
	}
	
	
}
