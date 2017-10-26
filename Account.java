
/**
 * Create Account class
 *
 */
public class Account{
		long balance;
		long accountNumber;
		
		/** 
		 * Constructor of Account class
		 */
		public void Account(){ 
			/** 
			 * First value of balance variable is 0
			 */
			balance = 0; 
		}
		
		
		/** 
		 * Setter method of Balance variable
		 */
		public void setBalance(long bal){ 
			/**
			 * Set input number to balance variable
			 */
			balance = bal; 
		}
		
		/**
		 * Getter method of Balance variable
		 */
		public long getBalance(){ 
			/**
			 * Return balance variable's value
			 */
			return balance; 
		}
		
		
		/**
		 * Setter method of AccountNumber variable
		 */
		public void setAccountNumber(long accNumber){ 
			/**
			 * Set input value to AccountNumber variable
			 */
			accountNumber = accNumber; 
		}
		
		/**
		 * Getter method of account Number
		 */
		public long getAccountNumber(){
			/**
			 * Return value of accountNumber variable
			 */
			return accountNumber; 
		}
		
		
		/**
		 *  Method of Account class that computing deposit of account
		 */
		public void deposit(long number){ 
			/** 
			 * Set balance which is a sum of input number and value of balance
			 */
			setBalance(getBalance() + number);  
		}
		
		/** 
		 * Method of Account class that computing withdraw of account
		 */
		public void withdraw(long number){ 
			/** 
			 * Set balance which is odd of input number from value of balance
			 */
			setBalance(getBalance()-number); 
		}
		
		
	}
