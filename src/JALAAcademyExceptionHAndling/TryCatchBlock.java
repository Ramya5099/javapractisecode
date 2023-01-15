package JALAAcademyExceptionHAndling;

public class TryCatchBlock {
String name;
	public static void main(String[] args) {
		TryCatchBlock obj= new TryCatchBlock ();
		obj=null;
try {
	obj.name="Ramya" ;//Null Pointer Exception
 		int i=9%0;
System.out.println("Hi");
	}
catch(ArithmeticException e) {
	System.out.println("AE is coming...");
	e.printStackTrace(); // to see all the exceptions at which line 

}
catch(NullPointerException e) {
	System.out.println("NPE is coming....");
	e.printStackTrace();

}
catch(Error e) {
	System.out.println("Error is coming...");
	e.printStackTrace();
}
int i[]=new int[2];
try {
	i[4]=10;
}
catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("AIOB is coming...");
	e.printStackTrace();
}

String s= "Hello World";
try {
	System.out.println(s.charAt(14));
}
catch(StringIndexOutOfBoundsException s1){
	System.out.println("String out of bound exception..");
	s1.printStackTrace();
	
}
finally {
	System.out.println("This is final block");
}
	}
}

