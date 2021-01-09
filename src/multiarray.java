
public class multiarray {

	public static void main(String[] args) {
		// create a program that prints this shape it needs to be expandable with one variable
		// int num = 10;
//		0    0000000000000		
//		00    000000000000		
//		000    00000000000
//		0000    0000000000
//		00000    000000000
//		000000    00000000
//		0000000    0000000
//		00000000    000000
//		000000000    00000
//		0000000000    0000
//		00000000000    000
//		000000000000    00
//		0000000000000    0
				
				
				int [][] zero = new int [2][18];	

				
				zero[0][0] = 10;
				zero[0][1] = 0;
				zero[0][2] = 0;
				zero[0][3] = 0;
				zero[0][4] = 0;
				zero[0][5] = 10;
				zero[0][6] = 10;
				zero[0][7] = 10;
				zero[0][8] = 10;
				zero[0][9] = 10;
				zero[0][10] = 10;
				zero[0][11] = 10;
				zero[0][12] = 10;
				zero[0][13] = 10;
				zero[0][14] = 10;
				zero[0][15] = 10;
				zero[0][16] = 10;
				zero[0][17] = 10;
				zero[1][0] = 10;
				zero[1][1] = 11;
				zero[1][2] = 0;
				zero[1][3] = 0;
				zero[1][4] = 0;
				zero[1][5] = 0;
				zero[1][6] = 10;
				zero[1][7] = 10;
				zero[1][8] = 10;
				zero[1][9] = 10;
				zero[1][10] = 10;
				zero[1][11] = 10;
				zero[1][12] = 10;
				zero[1][13] = 10;
				zero[1][14] = 10;
				zero[1][15] = 10;
				zero[1][16] = 10;
				zero[1][17] = 10;
				
				int removeIndex = 1;
			out: for (int i = 0; i < zero.length; i++) {
				in: for (int j = 0; j < zero[i].length; j++) {
					System.out.print(zero[i][j] + " ");
				
				}
				System.out.println();		
				}					
					

		
			
							
		System.out.println("********************");

	}

}
