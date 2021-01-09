package BankExample;

public class Runner {

	public static void main(String[] args) {
	
	//Customer c1 = new Customer("Jack", "Ma", 45, "somewhere in China", 2028975642, 123456789, "A001", 0.0);
	
	//System.out.println(c1);
			
	Bank va_Branch_1 = new Bank ("Wells Fergo in Va", 100);
	va_Branch_1.AddCustomer(new Customer("Jack", "Ma", 45, "Somewherein Chiane", 2021231234, 123123123, "A001", 10.0));
	va_Branch_1.AddCustomer(new Customer("David", "Backon", 55, "Somewherein india", 2021234444, 123123142, "A002", 101010.0));
	System.out.println(va_Branch_1);	
		
	System.out.println(va_Branch_1.getCustomer("A003"));	
	System.out.println(va_Branch_1.getCustomer("Jack", "Ma"));
	}

}
