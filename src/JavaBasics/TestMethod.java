package JavaBasics;

public class TestMethod {

	//data members:
	//1.class variables
	//2. methods/functions
	
	// three types of functions:
	// cannot create a function inside a function
	//1. no input and no return:
	// void -cannot return anything -no return
	
	
	public void test()
	{
		System.out.println("test method");
		int z= 10+20+30;
		System.out.println(z);
	}
	
	// 2. no input and some return;
	public int printValue()
	{
		System.out.println("print value");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	
	public String getTrainerName()
	{
		System.out.println("get trainer name");
		String name="Naveen";
		return name;
	}
	public static void main(String[] args) {

			// call the function:
		//create the object of the class:
		TestMethod t= new TestMethod();
		t.test();
		
		int p=t.printValue(); // print value can be stored in a variable "p" to use another time like below
		System.out.println(p);
		System.out.println(p-5);
		System.out.println(t.printValue());
		
		String n= t.getTrainerName();
		System.out.println(n);
		
	}

}
