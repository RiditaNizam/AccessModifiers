public class SpecialAccount extends BankAccount {

	// Balance of BankAccount can't be accessed because PRIVATE

	public SpecialAccount(double givenBalance) {
		super(givenBalance);
		// balance = 9; Won't work
		System.out.println(getBalance()); // Inherits, returns private variable
	}

}
