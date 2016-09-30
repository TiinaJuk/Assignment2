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
            	 
            	  break;
            	 
               case 2:
            	   
            	   //Login as user
            	   int n=2; //key for getting to submenu
            	   
            	  logInUserCheck: while (n!=4) {
    	   		 	
            		println("Enter a username:");
            	   	String name = readString();
            	   	
            	 	
            	   	
            	   	User currentUser = Bank.getUserByUsr(name);
            	   	println(currentUser);
            	   
            	   	//Getting the ID of the logged in user
            	   	int LoggedInId = currentUser.getId();
            	   	
            	   	if(currentUser == null){	
            	   		break logInUserCheck;
            	   		
            	   	}
            	   		
            		else{   	 
            	   		println("Enter a password:");
            	   		String password = readString();
              	   	
            	   		
            	   		currentUser = Bank.getUserFromUsrPwd(name,password);
            	   			if(currentUser == null) {
            	   				break logInUserCheck;
            	   			}//if
            	   
            	   			else{
            	   				
            	   			} //else
               	   	} //else
            	   	         	   	
         	   
            	 //  int aubAction;
            
             	   	// CHECK THIS LATER! Eli jos laittaa Q niin pit�� menn� Main Menu eik� Sub Menu, k�yt� subactionia do while loopissa ni onnistuu
            	
            	   
            		   
            	   do{

                       println("SubMenu");
                       println("1: Check balance");
                       println("2: Deposit");
                       println("3: Withdraw");
                       println("4: List of transactions");
                       println("5: Transfer to other account");
                       println("6: Close user session");

                       int subAction = readInt();
                        
                           switch(subAction)  {
                                   case 1:
                                	// println("The balance is:" + Account.getAmount(LoggedInId));
                                	 // userArray[LoggedInId]
                                	  break;

                                   case 2:
                                	   //Deposit
                                 	  break;

                                   case 3:
                                	   //Withdraw
                                 	  break;

                                   case 4:
                                	   //List of transactions
                                 	  break;

                                   case 5:
                                	   //Transfer to other account
                                 	  break;

                                   case 6:
                                	  println("");
                                	  break;

                                   default:
                                       println("Enter a number between 1 and 6");
                                       			
                           		} //switch
  
            	   } while(true);
            	   
            	  }//while
            	   		
               case 3:
            	   //Huomaa!
            	   //Error!
        
            	   
             	  break;

               case 4:
               //Exit
            	   
             	  break;

               default:
               println("Enter a number between 1 and 4");

   } // switch

  }while (true);// FIXTHIS
 
   }
   
 } //class
   
       





