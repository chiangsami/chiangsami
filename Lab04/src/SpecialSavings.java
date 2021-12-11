public class SpecialSavings extends SavingsAccount {

	private String bankName;

	public void SpecialSavings() { // default

	}

	public SpecialSavings(String name) {// overloaded

		bankName = name;

	}

	String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	private void modifyInterestRate() { // override interest rate in initial parent class

		if (getSavingsBalance() > 10000) {

			annualInterestRate = .10;

			System.out.println("Balance exceeds 10000! Your annual interest rate has gone up to 10%");

		}

		else {

			annualInterestRate = .04;

			System.out.println("Annual interest rate is now 4%");

		}
	}

	private void depositMoney(double deposit) {

		setSavingsBalance(deposit + getSavingsBalance());
		// Setting value of savings account to current balance plus money deposited.

	}

	private void withdrawlMoney(double withdrawl) {

		setSavingsBalance(getSavingsBalance() - withdrawl);
	}

	public void printWithdrawl(double withdrawl1) {

		withdrawlMoney(withdrawl1);
		modifyInterestRate();
		System.out.printf("Total for withdrawl for %s%s%.2f\n", bankName, ": ", getSavingsBalance());

	}

	public void printDeposit(double deposit1) {

		depositMoney(deposit1);
		modifyInterestRate();
		System.out.printf("Transaction total for %2s%s%.2f\n", bankName, " : ", getSavingsBalance());
	}

	public void print() { // overriding

		calculateMonthlyInterest();
		System.out.printf("New Balance: %s%s%.2f \n ", bankName, " : ", getSavingsBalance());

	}

}
