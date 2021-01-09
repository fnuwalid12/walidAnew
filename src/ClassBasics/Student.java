package ClassBasics;

public class Student {

	// first declaring instance variables
	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	
	// creating constructor methods/default method
	
	public Student () {
	//we need to initialize/start object all variables inside this method
		firstName = "";
		lastName = "";
		age = 0;
		gpa = 0;
				
	}
	
	// creating a parameterized constructor
	//once you create a variable then you can not create the same 
	// variable with same name
		
	public Student(String newFirstName, String newLastName, int newAge, double newGPA) {
		firstName = newFirstName;
		lastName = newLastName;
		age = newAge;
		gpa = newGPA;
	}
	//getter method, and setter method
	//access modifier + Return Type + name of the method (Arguments), {method body}
	
	public String getFirstName () {
		return firstName;
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
		
		
	}
	
	// create get and set methods for these variables
	// private String lastName;
	// private int age
	// private double gpa
	
	
	public String getLastName () {
		return lastName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
		
	}
	 
	
	public int getAge () {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
		
	}
	
	public double getGpa () {
		return gpa;
	}
	
	public void setGpa(double newGpa) {
		gpa = newGpa;
		
	}
	
}
