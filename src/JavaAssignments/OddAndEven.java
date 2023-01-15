package JavaAssignments;

public class OddAndEven {
	
		public void Checknumber(int a) {

		if(a%2==0)
		{
			System.out.println("Even number");
			
		}
		else
		{
			System.out.println("Odd Number" );
		}
			
			
		}


	public static void main(String[] args) {
		OddAndEven oe= new OddAndEven();
 oe.Checknumber(10);
 oe.Checknumber(17);
 oe.Checknumber(25);
	}

}
