package basics;

public class Scanner {

	public static void main(String[] args) {

	    // a.	If the temperature is greater than or equal to 90, it is probably summer.
		// b.	If the temperature is greater than or equal to 70 and less than 90, it is probably spring.
		// c.	If the temperature is greater than or equal to 50 and less than 70, it is probably fall.
		// d.	If the temperature is less than 50, it is probably winter.
		// e.	If the temperature is greater than 110 or less than 5, then you should output that the temperature entered is outside the valid range.

		
		
		int temp = 5;
	    
	    if (temp<=110 &&temp>= 90) {
	    	System.out.println("it is probably summer");
	    }
	    if (temp<=90 &&temp>= 70) { 
			System.out.println("it is probably spring");
		}
	    if (temp<=70 &&temp>= 50) { 
			System.out.println("it is probably fall");
		}
	    if (temp<=50 &&temp>=5) { 
			System.out.println("it is probably winter");
		}
	    if (temp<=5 &&temp>= 111) { 
			System.out.println("the temp is invalid");
		}
		
	    
	    
	    
	    
	    
	    
		

	}

}
