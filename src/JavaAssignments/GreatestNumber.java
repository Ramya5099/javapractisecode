package JavaAssignments;

public class GreatestNumber {

	
	public void age(int a) {
		if(a>=18) {
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eligible to vote");
		}
	}
	public static void main(String[] args) {
 
		GreatestNumber gn= new GreatestNumber();
 gn.age(18);
 gn.age(17);
 gn.age(10);
}
}