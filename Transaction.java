package dit948;

public class Transaction {


	/**
	 * This class implements a transaction performed by the bank users
	 */

	// constructor with parameters

	private String type; //to record the type of transaction
	private Account account; // an Account used by the transaction

	public Transaction(Account account, String type) {
		this.type = type;
		this.account = account;
	}

	/**
	 * Returns the Account object
	 * @return account
	 */
	public Account getAccount() {
		// code here
		return account;
	}

	/**
	 * String representation of a transaction
	 */
	public String toString() {
		return type;
	}

}
