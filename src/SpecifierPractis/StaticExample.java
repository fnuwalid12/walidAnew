package SpecifierPractis;

public class StaticExample {

	public static String calcTaxAmount(double amount, double taxRate) {
		return "For amount $" + amount + " and tax rate of %" + (taxRate * 100)+ " the tax amount will be $" 
	+ Math.round((amount * (taxRate / 100)));	
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println(calcTaxAmount(12452, .123));
	}

}
