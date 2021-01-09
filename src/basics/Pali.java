package basics;

public class Pali {

	public static void main(String[] args) {
	
		// what is a palindrome,
		// write a program that will take a word and print if 
		// the word is palindrome or not
		
		// String word = "eye";
		
		// .charat
		// . length
		// ==
		// for loop
		// if statement
		//
		
	String data = "abcba";
				// 012345	
	
		int rev = data.length() - 1;
		
		boolean pal = true;
		for (int i = 0; i < data.length(); i++) {
			
		if (data.charAt(i) != data.charAt(rev)) {
			pal = false;
		} 
					
		rev--;
		}
		System.out.println(pal);

	}

}
