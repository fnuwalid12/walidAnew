package InterfaceEx;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

	MyMath obj1 = new MyMath();
	TheMath obj2 = new TheMath();
	ArrayList<Double> obj3 = new ArrayList<Double>();
	obj3.add(5.3);
	obj3.add(2.5);
	obj3.add(4.2);
	obj3.add(6.3);
	
	
	System.out.println(obj1.toPower(10, 5));
	System.out.println(obj2.toPower(10, 5));	

	
	System.out.println(obj1.getAVG(obj3));
	System.out.println(obj1.divisibleBy(2, 10));
	
	//sysoutCalcMethods.getAVG(a, b);
	}

}
