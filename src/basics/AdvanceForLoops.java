.package basics;

public class AdvanceForLoops {

	public static void main(String[] args) {
		

	
		for (int outter = 0; outter < 11; outter++) {
			System.out.print((outter + 1) + "\t-\t");
			for (int inner = 0; inner < 6; inner++) {
			
				System.out.print(inner + 1);
				
		}
			
		System.out.println();
		//if you have the 012345 in one line and you want
		//to have it in different lines just add a sysout
		//without any information, it will print the loop 
		//in a new line every time.
		
	}
		
		// every time before printing 0-5, i like to print the 
		// iteration number of the outer loop
		
		
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4 
		// 1 2 3 4 5
		
		for (int outter=0; outter<5; outter++) {
			for (int inner=0; inner<=outter; inner++ ) {
				System.out.print((inner+1)+" ");
			}
			System.out.println();
		}
		
		String a = "Fuck You";
		for (int b = a.length()-1; b >= 0; b--) {
			char c = a.charAt(b);
			System.out.print(a.charAt(b));
		}
		
		
		
		{
		int x[] = {10, 5 , 6 , 8, 89 , 90};
				// 0   1   2   3   4   5 
		System.out.println();
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		System.out.println(x[5]);
		}
		// if we run sysout x we will not get the data we 
		// would like from the array, we need to use the 
		// same array used above and use index number to get that number
		// the above way is one way to take all the numbers
		// below is to use a loop and get the number
		
		{
		int x[] = {10, 5 , 6 , 8, 89 , 90};
		// 0   1   2   3   4   5
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]); 
		}
		}
		// same loop as upper but in the same line
		{
		int x[] = {10, 5 , 6 , 8, 89 , 90};
		// 0   1   2   3   4   5
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " "); 
			
		}
		}
		{
		//enhanced for loop / foreach
		
		int x[] = {10, 5 , 6 , 8, 89 , 90};
		// 0   1   2   3   4   5
		
		for (int num: x) {
			System.out.println(num);
		
		}
		}
		// the below is another sample of enhanced for loop
		String data []= {"One", "Two", "Three"};
		for (String i : data) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
