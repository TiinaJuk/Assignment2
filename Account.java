package dit948;

import static dit948.Bank.id;

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


	public Account(double amount) {
		accountId = id;
		this.amount = amount;
	}



	/**
	 * Withdraw a given amount of money from the account and record the
	 * transaction
	 * @param deductAmount the amount to withdraw
	 * @return true if the withdraw succeeds, false otherwise
	 */
	
	//how to reach the account of the logged in user to be able to compare that to deduct ammount?
	//^is a problem if the withraw metod here has to return false if the deductamount is to big
	//is it possible to identify an object by the value of one of its varibles such as account id?
	//if not then how would the account id be used to identify the object? userObj could be found by name/ place in userArray
	public boolean withdraw(double deductAmount){
		if(deductAmount<amount){
		amount = amount - deductAmount;	
		return true;}
		
		else {
			
		}
		return false;
	}

	/**
	 * Deposit a given amount to the account and
	 * record the transaction
	 * @param addAmount amount to be deposited
	 * @return true
	 */

	public boolean deposit(double addAmount){
		amount = amount + addAmount;
		return true;
	}
	/**
	 * Transfer money from this account to user B, and
	 * record the transaction
	 * @param B user to transfer money to
	 * @param amountToTransfer the amount to transfer
	 * @return true if the transfer is possible, false otherwise
	 */
	public static boolean transferMoney(String name,double amountToTransfer){
		User [] tmp = new User[1];
		tmp [0] = Bank.getUserArray(name);
		
		if(amountToTransfer < amount){
		tmp[0].amount = (tmp[0].amount + amountToTransfer);
		amount = amount - amountToTransfer;
		return true;
		}
		
		else{
			
		}
		return false;		
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
