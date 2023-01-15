package Exception;

public class ThrowsKeyword {

	public void m1() throws ArithmeticException {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() throws ArithmeticException {
		System.out.println("m1 method");
		m3();
	}
	
	public void m3() throws ArithmeticException {
		System.out.println("m1 method");
		int i=9/0;
	}
	
	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("Byee...");

	}

}
