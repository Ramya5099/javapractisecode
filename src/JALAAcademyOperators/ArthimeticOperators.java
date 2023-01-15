package JALAAcademyOperators;

public class ArthimeticOperators {

	public static void main(String[] args) {
		int a=4; //declaring local variables
		int b=5;
		int c=a+b;
		System.out.println(c);
		
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	// increment and decrement
	int i=1;
    int j=i++;  //post increment

    System.out.println(i);
    System.out.println(j);

int d=1;
int e= ++d;
System.out.println(d);
System.out.println(e);

// Equal operators
System.out.println(d==e);

System.out.println(!(d==e));
 //AND, OR operators
if((d==e) && (e==d)) {
	
System.out.println("True");
}
else if((d==e) || (e==d)) {
	System.out.println( "both are same value");
}
// Relational operators
if(a>b)
{
	System.out.println(" a is smaller than b");
}
else if(a<b)
{ 
	System.out.println(" a is bigger than b");

}
if(i<=j) {
	System.out.println(" i is smaller than j");
}
else if (i>=j) {
	System.out.println(" i is bigger than j");

}
	}

}
