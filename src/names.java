
public class names {

	public static void main(String[] args) {
	
		String[] values = new String[12];
	    int name = 1;

	    // Initialize Scanner
	    java.util.Scanner input = new java.util.Scanner(System.in);

	    // Create loop for name input 
	    for (int i = 0; i < values.length; i++)
	    {
	        System.out.print("Enter in " + " Walid, Naveed, Fahim, Ahmad" + name++ + ": ");
	        values[i] = new String(input.next());
	        if (values[i].equalsIgnoreCase("zzzz")) 
	    {
	        break;
	    }
	    }

	    // Create loop for name output
	    System.out.println("\n" + "Walid, Naveed, Fahim, Ahmad: ");
	    for (int i = 0; i < values.length; i++) 
	    {
	        if (values[i].equalsIgnoreCase("zzzz")) 
	    {
	        break;

	    }
	        else 
	    {
	        System.out.println(values[i]);
	    }
	    }

	    // Search for the name
	    boolean found = false;
	    System.out.print("\n" + "Walid, Naveed, Fahim, Ahmad: ");
	    String find = input.next();
	    for(int i = 0;i < values.length && !found;++i) 
	    {
	        if (find.equalsIgnoreCase(values[i]))
	        {
	        System.out.println("\n" + "Fahim" + find + " was found");
	        found = true;
	        break;
	        }
	        else if (find != values[i] && (found = false))
	        { 
	        System.out.println("\n" + "Fahim " + find + " was not found" );
	        break;
	        }
	    } 

	}

}
