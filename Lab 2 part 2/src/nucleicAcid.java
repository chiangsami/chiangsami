import java.util.Scanner; 

public class nucleicAcid  {

	private String chemicalName;
	private String chemicalFormula;
	private double molarMass;
	private double Density;
	
	public String getChemicalName() { 
		return chemicalName; 
	}
		
	public void setChemicalName(String name) { 
		this.chemicalName=name; 
		}
		
	public String getchemicalFormula() { 
		return chemicalFormula; 
		
		
	}
	
	public void setchemicalFormula (String formula) { 
		this.chemicalFormula = formula;
	}
	
	public double getmolarMass() { 
		return molarMass; 
	}
	
	public void setmolarMass (double mass) { 
		this.molarMass = mass; 
		
	}
	
	public double getDensity() {
		return Density; 
	}
	
	public void setDensity (double density) {
		
		this.Density = density; 
		

			
		
	}
	
	public nucleicAcid() { 
		
		this.chemicalName = " "; 
		this.chemicalFormula = " "; 
		this.molarMass = 0.0; 
		this.Density = 0.0; 
	} 
		
	public nucleicAcid(String CN, String CF, double molMass, double density) { 
	
	this.chemicalName = CN; 
	this.chemicalFormula=CF; 
	this.molarMass = molMass; 
	this.Density = density; 
	
	
	} 
		
		public void print () { 
			
			System.out.printf ( " ");
		}

} 
	