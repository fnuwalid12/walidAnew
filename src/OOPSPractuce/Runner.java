package OOPSPractuce;

public class Runner {

	public static void main(String[] args) {

	
		A obj1 = new A();
		obj1.setName("David");
		
		System.out.println(obj1.getName());
		
		B obj2 = new B();
		obj2.setName("Jack");
		
		System.out.println(obj2.getName());
		
		C obj3 = new C();
		obj3.setPhonenumber("12345678");
		
		System.out.println(obj3.getPhonenumber());
		
		B obj4 = new B();
		obj4.setAge(45);
		System.out.println(obj4.getAge());
		System.out.println(obj2.getNameMethodofTheParentClass());
		System.out.println(obj3.getName());
		
	}

}
