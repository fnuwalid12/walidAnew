package ArraysPractice;

public class MultiArray {

	public static void main(String[] args) {
		
	int [][] nums = new int [3][5];	

	//   0   1   2   3   4 
	//0 [10][00][00][00][00]
	//1 [00][00][00][50][00]
	//2 [00][00][00][00][00]
	
	nums[0][0] = 10;
	nums[1][0] = 50;
	nums[2][0] = 60;
	nums[0][1] = 5;
	nums[1][1] = 19;
	nums[2][1] = 18;
	nums[0][2] = 54;
	nums[1][2] = 45;
	nums[2][2] = 87;
	nums[0][3] = 89;
	nums[1][3] = 50;
	nums[2][3] = 00;
	nums[0][4] = 50;
	nums[1][4] = 10;
	nums[2][4] = 80;
	

	for (int i = 0; i < nums[2].length; i++) {
		System.out.print(nums[2][i] + " ");
	}
	
	System.out.println();
	
	
	for (int i = 0; i < nums.length; i++) {
		System.out.print(nums[i][3] + " ");
	
	}
	
		
	
	System.out.println(nums.length);
	System.out.println(nums[0].length);
	

	for (int row = 0; row < nums.length; row++) {
		for (int col = 0; col < nums[row].length; col++) {
			System.out.print(nums[row][col] + " ");
		}					
		
	System.out.println();
	}
	
	// 1 2 3 
	// 6 5 4
	// 7 8 9 
	// create a two dimension array of int and store the data above
	
	
	System.out.println("*********************");
	
	
	int [][] nums1 = new int [3][3];	

	
	nums1[0][0] = 1;
	nums1[1][0] = 6;
	nums1[2][0] = 7;
	nums1[0][1] = 2;
	nums1[1][1] = 5;
	nums1[2][1] = 8;
	nums1[0][2] = 3;
	nums1[1][2] = 4;
	nums1[2][2] = 9;
	
	for (int row = 0; row < nums1.length; row++) {
		for (int col = 0; col < nums1[row].length; col++) {
			System.out.print(nums1[row][col] + " ");
		}					
		
	System.out.println();
	}
	
	System.out.println("******************"); 	
	
	int [][] sum1 = new int [4][3];	

	
	sum1[0][0] = 10;
	sum1[0][1] = 15;
	sum1[0][2] = 20;
	sum1[1][0] = 25;
	sum1[1][1] = 30;
	sum1[1][2] = 25;
	sum1[2][0] = 10;
	sum1[2][1] = 15;
	sum1[2][2] = 20;
	sum1[3][0] = 25;
	sum1[3][1] = 30;
	sum1[3][2] = 35;
	
	int sum = 0;
	
	for (int i = 0; i < sum1.length; i++) {
		for (int j = 0; j < sum1[i].length; j++) {
			System.out.print(sum1[i][j] + " ");
			sum = sum + sum1[i][j];
			
	}
	
		System.out.println();
	}
			System.out.println("sum = " + sum);
							
		
	
	// create a program that prints this shape it needs to be expandable with one variable
	// int num = 10;
//	0    0000000000000		
//	00    000000000000		
//	000    00000000000
//	0000    0000000000
//	00000    000000000
//	000000    00000000
//	0000000    0000000
//	00000000    000000
//	000000000    00000
//	0000000000    0000
//	00000000000    000
//	000000000000    00
//	0000000000000    0
			
			
			int [] zero = new int [18];	

			
			zero[0] = 10;
			zero[1] = 10;
			zero[2] = 10;
			zero[3] = 10;
			zero[4] = 10;
			zero[5] = 10;
			zero[6] = 10;
			zero[7] = 10;
			zero[8] = 10;
			zero[9] = 10;
			zero[10] = 10;
			zero[11] = 10;
			zero[12] = 10;
			zero[13] = 10;
			zero[14] = 10;
			zero[15] = 10;
			zero[16] = 10;
			zero[17] = 10;
			
		for (int i = 0; i < zero.length; i++) {
			
				System.out.print(zero[i] + " ");
			}					
				
		System.out.println();
			
						
	System.out.println("********************");
	
	
	//create this array. insert the data using a nested loop
	//1 2 3 4 5 
	//1 2 3 4 0
	//1 2 3 0 0
	//1 2 0 0 0 
	//1 0 0 0 0 
	
	//then print the array using a nested loop
	//1 2 3 4 5
	//1 2 3 4
	//1 2 3
	//1 2 
	//1
	
	int data3 [][] = new int [5][5];
	
	
	
	
	for (int row = 0; row < data3.length; row++) {
		for (int col = 0; col < data3[row].length - row; col++) {
			
		//System.out.print(col + 1);
		data3[row][col] = col + 1;
	}
		// System.out.println();
	}
	System.out.println("*******************");
	
	for (int row = 0; row < data3.length; row++) {
		for (int col = 0; col < data3[row].length - row; col++) {
			System.out.print(data3[row][col] + " ");
		}
		 System.out.println();
	}
	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
	}
	
	

}
