package basics;

public class LoopExample {

	public static void main(String[] args) {
	// write a program that prints 1 - 25 and print some text instead of some numbers
	// TEK for numbers that are divisible 3
	// School for numbers that are divisible 5
	//TEKSCHOOL for numbers that are divisible 5 and 3
	// fizz buzz system
		
	int num = 1;
	
	while (num <=25) {

	if (num % 3 == 0 && num % 5 == 0) {	
			System.out.println("TEKSchool" + num);
	} else if (num % 3 == 0) {
		System.out.println("TEK" + num);
	} else if (num % 5 ==0) {
		System.out.println("School" + num);
	} 
	else {
		System.out.println(num);
	}
	
	
		++num;
	}
	
	
	
	
	
	
	}

}
