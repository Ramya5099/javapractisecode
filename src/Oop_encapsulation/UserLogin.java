package Oop_encapsulation;

public class UserLogin {

	public static void main(String[] args) {

		Login l1= new Login("admin", "admin123", "superadmin");
		System.out.println(l1.getUsername());
		System.out.println(l1.getPassword());
		System.out.println( l1.role);   // role is public variable in Login class so we can access with object reference
		
		
		l1.setPassword("admin345"); //setPassword is used to update the password
		System.out.println(l1.getPassword());

		System.out.println(l1.getUserInfo());
		System.out.println(l1.getPassword());

	}

}
