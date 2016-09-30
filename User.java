package dit948;

import static dit948.SimpleIO.println;
import static dit948.SimpleIO.readString;

public class User {
	/**
	* This class represents the data for a user of the bank
	*/

	// Create a new account and record the "transaction"
	
	private String name; //a String representing the username
	private String password; //a String representing the password
	private int userId;
	private static Account[] account = new Account[100]; // an Account representing the account
	
	/*public User(String name, String password, int accountId) {
		this.name = name;
		this.password = password;
		this.accountId = accountId; }*/
	
	public User() {
	       this.name = "";
	       this.password = "";
	       this.userId = 0;
	     
	       for(int i=0; i<account.length; i++){
	    	   account[i] = new Account(0,0);
	       }
	   }

	
	public User(String name, String password, int id) {
	       this.name = name;
	       this.password = password;
	       this.userId = id;
	       account[id] = new Account(0,id);
	    	        
	   }

	
	/**
	* Returns the account id
	* @return id
	*/
	public int getId() {
		return this.userId;
	}
	
	public void setUserId(int id){
		this.userId = id;
	}
	
	/**
	* Returns the username
	* @return name
	*/
	public String getUsername() {
		return this.name;
	}
	
	public void setUsername(String name) {
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
	
	
	public static Account getAccount(int id) {
		return account[id];
		
		//	accountArray[id] = new Account(0,id);
	   
	
	}

	
}
