package JavaBasics;

public class MethodCalling {
	
	public void m1()
	{
	
		System.out.println("m1");
		m2();
	}
	public void m2()
	{
		System.out.println("m2");
		m3();
	}
	public void m3()
	{
		System.out.println("m3");
	}
	public static void t1() {
		System.out.println("t1");
	}
	public static void t2() {
		System.out.println("t2");
	}
	public static void t3() {
		System.out.println("bye t3");
	}
	public static void main(String[] args) {
MethodCalling obj= new MethodCalling ();
obj.m1();
obj.m2();
obj.m3(); // Non static method calling
MethodCalling.t1(); // static method calling
	}

}
