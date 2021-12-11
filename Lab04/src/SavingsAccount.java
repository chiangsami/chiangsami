public class SavingsAccount {
	

	static double annualInterestRate; 
	
	private double savingsBalance; 
	
	SavingsAccount(){  // empty constructor
		
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = (annualInterestRate / 100);
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance1) {
		savingsBalance = savingsBalance1;
	}

	public void calculateMonthlyInterest() { // adding monthly interest to saving
		
		double monthlyInterest= (annualInterestRate/12); 
		
		savingsBalance *= (1 + monthlyInterest); // savingsBalance = savingsBalance * 
		// adding the money accumulated from the monthly interest to the already existing balance  
	}
	
	
	public static void modifyInterestRate(double IR) { 
		
		annualInterestRate = IR; // changing the interest rate 
		 
	
		
	}
	
	public void print() { 
		
		calculateMonthlyInterest(); 
		System.out.printf("New Balance: %.2f \n", savingsBalance); 
		
		
	
		// prints out results 
	}

}