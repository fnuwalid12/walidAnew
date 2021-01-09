package basics;

public class SelectionBasic {

	public static void main(String[] args) {
		
		System.out.println("Start of the program");
		
		int age = 22;
		
		if(age > 21) {
			// ture block
			System.out.println("Can drive");
			 
		}
		
		System.out.println("End of the Program");
		
		int day = 0; // 0 is mon 1 2 3 4 5 6 is Sunday 
		
		if (day == 0) {
			System.out.println("Today is Monday");
		} else if (day == 1) {
			System.out.println("Today is Thursday");
		} else if (day == 2) { 
			
		}		
				
		int x = 1;
		System.out.println(x);
		System.out.println(++x); // this will increase the value of x by 1
		System.out.println(--x); // this will decrease it the value of x by 1
		System.out.println(x++); // pre and post, this means if it is x++ you will use it then increase the value
		// if it is ++x then it is increase first then it is used
		// pre fix ++x --x
		// post fix x++ x--
		
	
		
	}

}
