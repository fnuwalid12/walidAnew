package TryExceptions;

public class TryCatchExample {

	public static void main(String[] args) {
		
	//	int a = 10;
		//int b = 0;
		
		
		//try {

			//System.out.println(a/b);//
		
		//} catch (ArithmeticException e) {
//			System.out.println("It seems that you genius are trying to divide by zero");;
		//} catch (IndexOutOfBoundsException e) {
//			System.out.println("Finally got ran away");
		//} finally {
//			System.out.println("Finally got ran away");
			
		//}
		//System.out.println("end of the program");

		System.out.println("*********************");
		

		int x[] = {10, 1, 564, 83, 634, 564, 12, 126, 15, 1, 2, 1, 5 }; 
		int y[] = {0, 100, 5, 36, 4, 8, 2 };
		
		
		for (int i = 0; i < x.length; i++) {
		try {
			System.out.println(x[i] + " / " + y[i] + " = " + (x[i]/y[i]));
							
		} catch (ArithmeticException e) {
			System.out.println("lets not try to divide by zero");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("the index you call does not exsit " + x[i] + " / " + 10 + " / " + (x[i] / 10));
		} catch (Exception e) {
			System.out.println("something went wrong, take a look at this error: " + e);
		}
	}
		System.out.println("end of the program");
}

}
