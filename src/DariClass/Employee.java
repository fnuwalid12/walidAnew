package DariClass;

public class Employee {

	int id; 
	String name;
	String position;
	double salary;
	
	//public Employee (int id, String name, String position, double salary) {
		//this.id = id;
	//	this.name = name;
	//	this.position = position; 
	//	this.salary = salary;
		
	//}

	public String doCustomerService () {
		return "Answer calls"; 
			
	}
	public String payBills (String payBills) {
		return payBills;
		
	}
	
	
	public String chargeForServices (String customerCharge) {
		return customerCharge;
	}
	
	public Employee (int newId, String newName, String newPosition, double newSalary) {
		id = newId;
		name = newName;
		position = newPosition;
		salary = newSalary;	
	}
	public Employee () {
		//we need to initialize/start object all variables inside this method
			id = 0;
			name = "";
			position = "";
			salary = 0.0;
					
	}
	
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String newPosition) {
		position = newPosition;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		salary = newSalary;
	}
	public static void main(String[] args) {

	Employee theEmployee1 = new Employee (1, "Kamal", "Help Desk", 10.000);
	System.out.println("ID " + theEmployee1.id);
	System.out.println("Name " + theEmployee1.name);
	System.out.println("Position " + theEmployee1.position);
	System.out.println("Salary " + theEmployee1.salary);
	System.out.println("Job" + theEmployee1.doCustomerService ());

	System.out.println("************************");
	
	Employee theEmployee2 = new Employee (2, "Jamal", "Accountant", 20.000);
	System.out.println("ID " + theEmployee2.id);
	System.out.println("Name " + theEmployee2.name);
	System.out.println("Position " + theEmployee2.position);
	System.out.println("Salary " + theEmployee2.salary);
	System.out.println("Job" + theEmployee2.doCustomerService ());
	
	System.out.println("************************");
	
	Employee theEmployee3 = new Employee (3, "Kumar", "Assistance", 30.000);
	System.out.println("ID " + theEmployee3.id);
	System.out.println("Name " + theEmployee3.name);
	System.out.println("Position " + theEmployee3.position);
	System.out.println("Salary " + theEmployee3.salary);
	System.out.println("Job" + theEmployee3.doCustomerService ());
	
	System.out.println("****************************");
	
	Employee theEmployee4 = new Employee ();
	
	theEmployee4.setId(4); 
	theEmployee4.setName("Ahmad");
	theEmployee4.setPosition("Driver");
	theEmployee4.setSalary(15.00);
			
	
		System.out.println("ID " + theEmployee4.getId());
		System.out.println("Name " + theEmployee4.getName());	
		System.out.println("Position " + theEmployee4.getPosition());
		System.out.println("Salary " + theEmployee4.getSalary());
		
	
	
	}

}
