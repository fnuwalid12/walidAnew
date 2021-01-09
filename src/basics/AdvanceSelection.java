package basics;

public class AdvanceSelection {

	public static void main(String[] args) {

	boolean t = true;
	boolean f = false;
	
	if (t && f || t)	{
		if (f || f && t) {
			System.out.println("A");
			
		} else {
			System.out.println("B");
		}
	} else {
		System.out.println("C");
	}
	
	int a = 109;
	int b = 500;
	int c = 58;
	int d = 550;
	
	//write a program that will give me the max/largest number among the 4 ints
	int max = a;
	
	if (max < b) {
		max = b;
	} 
	if (max < c) {
		max = c;
	} 
	if (max < d) {
		max = d;
	}
	
	System.out.println(max);
	
	
	
	
	
	
	
	
	
	
	
	// end of the class
	}

}
