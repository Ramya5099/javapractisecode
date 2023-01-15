package JavaAssignments;

public class FunctionsTestMethod {

	public int sum()
	{
		System.out.println("this is sum method");
		int a= 40;
		int b= 50;
		int c=a+b;
		return c;
		
	}
	public double Division()
	{
		double d= 10.00;
		double e= 12.22;
		double f= d%e;
		
		return f;
	}
	
	public static void main(String[] args) {
		 FunctionsTestMethod t= new FunctionsTestMethod();
	int	e =t.sum();
	System.out.println(e);
	double m=t.Division();
	System.out.println(m+1);
	}

}
