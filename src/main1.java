
public class main1 {

	public static void main(String[] args) {

		
		// continue, break, do the same but are different
		// continue, you will skip one iteration and go to next one
		// will break the entire rest of the code
		// naming loops
		// multi-initialization
	//continue example 	
	System.out.println("***************");
	
	//if the number is 3, do not run that iteration of the loop
	for (int i = 0; i < 5; i++) {
		if (i==3) {
			continue;
		}
		System.out.println("The number is " + i);
		System.out.println("Start of the loop body");
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("End of the loop of body");
		System.out.println("-----------------------------------");
	}	
	//break example
System.out.println("***************");
	
	//if the number is 3, do not run that iteration of the loop
	for (int i = 0; i < 5; i++) {
		if (i==3) {
			break;
		}
		System.out.println("The number is " + i);
		System.out.println("Start of the loop body");
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("End of the loop of body");
		System.out.println("-----------------------------------");
	}	

	int temp = 1; 
	int data3 [][] = new int [5][5];
	System.out.println("Add data to the array");
 	for (int row = 0; row < data3.length; row++) {
 		for (int col = 0; col < data3[row].length - row; col++) {
			data3[row][col] = temp++;
			
		}
 	}
	System.out.println("*****************");
	// 1     2    3     4     5
	// 6     7    8     9     
	// 10    11   12
	// 13    14
	// 15
	// if i reach 11, the stop the loop
	
	out: for (int row = 0; row < data3.length; row++) {
		in: for (int col = 0; col < data3[row].length - row; col++) {
	
			if(data3[row][col] == 11) {
				continue out;
			}
			System.out.print(data3[row][col] + "\t");
		}
		System.out.println();
	}
	
	//you can name every loop, this will help you which one you want
	// to break or continue and which one you want to run
	
	System.out.println("****************");
	int x1 = 5;
	int y1 = 10;
	int x = 5, y = 10;
	
	boolean passed = true, happy = false, gotAjob = false;
	
	System.out.println(x1);
	System.out.println(y1);
	System.out.println(passed);
	System.out.println(x/y);
	System.out.println(happy);
	System.out.println(gotAjob);
	
	System.out.println("*********************");
	String data = "eye";
	boolean flag = true; 
	int b = data.length() - 1;
	for (int j = 0; j < data.length(); j++) {
		if (data.charAt(j) != data.charAt(b--)) {
			System.out.println("Not Pal");
			flag = false;
			break; 
		}
			
	}
	System.out.println(flag ? "Pal" : "not Pal");
	
	
	
	}

}
