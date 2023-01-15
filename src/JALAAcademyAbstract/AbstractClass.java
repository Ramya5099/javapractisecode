package JALAAcademyAbstract;

public abstract class Abs
{

 abstract void method(); //abstract method

public void method1() { //non abstract method
	System.out.println("This is method1");
}


class A extends Abs{ //subclass for an abstract class
	
	public void Amethod() { // implementation for abstract method
		System.out.println("This is AMethod");
	}
}

public static void main(String[] args) {
		
	Abs ABS= new A(); // accessing the non abstract methods 
	
	ABS.method1();
	
	A a= new A(); 
	// calling  abstract methods
	a.Amethod();
	a.method1(); //calling non abstract method
	
		

	}

}
