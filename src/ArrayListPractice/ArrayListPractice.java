package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {

	//array list what is array list: is a class that is emplementing the 
	// the array class is used to store data
	
		
		String data [] = new String[10];
		
		ArrayList<String> data2 = new ArrayList <String>();
		
		String x = "Test66";  
				
			
		data2.add("Test1");
		data2.add(x);
		data2.add("Test2");
		data2.add("Test3 - this one");
		data2.add("Test4");
		data2.add("Test5");
		data2.add(x);
	
		data2.remove(2);
		
	System.out.println(data2);
		for (int i = 0; i < data2.size(); i++) {
			System.out.println(data2.get(i));
		}
	
	System.out.println(data2.contains("Test4"));
	System.out.println(data2.contains("Test6"));
	System.out.println(data2.indexOf("Test4"));
	System.out.println(data2.indexOf(x));
	System.out.println(data2.lastIndexOf(x));
	
	System.out.println("*********************");
	
	
	String data3[] = new String[5];
	
	ArrayList<String> FirstName= new ArrayList <String>();
	ArrayList<String> LastName= new ArrayList <String>();
	FirstName.add("John");
	FirstName.add("Jack");
	FirstName.add("David");
	FirstName.add("Ma");
	FirstName.add("Davi");
	
	LastName.add("Joo");
	LastName.add("Jacki");
	LastName.add("Dav");
	LastName.add("Moo");
	LastName.add("Don");
	
	
	for (int i = 0; i < FirstName.size(); i++) {
		
		System.out.println((i+1)+ ". " + FirstName.get(i) + " " + LastName.get(i));

	}
	
	
	ArrayList<ArrayList<String>> data4 = new ArrayList<ArrayList<String>>();
	data4.add(new ArrayList<String>());
	data4.add(new ArrayList<String>());
	
	data4.get(0).add("Test inner 1 - 1");
	data4.get(0).add("Test inner 1 - 2");
	data4.get(0).add("Test inner 1 - 3");
	
	data4.get(1).add("Test inner 2 - 1");
	data4.get(1).add("Test inner 2 - 2");
	data4.get(1).add("Test inner 2 - 3");
	data4.get(1).add("Test inner 2 - 4");

	for (ArrayList<String> innerArrayList : data4) {
		for(String theStringinsidetheInnerArray : innerArrayList) {
			System.out.println(theStringinsidetheInnerArray);
		}
		System.out.println("********************");
		
	// for (int j = 0; j < data4.size(); j++) {
// 		for (int k = 0; k < data4.get(i).size(); k++) {
			//System.out.println(data4.get(i).get(j));
			
		//}
	//}	
		
	}
	
	
	
	
	
	
	
	}

}
