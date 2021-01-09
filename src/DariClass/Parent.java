package DariClass;

public class Parent {

	String fname;
	int age;
	String eyeColor;
	String hairColor;
	
	public Parent(String fname, int age, String eyeColor, String hairColor) {
		this.fname = fname;
		this.age = age;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
	}
	
	
	
	
	public Parent(String eyeColor2, String hairColor2) {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Parent [Name=" + fname + ", age=" + age + ", eyeColor=" + eyeColor + ", hairColor=" + hairColor + "]";
	}




	public static void main(String[] args) {
		

	}

}
