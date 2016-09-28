package dit948;

public class Transaction {

	
	
	
	/**
	* This class implements a transaction performed by the bank users
	*/
	
	// private instance variables
	// type: a String to record the type of transaction
	// account: an Account used by the transaction
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
	}
	/**
	* String representation of a transaction
	*/
	public String toString() {
	// code here
	}
	}
}
