package SpecifierPractis;

public class Runner {

	public static void main(String[] args) {

	Student1 obj1 = new Student1("Jack", 23);
	Student1 obj2 = new Student1("David", 25);
	Student1 obj3 = new Student1();
	Student1 obj4 = new Student1();
	Student1 obj5 = new Student1();
	Student1 obj6 = new Student1();
	Student1 obj7 = new Student1();
	
	
	System.out.println(Student1.getCount());
	System.out.println(obj5.getCount());
	
	System.out.println(StaticExample.calcTaxAmount(1255.34, 25));
	}

}
