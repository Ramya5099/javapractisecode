package JavaBasics;

public class LoginConstructor {

	String Username;
	String Password;
	// we are able to access the class variables in the constructor 
	//construct the unnecessary obj creation.
	//Constructor is used to create an object and used to avoid unnecessary objects
	public LoginConstructor(String username, String password) {
		
		this.Username = username;
		this.Password = password;
	}
   public void doLogin() {
	System.out.println("enter username:"+ Username);
	System.out.println("enter Password:"+ Password);
	System.out.println("Click on login button");
	System.out.println("user is logged in");


}
	public static void main(String[] args) {

		LoginConstructor lc1 = new LoginConstructor("ramya.pingili@gmail.com", "ramya123");
		lc1.doLogin();
	}

}
