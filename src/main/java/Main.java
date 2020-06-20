public class Main {

	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount(5.78); // Has a balance
		// bankAccount1.balance = -1000.79; // Illegal now because it's private.
		System.out.println(bankAccount1.getBalance());

		new Apple().seeds = 7; // Possible because it's public
		new Apple().stems = 9; // Possible because this public class is in the same class
		new Apple().color = "red";
	}

}