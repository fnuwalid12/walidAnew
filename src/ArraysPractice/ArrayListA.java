package ArraysPractice;

import java.util.ArrayList; 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class ArrayListA {

	public static void main(String[] args) {

	
	String [] names = new String [3];
	
	names[0] = "Shabnam";
	names[1] = "Walid";
	names[2] = "john";
	
	for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
	}
 	
	
	ArrayList<String> arr2 = new ArrayList<String>();
	
	arr2.add("john");
	arr2.add("john");

	for (int i = 0; i < arr2.size(); i++) {
		System.out.println(arr2.get(i));
	}
	
	Set<Integer> number = new HashSet<Integer>();
	number.add(23);
	number.add(24);
	number.add(344);
	
	try {
		Iterator it = number.iterator();
		
	}catch (ArithmeticException e) {
		e.printStackTrace();
		
	} catch(Exception ex)  {
		ex.printStackTrace();
}
//	
//	while(it.hasNext()) {
//		System.out.print(it.next) + " ");
//		
//	}
//	System.out.println();
	
	
	
	int a = 10;
	int b = 20;
	
	
	int temp = a;
	a = b;
	b = temp;
	System.out.println("A" + a);
	System.out.println("B" + b);
	
	System.out.println("********************");
	
	
	
	String names1 = "AhmadTamim";
	String replaced = names1.replaceAll("[a-zA-Z]", "");
	String alphaChar = names1.toUpperCase().split(5, " ");
		
	if (names1==true) {
		
	}
	System.out.println(alphaChar);
	
	
	System.out.println("********************");
	
	
	int number1 = 20;
	
	if (number1%2!=0) {
		System.out.println(number1 + " is an odd number");
		
	} else {
		System.out.println(number1 + " is not an odd number");
	}
	
	
	
	
	
	
	}
	
	
	

}
