	/**
	 * Create ATM class
	 * @param 
	 */
public	class ATM {
		Bank Bank;
		boolean state;
		Customer currentCustomer;
		Account currentAccount;
		
		/** 
		 * Constructor method of ATM class
		 */
		public void ATM() { 
			/** 
			 * Create new memory of Customer class 
			 */
			currentCustomer = new Customer(); 
			/** 
			 * Create new memory of Account class
			 */
			currentAccount = new Account();
			/** 
			 * Create new memory of Bank class
			 */
			Bank = new Bank(); 
			/**
			 *  First value of state is false 
			 */
			setState(false); 
		}
		
		
		/** 
		 * Setter method of bank variable
		 */
		public void setBank(Bank BankInfo){ 
			/** 
			 * Set name to new bank variable with bank type 
			 */
			Bank.setName(BankInfo.getName());  
		}
		
		/** 
		 * Getter method of bank variable 
		 */
		public String getBank(){ 
			/** 
			 * Return bank name from bank variable 
			 */
			return Bank.getName(); 
		}
		
		/** 
		 * Setter method of State variable
		 */
		public void setState(boolean atmState){
			 /** 
			  * Set input value to state variable 
			  */
			state = atmState;
		}
		
		/** 
		 * Getter method of State variable 
		 */
		public boolean getState(){ 
			/**
			 *  Return state value 
			 */
			return state; 
		}
		
		
		/**
		 * Setter method of currentCustomer variable
		 */
		public void setCurCustomer(Customer Customer){
			/** 
			 * Set name of customer from input value 
			 */
			currentCustomer.setName(Customer.getName()); 
			 /** 
			  * Set customer number of customer from input value 
			  */
			currentCustomer.setCusNumber(Customer.getCusNumber());
			/** 
			 * Set account of customer from input value 
			 */
			currentCustomer.setAccount(Customer.getAccount());
			/** 
			 * Set pin code of customer from input value 
			 */
			currentCustomer.setPin(Customer.getPin()); 
		}
		
		
		/** 
		 * Getter method of currentCustomer variable 
		 */ 
		public Customer getCurCustomer(){ 
			/** 
			 * Return values of current customer, return value is customer 
			 */
			return currentCustomer; 
		}
		
		
		/** 
		 * Setter method of currentAccount variable 
		 */
		public void setCurAccount(long Account){ 
			/** 
			 * Set input account number to currentAccount's account 
			 */
			currentAccount.setAccountNumber(Account);  
		}
		
		/**	
		 * Getter method of currentAccount variable 
		 */
		public Account getCurAccount(){ 
			/** 
			 * Return account of currentAccount by Account type 
			 */
			return currentAccount; 
		}
		
		
		/** 
		 * Method that compute withdraw of account 
		 */
		public void withdraw(long withdraw){ 
			/** 
			 * Set balance by input withdraw and currentAccount's balance 
			 */
			currentAccount.setBalance(getCurAccount().getBalance() - withdraw); 
			/** 
			 * Set state variable's value equal to true 
			 */
			setState(true); 
		}
	}
