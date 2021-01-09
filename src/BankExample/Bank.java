package BankExample;

public class Bank {

	private String bankName;
	private Customer[] customers;
	int numberofCustomers;
	int maxNumberofCustomers;
	
	public Bank(String bankName, int maxNumberofCustomers) {
		this.bankName = bankName;
		customers = new Customer[maxNumberofCustomers];
		numberofCustomers = 0;
		this.maxNumberofCustomers = maxNumberofCustomers;
	}
	public String getBankName() {
		return bankName;
	}
	
	public boolean AddCustomer(Customer customer) {
		
		if (numberofCustomers < maxNumberofCustomers) {
			customer.setAccNumber("A00" + (numberofCustomers +1));
			customers[numberofCustomers] = customer;
			numberofCustomers++;
			return true;
		} else {
			System.out.println("We have reched the max capcacity of the b ank and so we can not add more customers!");
			return false; 
		}
		
	}
	
	public Customer getCustomer(String accountNumber) {
		for (int i = 0; i < numberofCustomers; i++) {
			if(accountNumber.equals(customers[i].getAccNumber())) {
				return customers[i];
			}
			 
		}
		
		
		
		return null;
	}
	public String getCustomer(String firstName, String lastName) {
		String temp = "Customer List with First Nmae: " + firstName + ", LastName: " + lastName + "\n**************************** \n"; 
		for (int i = 0; i < numberofCustomers; i++) {
			if (firstName.equals(customers[i].getFirstName()) && lastName.equals(customers[i].getLastName())) {
				temp += customers[i].toString() + "\n";
			}
		              	 
		}
		
		
		
		return temp;
	}
	public String toString() {
		String temp = bankName + "Customer List \n ******************\n";
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] != null) {
				temp += customers[i].toString() + "\n"; 
			}
		}
		return temp; 
	}
	
	
	
}
