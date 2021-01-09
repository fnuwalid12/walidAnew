package basics;

public class DoWhileExample {

	public static void main(String[] args) {
	
		
		int x = 0;
		
		while (x > 0 && x <=10) {
			System.out.println("x: " + x++);
		}
		
		
	do {
		System.out.println("Do while x: " + x++);
	} while (x > 0 && x <=10);
	
		System.out.println("end of the program");

	}

}
