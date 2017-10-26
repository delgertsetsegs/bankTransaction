import java.util.ArrayList;
import java.util.List;

/**
 * Create Customer class
 *@param name input Customer name
 *@param customerNumber Input customer Number
 *@param pin customer pin code
 *@param Account accounts of customer
 */
public class Customer{
		String name; 
		int customerNumber;
		int pin;
		Account Account;

		
		/** 
		 * Create Constructor of Customer class  
		 */
		public void Customer(){  
			/** 
			 * Create new memory on Account variable
			 */
			Account = new Account(); 
		}
		
		
		/** 
		 * Set Name of variable
		 */
		public void setName( String nameInput){ 
			/**
			 * Give name to Name variable
			 */
			name = nameInput;  
		}
		
		 /**
		  * Getter method of Name variable
		  */
		public String getName(){
			/**
			 * Return value of Name variable
			 */
			return name; 
		}

		/**
		 * Setter method of customerNumber variable
		 */
		public void setCusNumber( int number){ 
			/**
			 * Give input number to customerNumber 
			 */
			customerNumber = number; 
		}
		
		/**
		 * Getter method of customerNumber variable
		 */
		public int getCusNumber(){ 
			/**
			 * Return value of customerNumber
			 */
			return customerNumber; 
		}
		
		
		/**
		 * Setter method of pin variable
		 */
		public void setPin( int number){ 
			/** 
			 * Set input number to pin
			 */
			pin = number; 
		}
		
		/**
		 * Getter method of pin variable
		 */
		public int getPin(){ 
			/**
			 * Return value of pin variable
			 */
			return pin; 
		}
		
		/**
		 * Setter method of Account number
		 */
		public void setAccount(long number){ 
			/**
			 * Set input number to Account class's account number variable
			 */
			Account.setAccountNumber(number); 
		}
		
		/**
		 * Getter method of account number
		 */
		public long getAccount(){ 
			/**
			 * Return Account class's Account number
			 */
			return Account.getAccountNumber(); 
		}
}
	
	
	
	
