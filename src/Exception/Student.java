package Exception;

public class Student {

	public static int getMarks(String name) {
		if(name.equals("aman") ){
			try {
				int i=9/0;				// exception is coming so it will jump into catch block and return the result in catch block
			}
			catch(ArithmeticException e) {
				return 65;
				
	}
	return 90;		
		}
		else if(name.equals("ravi")) {
			return 96;
		}
		else if (name.equals("swathi")) {
			return 70;
		}
	
		else {
			System.out.println("student is not found");
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
	int m1	=getMarks("swathi");   //getMarks m1=new getMarks(); ...m1.getMarks("aman");
	
	System.out.println(m1);
	}

}
// Finally block example
// connection with DATABASE steps:
//Make the connection with DB: SQL, ORACLE
//pass username/password/ip:8080
// try {
//hit the sql query...SQLEXCEPTION is coming
//}
//catch(SQLEXCEPTION e){
//Close the DB connection
//}

//Results from the DB
//print the results on the UI













