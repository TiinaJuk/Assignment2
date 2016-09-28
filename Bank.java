package dit948;
/**
* Created by Carl on 26/09/2016.
*/

import static dit948.SimpleIO.*;
import static dit948.Random.*;

public class Bank {

   public static int id =0;
   private static User[] userArray = new User[100];
   public static Transaction[] transArray = new Transaction[100];


/*
   Account[] accArray = new Account[10];
   int tempID;
       for (int i = 0; i < accArray.length; i++) {
       accArray[i] = new Account();
       accArray[i].setId(i);
       accArray[i].setBalance(100);
       System.out.println("Sucsess! a new user with ID nr: " + i + " has been created");
   }
*/

   // you can assume there won’t be more than 100 users
   // and 100 transactions
   /**
    * This class implements the data structures of the bank. An array of users and
    * array of transactions are used to keep track of users and transactions
    * Note: you are allowed to use ArrayLists, but you don’t need to
    */
       public Bank() {
    	   this.id = 0;
    	   this.userArray = null;
    	   this.transArray = null;
       }
       
       /**
        * Checks whether a user is present in the User array, given the username
        * and the password
        *
        * @param u username
        * @param p password
        * @return true or false, accordingly
        */

       public boolean existsUserByUsernamePwd(String u, String p) {
           for(int i = 0; i > userArray.length; i++) {
                   if((userArray[i].name== u) && (userArray[i].password == p){
                   return false;
               }

                   else{

               }

           }

           return true;
       }

       /**
        * String representation of the list of users of the
        * online bank
        */
       // is this the way to do this? why not only use a void method and a loop
       public String toString() {
    	   
    	     for(int i = 0; i > userArray.length; i++) {
               println(userArray[i].getUsername());

           }
           String ready = "Ready!";
           return ready;

           /*
           V2
           String  userNameList;
           for(int i = 0; i > userArray.length; i++) {
               userNameList = userNameList+ ", " + userArray[i];


           }
           */
       }

       /**
        * Returns the User associated with a username and a password
        *
        * @param u username
        * @param p password
        * @return a User object or null
        */
       public User getUserFromUsrPwd(String u, String p) {
// code here
       }
       /**
        * Returns the User object associated with a given username
        *
        * @param u username
        * @return the User with username u, if present in the array of
        * Users; null otherwise
        */

       public User getUserByUsr(String u) {
// code here
       }
       /**
        * Prompt the user to enter a username and a password from the console. Then
        * use the chosen username and password to create a new user and add it to
        * the array of users. Hint: Each user must be assigned a new id.
        */
       public static void addUser() {
    	println("Enter new user name: ");
		String name = readString();

		println("Enter new user password: ");
		String password = readString();
		
		userArray[id] = new User(name, password);
		Account account = new Account(0,id);
		
		/* we had this before
		userArray[id] = new User();
		userArray[id].setAccountId(id);
		userArray[id].setPassword(password);
		userArray[id].setName(name);*/
		
		id++;
		
		println("New user succesfully created!");
		println("Your username is: " + name);
		println("Your password is: " + password);
       }
 


}
