package DariClass;

public class UserName {

	
	String userName;
	String password;
	
	public UserName(String userName, String password) {
	this.userName = userName;
	this.password = password;
	}
	
	public String showCredintial() {
		if (userName == "samim" && password == "abc123") {
			return "The user name and password is correct";
		} else {
			return "password or userName is incorrect, please try again";
		}
	}
	
	public static void main(String[] args) {
		
		UserName theUser = new UserName("samim", ""); // if you put the password inside "" the answer will change 
		System.out.println(theUser.userName + "  " + theUser.password);
		System.out.println(theUser.showCredintial());
		
	
		
	}

	
}
