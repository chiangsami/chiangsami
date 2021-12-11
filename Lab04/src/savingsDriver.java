import java.util.Scanner;

public class savingsDriver {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();

		System.out.println("Enter Initial Balance for bank account 1: ");
		saver1.setSavingsBalance(in.nextDouble());
		System.out.println("Enter Initial Balance for bank account 2: ");
		saver2.setSavingsBalance(in.nextDouble());
		System.out.println("Enter Annual Interest Rate: ");
		saver2.setAnnualInterestRate(in.nextDouble());

		saver1.print();
		saver2.print();

		System.out.println("What is the new Annual Interest Rate? ");
		SavingsAccount.modifyInterestRate(in.nextDouble());

		saver1.print(); 
		saver2.print();

	}

}

/* 
 Enter Initial Balance for bank account 1: 
100
Enter Initial Balance for bank account 2: 
200
Enter Annual Interest Rate: 
5
New Balance: 100.42 
New Balance: 200.83 
What is the new Annual Interest Rate? 
2
New Balance: 117.15 
New Balance: 234.31 


Enter Initial Balance for bank account 1: 
500
Enter Initial Balance for bank account 2: 
10
Enter Annual Interest Rate: 
9
New Balance: 503.75 
New Balance: 10.08 
What is the new Annual Interest Rate? 
2
New Balance: 587.71 
New Balance: 11.75 

Enter Initial Balance for bank account 1: 
-11
Enter Initial Balance for bank account 2: 
20
Enter Annual Interest Rate: 
100
New Balance: -11.92 
New Balance: 21.67 
What is the new Annual Interest Rate? 
3
New Balance: -14.90 
New Balance: 27.08 



 */
