package DariClass;

public class Pal {

	
	public static void main(String[] args) {

		String str32 = "m0om";
		String rev0 = "";
		for (int i = str32.length()-1; i>=0; i--) {
		rev0+= str32.charAt(i);
		}
		if (str32.equals(rev0)) {
			System.out.println("Palendrom");
		}else {
			System.out.println("not Pali");	
		}
		
		

	}

}
