package JALAAcademyExceptionHAndling;

public class ClassNotfound {

	public static void main(String[] args) {
try {
	Class.forName("com.invalid.com");
	ClassLoader.getSystemClassLoader().loadClass("com.invalid.com");
}
catch(ClassNotFoundException e) {
	System.out.println("classnot found exception is coming..");
	e.printStackTrace();
}
	}

}
