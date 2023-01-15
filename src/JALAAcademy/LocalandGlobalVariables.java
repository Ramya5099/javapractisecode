package JALAAcademy;

public class LocalandGlobalVariables {
int a=4; //declaring global variables
int b=5;
public void add() {
	int a=4; //declaring local variables
	int b=5;
	int c=a+b;
System.out.println(c);
	}
public void add1() {
	int c= a+b;
	System.out.println(c);
}
public static void main(String[] args) {
	LocalandGlobalVariables LGV= new LocalandGlobalVariables();
	LGV.add();
	LGV.add1();
}
}