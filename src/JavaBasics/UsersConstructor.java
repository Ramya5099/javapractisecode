package JavaBasics;

public class UsersConstructor {
String name;
int id;
String dob;
String city;
String IsActive;
// Above are class variables
public UsersConstructor(int id , String city) {
	
	this.id=id;
	this.city= city;
	// this variable is used to access the class variables
}
public UsersConstructor(int id , String city, String name) {
	
	this.id=id;
	this.city= city;
	this.name= name;
	// this variable is used to access the class variables
}
public UsersConstructor(int id , String city, String name, String IsActive) {
	
	this.id=id;
	this.city= city;
	this.name=name;
	this.IsActive= IsActive;
	// this variable is used to access the class variables
}

public static void main(String[] args) {
		
		UsersConstructor u1= new UsersConstructor(10, "Bangalore");
		UsersConstructor u2= new UsersConstructor(10, "pune", "tom");
		UsersConstructor u3= new UsersConstructor(10, "pune", "tom", "True");
		
		System.out.println(u1.id);
		System.out.println(u1.city);
		System.out.println(u2.id+""+u2.city + " "+ u2.name);
		System.out.println(u3.id+""+u3.city + " "+ u3.name + " "+ u3.IsActive);

	}

	
	
	
	
	// Business logic will be written inside a function. Constructor is used to initilize the claa variable. Constructor obj is created in a special location not in heap or stact memory
	
	// Funtion: May or may not return the value but constructor can never return any value
	// Function will be called with the object reference but constructor will be called when you create the object
	
}
