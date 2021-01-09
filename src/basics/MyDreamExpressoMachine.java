package basics;

public class MyDreamExpressoMachine {

	public static void main(String[] args) {

		
	// i need a variable to store my cash amount
	double myCurrentCash = 800;
		
	// i need a variable to store my credit balance 
	double myCurrentCredit = 7000.0;
	// do i want to buy with credit or only if i have the cash
	boolean buyWithCashOnly = true;
	// do i need it now
	boolean needItNow = true;
	// price of the machine
	double currentMachinePrice = 699.99;
	
	// do i have the cash to buy the machine
	
	if (myCurrentCash >= currentMachinePrice) {
		// you have the cash
		System.out.println("We have the Cash to buy the Machine");
		if (needItNow ==true) {
			System.out.println("Buy the Machine with Cash");
	} else {
			System.out.println("We have the cash, but we don't need it now! So Wait");
	}
		
	} else {
		
		// i don't have the cash
		System.out.println("We do not have the cash to buy the Machine");
		if (myCurrentCredit >= currentMachinePrice) {
			// i have the credit to buy
			if (needItNow ==true && buyWithCashOnly == false) {
				System.out.println("Buy the Machine with Credit!");
		} else {
				System.out.println("We either don't need it now,or we are not okay to buy with credit. Deal with IT!!!");
		}	
		} else {
			// i don't have the credit limit to buy the machine
			System.out.println("We don't even have the credit to buy the machine, so Work More");
				
			}
		}
	}
}


