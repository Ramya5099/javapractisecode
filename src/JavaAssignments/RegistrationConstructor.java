package JavaAssignments;

public class RegistrationConstructor {
	String Username;
	String Password;
	String Email;
//float phoneNumber;
	String confirmPassword;
	
	public RegistrationConstructor(String username, String password, String email,
			String confirmPassword) {
		
		this.Username = username;
		this.Password = password;
		this.Email = email;
		//this.phoneNumber = phoneNumber;
		this.confirmPassword = confirmPassword;
	}

	public void Login()
	{
		System.out.println("enter username:"+ Username);
		System.out.println("enter Password:"+ Password);
		System.out.println("enter ConfirmPassword:" + confirmPassword);
		System.out.println("enter email:"+ Email);
		//System.out.println("enter phoneNumber:" + phoneNumber);
		System.out.println("Click on login button");
		System.out.println("user is logged in");

	}
	public static void main(String[] args) {
		RegistrationConstructor rc =new RegistrationConstructor("tom","tom123","tom123","tom.123@gmail.com");
rc.Login();
	}

}
