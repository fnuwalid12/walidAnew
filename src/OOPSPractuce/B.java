package OOPSPractuce;

public class B extends A{

	private int age;
	
	public B () {
		super("Sample Name");
		age = 0;
		//super.setName("");
		
	}
	
	public B(String name, int age) {
		super(name);
		this.age = age; 
	}
	public int getAge () {
		return age;
	}
	
	public void setAge(int age) {
	this.age = age;
	}	
		
	public String getNameMethodofTheParentClass() {
		return super.getName();
	}
	//what happens when you say this.: 
	public String getName() {
		return "The method getName of class B"; 
			
	}
		
		
		
		
			
	
	
	
	
	
	
	
}
