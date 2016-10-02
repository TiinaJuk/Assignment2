package dit948;


public class Account {

	/**
	 * This class implements a user account, represented by a user id
	 * (unique for each account) and an amount (or balance)
	 */

	// private instance variables
	// id: an integer representing the account id
	// amount: the account balance
	// constructor with parameters

	private int accountId;
	private double amount;


	public Account(double amount, int id) {
		accountId = id;
		this.amount = amount;
	}



	/**
	 * Withdraw a given amount of money from the account and record the
	 * transaction
	 * @param deductAmount the amount to withdraw
	 * @return true if the withdraw succeeds, false otherwise
	 */
	public boolean withdraw(double deductAmount){
		amount = amount - deductAmount;
		//code here
		return true;
	}

	/**
	 * Deposit a given amount to the account and
	 * record the transaction
	 * @param addAmount amount to be deposited
	 * @return true
	 */

	public boolean deposit(double addAmount){
		amount = amount + addAmount;
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


	public void setAmount(double amount) {

		this.amount = amount;
	}


	/**
	 * Returns the account id
	 * @return id
	 */
	public int getId(){

		return this.accountId;
	}

	public void setId(int currentId){

		this.accountId = currentId;
	}





	/**
	 * Returns the balance and records the transaction
	 * @return amount
	 */
	// Getter for ammount.
	public double getAmount() {
		return amount;
	}


}
