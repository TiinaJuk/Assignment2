package dit948;

import static dit948.Bank.id;
import static dit948.SimpleIO.println;
import static dit948.SimpleIO.readDouble;
import static dit948.SimpleIO.readString;
import static dit948.Transaction.tranId;

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
	public static boolean transferMoney(Account currentAccount){
		println("Enter the username of the recepient: ");
    	String receptantUsername = readString();
    	
    	println("Please enter an amount: ");
    	double transferAmount = readDouble();

		User receptanterObj = Bank.getUserArray(receptantUsername);
		
		if(receptanterObj == null){
			println("User doesn't exist.");
			return false;
		}
		
		// deposit to reseptanter's account 
		Account receptanterAccount = receptanterObj.getAccount();
		receptanterAccount.deposit(transferAmount);
		
		//withdraw from Useraccount
		currentAccount.withdraw(transferAmount);
		println("An amount of: " +transferAmount+ "has been transfered");

		Bank.transArray[tranId] = new Transaction(currentAccount , "A transfer of:" +transferAmount+ "to user" + receptantUsername+"\n"  );

		tranId++;

		Bank.transArray[tranId] = new Transaction(receptanterAccount , "A deposite by transfer of:" +transferAmount + "\n"  );

		tranId++;

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
