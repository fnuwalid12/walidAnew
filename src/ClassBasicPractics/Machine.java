package ClassBasicPractics;

public class Machine {
	
	private int [] quantities; 
	private Product [] products;
		
	public Machine() {
		quantities = new int [5];
		products = new Product [5];
			
	}
	public Machine (int numberofItems) {
		quantities = new int [numberofItems];
		products = new Product [numberofItems];

	}		
	
	public int[] getQuantity () {
		return quantities; 
	}
	
	public void setQuantity(int[] quantity) {
		this.quantities = quantity; 
	}
	
	public Product [] getProducts() {
		return products;
	}
	
	public void setProducts (Product[] items) {
		this.products = items;
	}
	
	
	//System.out.println(obj1.getName() + " " + obj1.getPrice());	
	// System.out.println(obj1.toString());	
	//toString can be used to get the object data from other class
	//if we run obj1 only it will print the reference, but if we
	// print toString it will print the value assigned to object

	// create a method add that takes one object of Product and the index number (which is the address
	// of the item in the machine) to the list of products that i have
	
	public void addProduct(Product product, int index, int quantity) {
		products[index] = product; 
		quantities[index] = quantity; 
		
	}
	
	public void reStockProduct(int index, int numberofAddedProduct) {
		quantities[index] = quantities[index] + numberofAddedProduct;
	}
		
	public String toString() {
		String temp = "";
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				temp += products[i].toString() + " --> Available Quantity: " + quantities[i] + "\n";
		}
		}
		return temp;

		
		
		
		
		
	}
}
