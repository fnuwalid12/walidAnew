package basics;

public class CreatingVariables {

	public static void main(String[] args) {

		
		//create an integer with name x
		int X;
		
		
		//assign the value 10
		X = 10; 
		
		// create and assign 15 to integer y
		// we can do it two diffrent ways
		int y = 15;
		System.out.println(X + y);
				
		//create int on age and assign 27
		int age = 27;
		//create double of taxRate and assign 2.7
		double taxRate = 2.7;
		//create boolean of taxPaid and assign ture
		boolean taxPaid = true;
		//create char of grade and assign A
		char grade = 'A';
				
		
		
		//create String of first name and assign Jack
		String firstName = "Jack";
		//create String of last name ans assign Daniel
		String lastName = "Ma";
		
		
		System.out.println(firstName + " " + lastName + " " + age);
		
		
		//Ma, Jack (Age: 27)
		
		System.out.println(lastName + ", " + firstName + " (Age:" + age + ")");
		
		int width = 10;
		int heigth = 27;
		
		// find the area of the rectangle
		
		System.out.println(width * heigth);
		
		// The area for the box with height:## and width: ## is ###
		
		System.out.println("The area for the box with height:"+ heigth +" and width:" + width + " is " + width * heigth);
		
		
		// the total of items is: 35 
		
		int qty1 = 10;
		int qty2 = 25;
		
		
		System.out.println("The total of items is: " + qty1 + qty2);
		System.out.println("The total of items is: " + (qty1 + qty2));
		
		// this is the important operator or people also call it mod
		// you divide something like 5 by 2 it is 2 and the remainder is 1
		
	}

}
