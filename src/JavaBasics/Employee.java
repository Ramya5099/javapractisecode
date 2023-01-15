package JavaBasics;

public class Employee {
	// class Variables:
			String name;
			int age;
			double salary;
			boolean IsPerm;
			
	public static void main(String[] args) {
		
		// Create the object: with "new" keyword
		
		Employee e= new Employee();
		
		e.name= "vijay";
		e.age= 25;
		e.salary= 12.33;
		e.IsPerm= true;
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
		System.out.println(e.IsPerm);
		
		
		Employee e1= new Employee();
		e1.name= "peter";
		e1.age= 27;
		
		System.out.println(e1.name); //o/p: peter
		System.out.println(e1.age); // 27
		
		// no reference
		new Employee().name ="tom";
		new Employee().age=30;
		
		// null reference object:
		
		Employee e3= new Employee();
		e3= null;
		e3.name= "Naveen";
		System.out.println( e3.name);
		
		Employee e4= null;
		System.out.println(e4.name);
		
		
	
		
	}

}
