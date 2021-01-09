package DariClass;

public class TypeOfOperators {
	
	
		static int increment (int number) {
		number++;
		
		return number; 
	}

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		
		System.out.println("1: a + b: " + (a + b));
		System.out.println("2: a - b: " + (a - b));
		System.out.println("3: a * b: " + (a * b));
		System.out.println("4: a + b: " + (a / b));
		System.out.println("5: a % b: " + (a % b));
		
		
		int x = 10;
		int y = 20;
		
		System.out.println(x);
		x=y;
		System.out.println(x);
		
		int z = 15; 
		int o = 10; 
		
		//z = o;
		o += z; 
		System.out.println(o);
		
		System.out.println("********************");		
		
		double i = 50;
		double p = 100; 
		
		i /= p;
		System.out.println(i);
		
		System.out.println("********************");		
		
		double q = 500;
		double w = 100; 
		
		q /= w;
		System.out.println(q);
		
		System.out.println("********************");		
		
		int q1 = 50;
		int q2 = 100; 
		int q3 = 10;
		int q4 = 5; 
		
		q1--;
		q2++;
		--q3;
		++q4;
		
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
				
		
		System.out.println(increment(15));

		System.out.println("********************");
		
		boolean x1 = true;
		boolean x2 = false; 
		
		System.out.println( (x1 && x2) );
		System.out.println( (x1 || x2) );
		System.out.println( (x1 == x2) );
	}

}
