package JALAAcademyStatic;

public class StaticMethods {
	static int i = 10;
	static int j = 20;
	int k = 9;
	int l = 8;

	public static void method1() { // creating static method
		System.out.println(i + j);

	}

	public static void method2() {
		System.out.println(i * j);
		StaticMethods sm1 = new StaticMethods(); // calling instance variable in static method
		System.out.println(sm1.k);
		sm1.m2(); // calling instance method in static with the help of obj reference
	}

	public void m1() // creating instance method
	{
		System.out.println(k + l);
		StaticMethods.method1(); // Calling static method from instance method
	}

	public void m2() {
		System.out.println(k - l);

	}

	public static void main(String[] args) {
		StaticMethods.method1(); // calling static methods with class name
		StaticMethods.method2();

		System.out.println(i + j); // Printing static variables
		StaticMethods sm = new StaticMethods();
		System.out.println(sm.k); // printing instance variable

		sm.m1(); // calling instance methods with class obj reference
		sm.m2();
	}

}
