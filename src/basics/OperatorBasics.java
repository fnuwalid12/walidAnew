package basics;

public class OperatorBasics {

	public static void main(String[] args) {
	

		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1 +" / " + 3 + " = " + num1 / num2);
		System.out.println(num1 +" / " + 3 + " = " + num1 % num2);
		
		//divide by zero int int, will give you a one time error
		
		
		
		int x = 10;
//		int y = 0;
		
//		System.out.println(x/y);

		// double by double if zero will give you infinity
		double x1 = 10.0;
		double y1 = 0.0;
		
		System.out.println(x1 / y1);
		
		System.out.println(x / x1);
		
		
		int qty = (int) 10.9;
		System.out.println(qty);
		
		
		
		System.out.println("*********** increment / decrement");
		System.out.println("X is " + x);
		
		System.out.println("pre-fix increment " + ++x);  // was 10
		System.out.println(x);    // 11
		System.out.println("post-fix increment " + x++);  // 11 this is increased but not pirnted, 
		System.out.println(x);    //12 this is printed after it is increased on the upper line
		
		System.out.println(--x); //11
		System.out.println(x); //11
		System.out.println(x--); // print 11 and then decrement x
		System.out.println(x); // 10
		
		
		
	}

}
