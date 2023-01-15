package Exception;

public class TryCatchBlock {
	String name;
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		TryCatchBlock obj= new TryCatchBlock();
		
		obj=null;
		
		try		{
			obj.name= "Tom"; //NPE
			int i=9/0;
			System.out.println("hello");
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
	System.out.println("Error  is coming....");
	e.printStackTrace();
}
		System.out.println("byeee");
		
		System.out.println("landing on home page");
		
		int a[]=new int[2];
		try {
			a[4]=10;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is coming...");
			e.printStackTrace();
		}
		
try {
	//when class loader is not able to find the specified class path while application is trying to load
	//load the calss

	Class.forName("com.selenium2022classes.com"); 
}
catch(ClassNotFoundException c) {
	c.printStackTrace();
}

	}
}
