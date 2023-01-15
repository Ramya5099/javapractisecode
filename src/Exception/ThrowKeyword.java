package Exception;

public class ThrowKeyword {

	public static void main(String[] args) {
String data=null;
if(data==null) {
	try {
		throw new Exception("Data not found");
	}
	catch(Exception e) {
		System.out.println("data exception is coming");
		e.printStackTrace();
	}
}
System.out.println("Logout....");
	}

}
// Throw keyword is not handling the exception. It is generating the custom exception with our custom message
// Throws keyword is written after the method name. Throws keyword is an extra keyword that java is given to bypass the 
//exception from one method to another 