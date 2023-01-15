package BuilderPatteren;

public class Employee extends Company {

	String name;
	int id;
	double salary;
	
	public Employee() {
		super();
		System.out.println("employee constructor");
	}
	public Employee(String name, int id, double salary) {
		
		super(name, salary);
		this.name=name;
		this.id= id;
		this.salary= salary;
	}
	public static void main(String[] args) {

		Employee e1= new Employee("tom", 101,12.33);
		System.out.println(e1.name+ " "+ e1.id+ " " +e1.salary);
	}

}
//
//employee obj is created and tom, 101,12.33 will be given to 
// name and id, salary of public employee and 
// with super keyword parent class constructor will be called and 
//name and salary will be printed