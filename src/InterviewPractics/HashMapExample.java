package InterviewPractics;


import java.util.HashMap;
import java.util.Map;


public class HashMapExample {

	public static void main(String[] args) {

	Map<Integer, String> data = new HashMap<Integer, String>();
	Map<String, String> data1 = new HashMap<String, String>();
	data.put(1 , "first data entered in the map");
	data.put(2 , "second data entered in the map");
	
		
	data1.put("First_Name", "Jack");
	data1.put("Last_Name", "Ma");
	data1.put("age", "50");
	data1.put("Companies", "Company x 1");
	data1.put("Companies", "Company x 2");
	data1.put("Companies", "Company x 3");
	
	//System.out.println(data.get(2));
	
	System.out.println(data1);
	
	System.out.println("*******************");
	
	// Find how many times each word is repeated in this string
		String text = "Big O noation is a mathematical function that describes "
				+ "the limiting behaviour of a function when the argument tends "
				+ "or maybe limiting behavior of a function.";
	// split the sentence into words
	
	String words [] = text.split(" ");
		
		// key: the word     value: # of rep		
	Map<String, Integer> data4 = new HashMap<String, Integer>();
	String key = "";
	int val = 0;
	

	for (int i = 0; i < words.length; i++) {
		key = words[i].replace(".", "");
	
		if (data4.containsKey(key)) {
			val = data4.get(key) + 1;
		}else { 
			val = 1;
			
		}
		data4.put(key, val);
		
	}
	System.out.println(data4);
				
		 
	}

}
