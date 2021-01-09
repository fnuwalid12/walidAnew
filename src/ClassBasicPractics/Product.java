package ClassBasicPractics;

public class Product {

	//Variables
	private String name;
	private double price;
	// default method
	public Product() {
		name = "";
		price = 0;
		
	}
	// para method	
	public Product(String name, double price) {
		this.name = name; 
		// this means get out of the method and see if you can find name anywhere
		// in the body of class
		this.price = price;
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
		
	}
	
	public String toString() {
		return "[Name: " + name + ", Price: " + price + "]";
				
	}
	
}
