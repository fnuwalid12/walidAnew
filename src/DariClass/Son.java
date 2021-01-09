package DariClass;

public class Son extends Parent {

	String lastName;
	
	
	public Son(String fname, int age, String eyeColor, String hairColor, String lastName) {
		super(fname, age, eyeColor, hairColor);
		this.lastName = lastName;
	}
















	public static void main(String[] args) {
 
		Son theSon= new Son ("javid", 15, "black", "black", "Samadi");
		System.out.println(theSon);
	}

}
