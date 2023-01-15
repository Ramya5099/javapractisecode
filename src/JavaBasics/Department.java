package JavaBasics;

public class Department {
	public void sendMail() {

		System.out.println("Send mail");
	}
	public static void getInfo() {
		System.out.println("get info");

	}
		

	public static void main(String[] args) {

		Department d= new Department();
		d.sendMail();
		
		Department.getInfo(); //Static method using class name
		getInfo(); // Static method calling directly
		
		// how to call non static variables and methods;---- Create the object and using object reference name
		// how to call static variables and methods----Using the class name
	}

}
