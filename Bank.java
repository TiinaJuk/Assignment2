package dit948;


import static dit948.SimpleIO.*;

public class Bank {

	public static int id =0;
	private static User[] userArray = new User[100];
	//private static Account[] accountArray = new Account [100];
	public static Transaction[] transArray = new Transaction[100];


	/**
	 * This class implements the data structures of the bank. An array of users and
	 * array of transactions are used to keep track of users and transactions
	 * Note: you are allowed to use ArrayLists, but you dont need to
	 */
  /*    
       /**
        * Checks whether a user is present in the User array, given the username
        * and the password
        *
        * @param u username
        * @param p password
        * @return true or false, accordingly
        
       */

	public static User getUserArray(String name){
		//how to get userArray which username is name
		int n = 0;
		
		return userArray[n];
		}
	
	public static void setUserArray(int n, User tmp){
		userArray[n] = tmp;
		}
	


	public static boolean existsUserByUsernamePwd(String u, String p) {
		boolean ans = true;

		for(int i = 0; i < id; i++) {
			if ((userArray[i].getUsername().equals(u)) && (userArray[i].getPassword().equals(p))){
				ans = false;
			}
		}
		return ans;
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
	public static User getUserFromUsrPwd(String u, String p) {
		String pass = p;
		do{
		
		//checking the password
		for(int i=0; i < id; i++){
			if ((userArray[i].getUsername().equals(u)) && (userArray[i].getPassword().equals(pass))){
				println("You are logged in!");
				return userArray[i];
			}
			
			else{				
			}
		}
		//if wrong password
				println("Wrong password, please enter again. Press Q to exit. ");
				pass = readString();
		//if Q or q, then exit				
					if((pass.equals('Q')) || (pass.equals('q'))){
					println("Exit!");
					return null;	
					}		
			
		}while(true);
	}
	/**
	 * Returns the User object associated with a given username
	 *
	 * @param u username
	 * @return the User with username u, if present in the array of
	 * Users; null otherwise
	 */

	public static User getUserByUsr(String u) {

		for(int i=0; i < userArray.length; i++){
			if(userArray[i].getUsername().equals(u)){
				return userArray[i];
			}

			else{
				println("Username doesn't exist.");
			}
		}
		return null;

	}

	/**
	 * Prompt the user to enter a username and a password from the console. Then
	 * use the chosen username and password to create a new user and add it to
	 * the array of users. Hint: Each user must be assigned a new id.
	 */
	public static void addUser() {
		String name;
		String password;
		boolean ans;
		do {
			println("Enter new user name: ");
			name = readString();

			println("Enter new user password: ");
			password = readString();


			ans = existsUserByUsernamePwd (name, password);

			if(ans == true){
				userArray[id] = new User(name,password,id);

				id++;


				println("New user succesfully created!");
				println("Your username is: " + name);
				println("Your password is: " + password);
			}

			else if (ans == false){
				println("Unfortunately the username or password is taken.");
			}

		} while(ans==false);

	}

}
