package ClassBasics;

public class Runner {

	public static void main(String[] args) {

		Student obj1 = new Student ();


		Student obj2 = new Student("Jack", "Ma", 45, 3.8);
		
		obj1.setFirstName("David");
		obj1.setLastName("Jo");
		obj1.setAge(13);
		obj1.setGpa(3.4);
		
		System.out.println(obj1.getFirstName());
		System.out.println(obj2.getFirstName());

		System.out.println(obj1.getLastName());
		System.out.println(obj2.getLastName());

		System.out.println(obj1.getAge());
		System.out.println(obj2.getAge());

		System.out.println(obj1.getGpa());
		System.out.println(obj2.getGpa());

		
		
		
		
		
	}
	
	
	
}
