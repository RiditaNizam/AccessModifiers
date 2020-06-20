class BankAccount {
	private double balance; // Don't want it to be negative

	public double getBalance() {
		return balance;
	}

	public BankAccount(double givenBalance) {
		if (givenBalance < 0) {
			balance = 0;
		} else {
			balance = givenBalance;
		}
	}

	public void deposit(double givenAmount) {
		if (givenAmount > 0) {
			balance += givenAmount;
		}
	}

	public void withdraw(double givenAmount) {
		if (givenAmount > 0 && givenAmount <= balance) {
			balance -= givenAmount;
		}
	}

	public static void printBalance(BankAccount givenBalance) {
		System.out.println(givenBalance.balance); // Will print what's passed into Main class main method
	}
}