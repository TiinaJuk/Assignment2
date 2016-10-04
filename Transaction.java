package dit948;
import static dit948.SimpleIO.*;


public class Transaction {


	/**
	 * This class implements a transaction performed by the bank users
	 */

	// constructor with parameters

	private String type; //to record the type of transaction
	private Account account; // an Account used by the transaction
	public static int tranId =0;

	public Transaction(Account account, String type) {
		this.type = type;
		this.account = account;
		tranId=tranId;
	}

	public String getString (){
		return this.type;
	}

	/**
	 * Returns the Account object
	 * @return account
	 */
	public Account getAccount() {
		// code here
		return account;
	}

	/**
	 * String representation of a transaction
	 */
	public static String ToString(Account currentAccount) {
		String list = "The transactions are:"+"\n";

		for(int i = 0; i < tranId; i++) {
			if(Bank.transArray[i].getAccount().equals(currentAccount)){
				list = list + Bank.transArray[i].getString() + "\n";

			}

			else{

			}
		}
		return list;
	}

}
