package DariClass;

public class Dougther extends Parent{

	String lastName;
	

	public Dougther(String fname, int age, String eyeColor, String hairColor, String lastName) {
		super(fname, age, eyeColor, hairColor);
		this.lastName = lastName;
		
	}



	@Override
	public String toString() {
		return "Dougther [lastName=" + lastName + ", fname=" + fname + ", age=" + age + ", eyeColor=" + eyeColor
				+ ", hairColor=" + hairColor + " ]";
	}



	public static void main(String[] args) {

	Dougther theDougther = new Dougther ("sahar", 10, "black", "black", "Ahmadi");
	System.out.println(theDougther);
	
	
	Parent theParent = new Parent ("khalid", 35, "Black", "Black");
	System.out.println(theParent);

	

	}

}
