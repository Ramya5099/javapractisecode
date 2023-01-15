package JALAAcademy;

public class ClassObjectMethod {
 
	public void sum() {   //sum() is a method 
	 int a =1;
	 int b=2;
	 int c= a+b;
	 System.out.println(c);
 }
	
	public static void main(String[] args) {
		ClassObjectMethod obj= new ClassObjectMethod();
	obj.sum();
 
	// creating an object for ClassObjectMethod class to call the method sum() 
	//with the help of obj reference variable.
	}

}
