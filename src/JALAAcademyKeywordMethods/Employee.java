package JALAAcademyKeywordMethods;

public class Employee extends Company  {
int num;
String name;

	public Employee(){
		super();   //will call the  parent class constructor first
		System.out.println(" employee sub class constructor");
	}
		
	
	public Employee(int num, String name) {
		this.num=num;
		this.name=name;
		System.out.println(num+""+name);

	}
	public static void main(String[] args) {
Employee e1= new Employee(12,"Tom");
System.out.println( e1.num +"" +e1.name);
	}

}
