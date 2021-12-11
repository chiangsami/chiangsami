import java.util.Scanner;

public class SpecialSavingsDriver {
	
		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter first bank name:");
			SpecialSavings saver1 = new SpecialSavings(in.nextLine() );
			System.out.println("Enter second bank name:");
			String foo = in.nextLine(); 
			SpecialSavings saver2 = new SpecialSavings(foo);
			
			
			
			
			System.out.printf("Enter initial amount for %s%s", saver1.getBankName(), ": " );
			saver1.setSavingsBalance(in.nextDouble());
			System.out.printf("Enter inital amount for %s%s",saver2.getBankName(), ": ");
			saver2.setSavingsBalance(in.nextDouble()); 
			System.out.println("Enter Annual Interest Rate: ");
			saver2.setAnnualInterestRate(in.nextInt());
			
			 
			
			System.out.println("Would you like to withdrawl or deposit? Press 1 for withdrawl and 2 for deposit.");
			int choice = in.nextInt();
			
			
			if (choice == 1)
			{ 
				System.out.printf("How much do you want to withdrawl from %s%s", saver1.getBankName(), "? ");
				double WM1 = in.nextDouble(); 
				System.out.printf("How much do you want to withdrawl from %s%s", saver2.getBankName(), "? ");
				double WM2 = in.nextDouble();  
				
				 
				saver1.printWithdrawl(WM1); 
				saver2.printWithdrawl(WM2); 
				saver1.print(); 
				saver2.print(); 
			
			}
			
			else if (choice == 2) { 
				System.out.printf("How much do you want to deposit for %s%s",saver1.getBankName() ,"? ");
				double DM1 = in.nextDouble();
				System.out.printf("How much do you want to deposit for %s%s",saver2.getBankName(),"? ");
				double DM2 = in.nextDouble();
				saver1.printDeposit(DM1);
				saver2.printDeposit(DM2);
				saver1.print(); 
				saver2.print(); 
				
				
				
			}
			
	

		}
		
	
} 

/* 
 Enter first bank name:
Salmon's Bank 
Enter second bank name:
Chowder's Bank
Enter initial amount for Salmon's Bank : 100000
Enter inital amount for Chowder's Bank: 40000
Enter Annual Interest Rate: 
6
Would you like to withdrawl or deposit? Press 1 for withdrawl and 2 for deposit.
1
How much do you want to withdrawl from Salmon's Bank ? 100
How much do you want to withdrawl from Chowder's Bank? 20000000
Balance exceeds 10000! Your annual interest rate has gone up to 10%
Total for withdrawl for Salmon's Bank : 99900.00
Annual interest rate is now 4%
Total for withdrawl for Chowder's Bank: -19960000.00
New Balance: Salmon's Bank  : 100233.00 
 New Balance: Chowder's Bank : -20026533.33 
 
 Enter first bank name:
Belle's Bank 
Enter second bank name:
Ariel's Bank 
Enter initial amount for Belle's Bank : 20
Enter inital amount for Ariel's Bank : 50
Enter Annual Interest Rate: 
100
Would you like to withdrawl or deposit? Press 1 for withdrawl and 2 for deposit.
2
How much do you want to deposit for Belle's Bank ? 100000
How much do you want to deposit for Ariel's Bank ? 30
Balance exceeds 10000! Your annual interest rate has gone up to 10%
Transaction total for Belle's Bank  : 100020.00
Annual interest rate is now 4%
Transaction total for Ariel's Bank  : 80.00
New Balance: Belle's Bank  : 100353.40 
 New Balance: Ariel's Bank  : 80.27 
 
 Enter first bank name:
Barbie Bank 
Enter second bank name:
Midge Bank 
Enter initial amount for Barbie Bank : 1000
Enter inital amount for Midge Bank : 200
Enter Annual Interest Rate: 
8
Would you like to withdrawl or deposit? Press 1 for withdrawl and 2 for deposit.
2
How much do you want to deposit for Barbie Bank ? 100
How much do you want to deposit for Midge Bank ? 3000000000
Annual interest rate is now 4%
Transaction total for Barbie Bank  : 1100.00
Balance exceeds 10000! Your annual interest rate has gone up to 10%
Transaction total for Midge Bank  : 3000000200.00
New Balance: Barbie Bank  : 1109.17 
 New Balance: Midge Bank  : 3025000201.67 
 
 



*/
