package JALAAcademyMethodOverloading;

public class MethodoverLoading {

 String name;
	public void m1(int i) {
	System.out.println(i);	
	}
	
	
	public void m1( int i, int j) {
		System.out.println(i+j);	

	}
	public void m2(int i, String n) {
		System.out.println("i+n");
		
	}
	public void m2(int i) {
		System.out.println(i);	

	}
	public void m3(String name ) {
		this.name=name;
		System.out.println("This method name."+name);	

	}
	public void m3( int j) {
		System.out.println(j);	

	}

	public static void main(String[] args) {
		MethodoverLoading MO= new MethodoverLoading ();
		MO.m1(1);
		MO.m1(2,3);
		
		MO.m2(5);
		MO.m2(2, "Hi");
		
		MO.m3(5);
		MO.m3("Hello");
	
		
		
	}

}
