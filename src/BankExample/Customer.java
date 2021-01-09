package BankExample;

public class Customer {

	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private int phoneNumber;
	private int ssn;
	
	private String accNumber;
	private double balance;
	
	public Customer () {
		firstName = "";
		lastName = "";
		age = 0;
		address = "";
		phoneNumber = 0;
		ssn = 0;
		accNumber = "";
		balance = 0;
		
	}
	
	public Customer(String firstName, String lastName, int age, String address, int phoneNumber, int ssn, String accNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.accNumber = accNumber;
		this.balance = balance;
			
	}
	public Customer(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		address = "";
		phoneNumber = 0;
		ssn = 0;
		accNumber = "";
		balance = 0;
	}
	
	public String getAccNumber() {
		return accNumber;
		
	}
	public void setAccNumber (String accNumber) {
		this.accNumber = accNumber;
		
	}
	public double getBalance() {
		return balance;
		
	}
	public void setBalance (double balance) {
		this.balance= balance;
		
	}
	public String getFirstName () {
		return firstName;
		
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	
	}	
	public String getLastName () {
			return lastName;
			
	}
	public void setlastName(String lastName) {
			this.lastName = lastName;
				
	}
	
	public int getAge () {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
	
	}
	
	public String getAddress () {
		return address;
		
	}
	public void setAddress(String address) {
		this.address = address;
	
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
		
	public String toString() {
		//123456789
		//012345678
		String tempSSN = "***-**-" + String.valueOf(ssn).substring(5);;
		
		// 000 000 0000
		// 012 345 6789
		String tempPhone = String.valueOf(phoneNumber);
		String tempPhoneForPrint = "(" + tempPhone.substring(0, 3) + ")" + tempPhone.substring(3, 6) + "-" +tempPhone.substring(6);
		
		return "Account Number: " + accNumber + ". Balance: " + balance + "\n" + " First Name: " + firstName + " Last Name: " + lastName + " Age: " + age + "\naddress: " + address + " Phone Number: " 
				+ tempPhoneForPrint + " SSN: " + tempSSN + "\n-------------------------------------------"; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
