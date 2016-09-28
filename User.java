package dit948;

import static dit948.SimpleIO.println;
import static dit948.SimpleIO.readString;

public class User {
	/**
	* This class represents the data for a user of the bank
	*/
	// private instance variables
	//9
	//DIT948-2016, Assignment 2
	// name: a String representing the username
	// password: a String representing the password
	// account: an Account representing the account
	// Constructor with parameters
	// Create a new account and record the "transaction"
	
	private String name; //a String representing the username
	private String password; //a String representing the password
	private int accountId; // an Account representing the account
	
	public User(){
		this.name = null;
		this.password = null;
		this.accountId = 0;
	}
	
	public User(String name, String password, int accountId) {
		this.name = name;
		this.password = password;
		this.accountId = accountId;
	}
	
	/**
	* Returns the account id
	* @return id
	*/
	public int getId() {
		return this.accountId;
	}
	
	public void setAccountId(int id){
		this.accountId = id;
	}
	
	/**
	* Returns the username
	* @return name
	*/
	public String getUsername() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	/**
	* Returns the password
	* @return password
	*/
	public String getPassword() {
		return this.password;
	}	
	
	public void setPassword(String password){
		this.password = password;
	}
	/**
	* Returns the user Account
	* @return account
	*/
	
	
	public Account getAccount() {
	   
	
	}

	
}
