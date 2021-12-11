public class ShipDriver {
	
	public static void main(String[] args) {
		
		 Ship[] shipArray = new Ship[3]; 
		
		
		Ship Barbie = new Ship("Floating", 100, 45 , 60, "Pink Malibu", 30, "Paris" , "June 20th 2021" , 
		"September 22nd 2021" , "SF" , "FP" , "Barbie"); 
		CargoShip PrincessAnnelise = new CargoShip("Floating", 400, 200, 3000, "Serafina's Cargo", 580, "Princess Charm School", "April 30th, 1800",
				"July 18th 1800", "BI", "EW", " Princess Annelise", "Designer Dresses", "Container", 5, "Glitter Guns", 4); 
		CruiseShip PrincessGenevive = new CruiseShip( "Floating", 500000, 20000, 1000, "Princess Cruise", 20000, "Floravia", "May 16th, 2002", 
				"June 16th, 2002", "SL", "B12", "Princess Genevive", 300.00 , 500, "Luxury Cruise", "10 course meals fit for a princess dream"); 
	 for(Ship ship : shipArray) {  
		
		Barbie.print();		
		PrincessAnnelise.print(); 
		PrincessGenevive.print(); 
		
		}	

	} 
} 
	
