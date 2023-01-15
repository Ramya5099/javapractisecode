package InterfaceAssignmentAccessModifiers;

public class AccessModf {
private String name= "Ramya";
protected String name1 ="Ram";
private int age=34;
public String company="IT";
int Myage;
String Myname;
private void privatemethod() { // cannot inherit the private members
	System.out.println(" This is a private method");
}
public void publicmethod() { // we can access with in the package or outside the package
	System.out.println(" This is a public method");
}
protected void protectedmethod() { //we can access with in the same package
	System.out.println("This is protected method");
}
void defaultmethod() {
	System.out.println("This is default method");
}
	public static void main(String[] args) {
		AccessModf pf= new AccessModf();
pf.Myname= "Rani";
pf.Myage=21;
pf.privatemethod();
pf.protectedmethod();
pf.publicmethod();
pf.defaultmethod();
System.out.println(pf.name);
System.out.println(pf.age);
System.out.println(pf.name1);
System.out.println(pf.company);

	}

}
