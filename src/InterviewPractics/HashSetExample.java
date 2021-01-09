package InterviewPractics;

import java.util.HashSet;
import java.util.Set;


public class HashSetExample {

	public static void main(String[] args) {
		
		// HashSet<String> data = new HashSet<String>();
		String [] sorceData = {"test", "data", "Jack", "java", "Java", "jack", "Java", "test2", "test223", "test2"};
		
	 out:	for (int i = 0; i < sorceData.length; i++) {
		in:	for (int j = i+1; j < sorceData.length; j++) {
				if (sorceData[i].equals(sorceData[j])) {
					System.out.println(sorceData[i] + " is equal to " + sorceData[j] + " on indexes " + i + " and " + j );
					
					// the complixity of this code is o(n2(nsquare)
//					System.out.println(sorceData[i] + "= ?" + sorceData[j] + "  =  " 
	//		+ ((sorceData[i].equals(sorceData[j])) ? "duplicate": ""));
				break out;
			}
		}
	 }
		
		System.out.println("***********************");
		Set<String> temp = new HashSet<String>();
		
		for (int i = 0; i < sorceData.length; i++) {
			if (!temp.add(sorceData[i])) {
				System.out.println(sorceData[i] + " is duplicate");
				break;
			}
		}
		System.out.println(temp);
	 	}
		
		
		
		
		
		
		
	
}