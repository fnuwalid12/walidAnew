package DariClass;

public class HomeWorkOne {

	int id;
	String firstName;
	String lastName;
	double salary;
	
	public String Bank () {
		return "Works in a Bank"; 
			
	}
	public String resturant (String resturant) {
		return resturant;
		
	}
	
	public HomeWorkOne (int newId, String newFirstName, String newLastName, double newSalary) {
		id = newId;
		firstName = newFirstName;
		lastName= newLastName;
		salary = newSalary;	
		}
	public HomeWorkOne () {
		//we need to initialize/start object all variables inside this method
		id = 0;
		firstName = "";
		lastName = "";
		salary = 0.0;	
			
	}	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
	
	HomeWorkOne theEmployee1 = new HomeWorkOne();
		
		theEmployee1.setId(1); 
		theEmployee1.setFirstName("Jon");
		theEmployee1.setLastName("Andrew");
		theEmployee1.setSalary(45000.00);
					
	HomeWorkOne theEmployee2 = new HomeWorkOne();
		
		theEmployee2.setId(2); 
		theEmployee2.setFirstName("Jawad");
		theEmployee2.setLastName("Ahmad");
		theEmployee2.setSalary(2500.00);	
	
	if (theEmployee1.salary<3000.00) {
		System.out.println("Employer works in resturant");
	} else {
		System.out.println("Employer works in Bank");
	}
		
	if (theEmployee2.salary<3000.00) {
		System.out.println("Employer works in resturant");
	} else {
		System.out.println("Employer works in Bank");
	}
		
		
	
	}

}
