package ArraysPractice;

public class ArraysBasics {

	public static void main(String[] args) {

		
	int [] data = {10, 5, 8, 15, 65, 32, 51, 65, 32};
	
	int [] data2 = new int [9];

	data2[0] = 10;
	data2[1] = 5;
	data2[2] = 8;
	data2[3] = 15;
	data2[4] = 65;
	data2[5] = 32;
	data2[6] = 51;
	data2[7] = 65;
	data2[8] = 32;
	
	
	// size - the number of indexes
	// index number - is the address to each index or location in the array
	// array always starts from 0 1 2 3 4
	// how to get and store data in array
	// size is always starts from 1 and the index starts from 0
	
	System.out.println(data2[0] + " " + data2[1]);
	
	for (int i = 0; i < data2.length; i++) {
		System.out.print(data2[i] + " ");
	
	}	


	System.out.println("*************************");
	boolean bool [] = new boolean[5];
	
	for (int i = 0; i < bool.length; i++) {
		System.out.print(bool[i] + " ");
	}
	// for boolean the result will be false if index is empty
	// for int the result will be
	// for object the result will be null
	// for number (short, int, long, float, double,)the result will be 0
	// for char the result will be 'space'
	// how many data types we have in java in general?
	
	System.out.println("*************************");
	char chars [] = new char [5];
	
	for (int i = 0; i < chars.length; i++) {
		System.out.print(chars[i] + " ");
	}
	
	
	// create an array of names and assing these names to it ..... jack, mac, dac, wac, cheese, and
	// names
	
	
	
	System.out.println("*************************");

	String names [] = new String [5];
		names[0] = "Jack";
		names[1] = "mac";
		names[2] = "dac";
		names[3] = "wac";
		names[4] = "cheese";
	for (int i = 0; i < names.length; i++) {
		System.out.print(names[i] + " ");
	}
	
		// String names [] = {"jack", "mac", "dac", "wac", "cheese"};

	// loop through the array and see if we have mac and cheese in this array of names
	System.out.println("***********************");
	boolean mac = false;
	boolean cheese = false;
	for (int i = 0; i < names.length; i++) {
		if(names[i].equals("mac")) {
			mac = true;
		} else if (names[i].equals("cheese")) {
			cheese = true;
		}
		
		if (mac && cheese) {
			
			System.out.println("mac is there");
			break;
		}
		}
	
	
	// create an array of double datatype with values 10.5, 25.6, 30.21, 20.0, 50.89
	// create double varebles for average, sum, max, min
	// loop through the array and find the average, sum, max, min
	// optional: see if you can proof the average is more thanthe sum divided by 1.9
System.out.println("***************"); 	
	double [] number = new double [5];
	number[0] = 10.5;
	number[1] = 25.6;
	number[2] = 30.21;
	number[3] = 20.0;
	number[4] = 50.89;
	
	double average = 0;
	double sum = 0;
	double min = number [0];
	double max = number [0];
	
	for (int i = 0; i < number.length; i++) {
		sum += number [i];
		min = number [i] < min ? number [i] : min;
		if (number[i] > max) {
			max = number[i];
			
		}
		
	}
	
	average = sum / number.length;
	System.out.println("Min: " + min + " Max: " + max + " Sum: " + sum + " Average: " + average + " count: " + number.length);
	if (average > (sum/1.9)) {
		
		System.out.println("Yes, the average is more than sum/ 1.9");
	} else {
		System.out.println("No, the average is not more than the sum / 1.9");
		// System.out.println(" Sum: "+ sum + "Average: " + average + "count: " + number.length);
		System.out.println(average + " not more than " + sum + " / 1.9 = " + (sum/1.9));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
