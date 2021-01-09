package basics;

public class Assignment {

	public static void main(String[] args) {

		int d =5;
		
				
		System.out.println( "The value of a is " + (d + 5));

		double e=32;
		double f =10;
		double g = e/f;
		System.out.println( "The value of c is " + g);


		// Write a program that converts 10, 50, and 100 kilograms to pounds (1 lb = 0.454 kg)
		
		
		double ratio1KGtoLB = 2.20462;
		double KgtoConvert = 10;
		double ValueInPound = KgtoConvert*ratio1KGtoLB;
		
		System.out.println("10 KG = " + ValueInPound);
		
		double ratio1KGtoLB2 = 2.20462;
		double KgtoConvert2 = 50;
		double ValueInPound2 = KgtoConvert2*ratio1KGtoLB2;
		
		System.out.println("50 KG = " + ValueInPound2);
		
		
		double ratio1KGtoLB3 = 2.20462;
		double KgtoConvert3 = 100;
		double ValueInPound3 = KgtoConvert3*ratio1KGtoLB3;
		
		System.out.println("100 KG = " + ValueInPound3);
		
		
		int i = 3;
		int l = 5;
		
		System.out.println(l <= 5);
		
		boolean a = true;
		
		int b = 5;
		int c = 10;
		
		if (b*c >= 100) 
			System.out.println(a); 
			if (a = true) 
				System.out.println( "false");
				else
				System.out.println(true);
		
				

		String Email = "www.yahoo.gov";
		
		if (Email.indexOf(".com")!=-1)
		{
			System.out.println("Business");
		}
		if (Email.indexOf(".edu")!=-1) {
			
			System.out.println("Univercity");
		}
		if (Email.indexOf(".gov")!=-1) {
			System.out.println("Governoment");
		}
		if (Email.indexOf(".org")!=-1) {
			System.out.println("Organization");
		}else { 
			System.out.println("it is a web for another entity");
	}
	
		 	Scanner year = new Scanner(System.in);
	        System.out.println("Enter any numaric characters: ");
	        String year1 = year.next();
	        int year2 = Integer.parseInt(year1);
	        if (year2 >9 && year2 <= 99) {
	            System.out.println("Year2+2000");
	        }
	        else if(year2 > 999 && year2 <=999) {
	        	System.out.println(year2);
	        } else{
	            System.out.println("Year is Not Valid");
	        }
		
			
			
			
		
	}

}
