package InterviewPractics;

public class StringMunipilation {

	public static void main(String[] args) {
	
	String a = "zBCde";
	String b = "ebdcA";
		
		
	// i want to see if all of the characters in string a is present in string b
	// as well
	//ignore if capital or not
	// print true if true and false if false
	
	 if (a.length() == b.length()) {
		 for (int i = 0; i < a.length(); i++) {
			
			 // System.out.println(b.toLowerCase().contains(String.valueOf(a.toLowerCase().charAt(i))));
			 if(!b.toLowerCase().contains(String.valueOf(a.toLowerCase().charAt(i)))) {
				 //true
				 System.out.println("False: mismatch");
				 break;
			 } 				 //false
			 
		}
	 }	else {
		 System.out.println("False: different length");
	}
			
 		
	
		
		
		
		
		
		
		
	}

}
