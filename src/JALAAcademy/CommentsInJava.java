package JALAAcademy;

public class CommentsInJava {
	public void singlelineComments() {
	int i=10;	//  declaring i variable
				System.out.println("i"); //printing the variable i
	}
	public void multilinecomments() { 
		/*Lets declare and  print variable */
		int j=20;
		System.out.println("j");
		

	}
	 public void documentation() {
		 /**
		  * This method calculate the sum of two integers
		  */
		 int k=0;
		 int l=7;
		
		 System.out.println(k+l);
	 }
	public static void main(String[] args) {
		CommentsInJava cm= new CommentsInJava();
		cm.documentation();
		cm.multilinecomments();
		cm.singlelineComments();
	}
}
