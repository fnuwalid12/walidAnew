package basics;

public class ScopeConsept {

	public static void main(String[] args) {

		
		int a = 5;
		if (true) {
			System.out.println(a);
			int b = 10;
			
		}

		// in the example below you will not be able to access b
		// because it is outside the upper block
		//System.out.println(b);
	}

}
