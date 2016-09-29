package dit948;

public class Account {

	/**
	 * Thank you!
	* This class implements a user account, represented by a user id
	* (unique for each account) and an amount (or balance)
	*/

	// private instance variables
		// id: an integer representing the account id
		// amount: the account balance
		// constructor with parameters
	
	private int accoutid;
	private double amount;
	
	public Account(){
	this.accountId = 0;
	this.amount = 0;
	}
	
	
	public Account(int amount, int id) {
	this.accountId = id;
	this.amount = amount;
	}
	
	
	
	/**
	* Withdraw a given amount of money from the account and record the
	* transaction
	* @param deductAmount the amount to withdraw
	* @return true if the withdraw succeeds, false otherwise
	*/
	public boolean withdraw(int deductAmount){
		return true;

	}
	 
	/**
	* Deposit a given amount to the account and
	* record the transaction
	* @param addAmount amount to be deposited
	* @return true
	*/
	 
	public boolean deposit(int addAmount){
		//code here
		return true;
		
	}
	/**
	* Transfer money from this account to user B, and
	* record the transaction
	* @param B user to transfer money to
	* @param amountToTransfer the amount to transfer
	* @return true if the transfer is possible, false otherwise
	*/
	public boolean transferMoney(User B,int amountToTransfer){
	// code here
		return true;
	}
	/**
	* Returns the balance and records the transaction
	* @return amount
	*/
	public int getAmount() {
	// here code
		return amount;
	}
	/**
	* Returns the account id
	* @return id
	*/
	public int getId(){
	return accountId;
	}
	
}
