package JALAAcademyExceptionHAndling;

public class NumberFormatExceptionClass {
// This is raised  when a method could not convert a string into numeric format
	public static void main(String[] args) {
		String S="111AAA";
		try {
			int x= Integer.parseInt(S); //converting string with in appropriate format
			int y= Integer.valueOf(S);
			System.out.println(x);
			
		}
		catch(NumberFormatException NPE) {
			System.out.println("NPE is coming..");
		NPE.printStackTrace();
		}
	}

}
