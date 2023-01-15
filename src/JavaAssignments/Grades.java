package JavaAssignments;

public class Grades {

	public void display(int i)
	{
		if(i>90 &&i<=100)
		{
			System.out.println("display grade AA");
			
	}
		
		else if(i>80 &&i<=90)
		{
			System.out.println("display grade AA");
			
		}
	if(i>70 &&i<=80)
		{
			System.out.println("display grade AA");
			
		}
	else { 
		System.out.println("fail");
	}
	}
	public static void main(String[] args) {
 Grades g= new Grades();
 g.display(50);
	}

}
