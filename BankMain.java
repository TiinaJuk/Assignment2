package dit948;

import static dit948.SimpleIO.*;

//Can log in only with first account
//Why have to return null - doesnt work
//Bank glass checking password, Q doesnt work
//Money transfer errors in class Account
//List of transactions
//Class transaction
//Username list
//Exit the bank



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

     inMainMenu:  switch(action) {
                case 1:
               Bank.addUser();
                    
                break;
                
                case 2:
                    //case 2: Login as user
                	

                   logInUserCheck: while(true) {
              
                      //Getting the User object from the arrray and store the logged in user in "currentUser"
                       println("Enter a username:");
                       String name = readString();

                       //Getting the User object from the arrray and store the logged in user in "currentUser"
                       User currentUser = Bank.getUserByUsr(name);

                       if(currentUser == null) {
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
                        
                   
                        //Getting there Account object from the currentUser object and store the account object in the "currentAccount"
                       Account currentAccount = Bank.getUserByUsr(name).getAccount();
                        //User is now logged in and can preform the following SubMenu actions on there account

                       submenu: do{

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
                                    println("The balance is:" + currentAccount.getAmount());

                                    break;

                                case 2:
                                    //Deposit
                                    println("Please enter an amount to deposite ");
                                    double depositeAmount = readDouble();
                                    currentAccount.deposit(depositeAmount);
                                    println(depositeAmount + " has been successfully deposited to your account");

                                    break;

                                case 3:
                                    //Withdraw
                                    println("Please enter an amount to withdraw");
                                    double withdrawAmount = readDouble();
                                    boolean answer =currentAccount.withdraw(withdrawAmount);
                                     if (answer == true){
                                         println(withdrawAmount + " has been successfully withdrawed from your account");
                                     }
                                     
                                     else{
                                    	println("Invalid amount of withdraw, please try again!");
                                     }
                                    
                                    break;

                                case 4:
                                	//List of transactions
                                                  
                                    break;

                                case 5:
                                	//Transfer to another account
                                	println("Enter the username of the recepient: ");
                                	String userName = readString();
                                	
                                	println("Please enter an amount: ");
                                	double transferAmount = readDouble();
                                	
                                	boolean answer2 = Account.transferMoney(userName,transferAmount);
                                	if(answer2=true){
                                	println("Transfer is made succesfully to account" + name);	
                                	}
                                	else{
                                		
                                	}	
                                	
                                    break;

                                case 6:
                                    break inMainMenu;
                                
                                default:
                                    println("Enter a number between 1 and 6");

                            } //switch

                        } while(true);
                       
                   } //while submenu
               
                   break;
                   
                case 3:
                	//String answer = Bank.toString(); 


                    break;

                case 4:
                	//Exit
                	println("Thank you and Welcome back!");      
             	   //Error
                	

                    break;

                default:
                    println("Enter a number between 1 and 4");

            } // switch

        }while (true);

    }

} //class
   
       





