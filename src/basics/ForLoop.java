package basics;

public class ForLoop {

	public static void main(String[] args) {

		
		
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
	}
		
	
	for (int i = 10; i >=0; i--) {
		System.out.println(i);
	}
	
	for (int j = 0; j <= 17; j +=3) {
		System.out.println(j);
	}
	
	// write a for loop that starts with 7 and run to 19 and print the odd numbers in that range 	
	
	for (int x = 7; x <= 19; x++) {
		if(x % 2 != 0) {
            System.out.println(x + " ");
					
	}
	}
	

	// write a for loop that starts from 217 and goes to -15 (by decrementing 1)
	// print only the numbers that are even and the sum of the number with the next number should not 
	// make less than 55
	
	int start =217;
	int end = -15;
	
	for (int i = start; i>=end; i--) {
		if (i % 2 == 0) {
			if (i + (i-1) > 55) {
		System.out.println(i);
		
			}
		}
	}
	
	String data = "tacotaco";
	
	System.out.println(data.charAt(1));
	System.out.println(data.length());
	
	// write a loop that will take one string and print one index
	// a time
	
	String a = "tacotaco";
	for (int i=0; i < a.length(  ); i++)
	    System.out.println("Char " + i + " is " + a.charAt(i));
	
	{
	String am = "I Love You Shabnam";
	for (int i=0; i < am.length(  ); i++)
	    System.out.print(am.charAt(i));
	}
	
	// what is a palindrome,
	// write a program that will take a word and print if 
	// the word is palindrome or not
	
	String word = "eye";
	
	// .charat
	// . length
	// ==
	// for loop
	// if statement
	//
	
	{
	
	String num = "123";
	int x = Integer.valueOf(num);
	System.out.println(x+x);
	
	}
	
	int x = 5;
	int y = 10;
	System.out.println(x+y);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
