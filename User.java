package dit948;

import static dit948.Bank.id;

public class User {
	/**
	 * This class represents the data for a user of the bank
	 */

	// Create a new account and record the "transaction"

	private String name; //a String representing the username
	private String password; //a String representing the password
	Account account; // an Account representing the account


	public User(String name, String password, int accountid) {
		this.name = name;
		this.password = password;
		this.account = new Account(0,id);
	}


	/**
	 * Returns the account id
	 * @return id
	 */

	public int getId() {
		return id;
	}

	/**
	 * Returns the username
	 * @return name
	 */
	public String getUsername() {

		return this.name;
	}


	/**
	 * Returns the password
	 * @return password
	 */
	public String getPassword() {

		return this.password;
	}


	/**
	 * Returns the user Account
	 * @return account
	 */
	public Account getAccount() {
		return this.account;
	}



}
