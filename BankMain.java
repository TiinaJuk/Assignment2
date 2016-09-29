package dit948;

import static dit948.SimpleIO.*;
import static dit948.Random.*;

/**
* Class representing a online banking application for the second assignment of
* DIT948, 2016 edition. This is the main class for the application, interacting
* with the user, creating accounts and performing various transactions More
* information about the interface can be found in Testcases.txt
*/

public class BankMain {
	//check if working

   public static void main(String[] args) {

	   Bank bank = new Bank();

       // Implement here the interaction between the user and the
       // online banking system.

       println("Welcome to the DIT948 online bank");
       do{
           println("Main menu");
           println("1: Create user account");
           println("2: Login as user");
           println("3: List users");
           println("4: Exit");
           println("Please enter a action to preform: ");

           int action = readInt();

           switch(action) {
               case 1:
            	  Bank.addUser();
            	 
               case 2:
            	   
            	   //Login as user
            	   	println("Enter a username:");
            	   	String name = readString();
            	   	println("Enter a password:");
            	   	String password = readString();
            	   	
            	   	//check the password
            	   	// loop for getting right one
   
            	   
            	   
            	   do{

                       println("SubMenu");
                       println("1: Check balance");
                       println("2: Deposit");
                       println("3: Withdraw");
                       println("4: List of transactions");
                       println("5: Transfer to other account");
                       println("6: Close user session");

                       int aubAction = readInt();

                           switch(aubAction)
                           {
                                   case 1:
                                	   //Check balance
                                   case 2:
                                	   //Deposit
                                   case 3:
                                	   //Withdraw
                                   case 4:
                                	   //List of transactions
                                   case 5:
                                	   //Transfer to other account
                                   case 6:
                                	   //Close user session
                                   default:
                                       println("Enter a number between 1 and 6");

                                           }

            	   	}while(true);

               case 3:
            	   //Huomaa!
            	   Bank.toString();
            	   
 
               case 4:
               //Exit
               default:
               println("Enter a number between 1 and 4");

   }

   }while (true);// FIXTHIS
}

}


