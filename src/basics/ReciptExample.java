package basics;

public class ReciptExample {

	public static void main(String[] args) {
		
System.out.println("#             Item            Price");	
		
		String item1 = "Keyboard";
		double Price1 = 267.58;
				
		String item2 = "Computer";
		double Price2 = 150.58;
		
		String item3 = "Computer";
		double Price3 = 150.58;
		
		String item4 = "Computer";
		double Price4 = 150.58;
		
		String item5 = "Computer";
		double Price5 = 150.58;
		
	System.out.println("************** Thank you for shoping with us! **********");
	System.out.println("# ITEM \t\t\t PRICE");
	System.out.println("------------------------------------------------");
	System.out.println("1.    " + item1 + "\t\t\t" + Price1);	
	System.out.println("2.    " + item2 + "\t\t\t" + Price2);
	System.out.println("3.    " + item3 + "\t\t\t" + Price3);
	System.out.println("4.    " + item4 + "\t\t\t" + Price4);
	System.out.println("5.    " + item5 + "\t\t\t" + Price5);
	
	System.out.println("-------------------------------------------");
	System.out.println("Total \t\t\t\t\t $" + (Price1 + Price2 + Price3 + Price4 + Price5));
 	System.out.println("Tax Rate \t\t\t\t " + 3.5 + "%");
 	System.out.println("Shipping Cost \t\t\t\t $" + 25.99);
	
 	System.out.println("Total \t\t\t\t $" + ((Price1 + Price2 + Price3 + Price4 + Price5) + 25.99 + .035 * (Price1 + Price2 + Price3 + Price4 + Price5)));	
	System.out.println("------------------------------------------------------");
	System.out.println("\n\nPlease visit the www.whatever.com for more info on \nwhatever you want to know about whatever.");
	
		
		/*
		************** Thank you for shoping with us! **********
		*# 		Item  		Price
		*1. 	Keyboard	&267.58
		*3.		PC			$500.00
		*4.
		*5.
		*Total				21231....
		*Shipment			25.012
		*Tax Rate			3.5 %
		*Total after tax
		*
		*
		*Please visit the www.whatever.com for more info on
		*whatever
		*/



	}

}
