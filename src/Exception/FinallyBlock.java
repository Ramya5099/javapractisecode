package Exception;

public class FinallyBlock {

	public static void main(String[] args) {
 System.out.println("A");
 try {
	 int i=9/0;
	 
 }
 catch(ArithmeticException e) {
	 System.out.print(" AE is coming");
 }
	
	finally {
		System.out.println( "Logout");
	}
 
 int p=100;
 int r=200;
 System.out.println(p+r);
	}

}
// finally will exceute at any cost