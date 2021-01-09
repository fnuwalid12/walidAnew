package classWork;

import java.util.ArrayList; 
import java.util.List;


public class JavaClass {

	
	
	public static void main(String[] args) {

		
		int nums = 24;
		
	if(nums%2==0) {
		System.out.println("even number");
		
	} else {
		System.out.println("odd");
	}
		
	System.out.println("-------------------------------");
	
	// print 1-25
	// 3rd = almas
	// 5th = mustafa
	// 15 = ALMAS mustafa
	
	//int numbers = 1;
	
	for (int i = 1; i <= 25; i++) {
		if (i%15==0 && i%3==0) {
			System.out.println("Shabnam Walid");
			continue;
		}
		if (i%3 == 0  ) {
			System.out.println("Walid");
			continue;
		} 
		if (i%5==0) {
			System.out.println("Shabnam");
			continue;
		}

		System.out.println(i);
		
	}
	
	
	
	System.out.println("-------------------------------------");
	
	List<ArrayList<String>> outerlist = new ArrayList<ArrayList<String>>();
	ArrayList<String> innerList = new ArrayList<String> ();
	
	innerList.add("A");
	innerList.add("B");
	innerList.add("C");
	innerList.add("D");
	
	ArrayList<String> innerlist2 = new ArrayList<String>();
	
	innerlist2.add("A2");
	innerlist2.add("B2");
	innerlist2.add("C2");
	innerlist2.add("D2");
	
	ArrayList<String> innerlist3 = new ArrayList<String>();

	innerlist3.add("A3");
	innerlist3.add("B3");
	innerlist3.add("C3");
	innerlist3.add("D3");
	
	outerlist.add(innerList);
	outerlist.add(innerlist2);
	outerlist.add(innerlist3);
	
	int count =0;
	for (int i = 0; i < outerlist.size(); i++) {
		count ++;
		for (int j = 0; j < outerlist.size(); j++) {
		System.out.print(count + " / " + outerlist.get(j));	
		}
		System.out.println();
	}
		
		
	String original = "this is a book";
	StringBuffer sb = new StringBuffer(original);
	System.out.println(sb.reverse());
	
	
	System.out.println("---------------------");
	
	
	String o = "This is class";
	String rev = "";
	
	for (int i = o.length()-1; i>=0; i--) {
	
		rev += o.charAt(i);
	} System.out.println(rev);


	
	
	
	

	}

}
