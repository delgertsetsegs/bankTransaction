import java.util.ArrayList;
import java.util.List;

	/**
	 * Create Bank class
	 */
public	class Bank{
		String name;
		List<Customer> Customers;
		
		 /**
		  * Constructor of bank class
		  */
		public void Bank(){
			/** 
			 * Create new memory of Customer class
			 */
			Customers = new ArrayList<Customer>(); 
			/** 
			 * Set null value to Name variable
			 */
			setName(" "); 
		}
		
		
		/** 
		 * Setter method of name variable
		 */
		public void setName(String inputName){ 
			/** 
			 * Set input value to name variable
			 */
			name = inputName; 
		}
		
		/**
		 * Getter method of name variable 
		 */
		public String getName(){ 
			/** 
			 * Return value of Name variable by String type 
			 */
			return name; 
		}
		
		
		/**  
		 * Add new customer method 
		 */
		public void addCustomer(Customer Customer){ 
			/** 
			 * Add new Customer to Customer class 
			 */
			Customers.add(Customer); 
		}
		
		
		/** 
		 * Getter method of Customer list variable
		 */
		public Customer getCustomer(String name){ 
			/** 
			 * Declare new customer type variable named result 
			 */
			Customer result = null; 
			/** 
			 * Loop from 0 to customer variable's length 
			 */
			for(int i=0; i<Customers.size(); i++){ 
				/** 
				 * Check one customer's name equal to input value 
				 */
				if(Customers.get(i).getName() == name){ 
					/** 
					 * If 'if' statement is true, set customer to result variable 
					 */
					result = Customers.get(i); 
				}
			}
			/** 
			 * Return customer type variable 
			 */
			return result; 
		}
	}
