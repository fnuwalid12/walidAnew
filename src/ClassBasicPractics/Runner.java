package ClassBasicPractics;

public class Runner {

	public static void main(String[] args) {
	
	Machine firstMachine = new Machine(8);
	
	firstMachine.addProduct(new Product("Cheetos", 3.5), 0, 2);
	firstMachine.addProduct(new Product("Redbull", 5.2), 1, 6);
	firstMachine.addProduct(new Product("M&M", 2.2), 2, 50);
	
	firstMachine.reStockProduct(0, 5);
	
	System.out.println(firstMachine);
	
	}

}
