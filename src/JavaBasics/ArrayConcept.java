package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// array : To store similar data type values in a array variable
		// 1.int array
		//lowest bound/index=0
		//upper bound/index= n-1( n is size of array)
		
		int i[]=new int[4];
		i[0]= 10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		// system.out.println(i[4]); // Array IndexOutofBoundException

	System.out.println(i[2]);
    System.out.println(i[3]);

    System.out.println(i.length);  //Size of array
    
    for(int j=0;j<i.length; j++)
    {
		System.out.println(i[j]);
	}
	
// 2. double array
    double d[]=new double[3];
d[0]=12.33;
d[1]=23.33;
d[2]=33.33;
System.out.println(d[2]);
// 3. Char array
    char c[]= new char[2];
		c[0]='q';
		c[1]='v';
	//4 .boolean
		boolean b[]=new boolean[2];
		b[0]= true;
		b[1]=false;
		// 5. string array
		String s[]=new String[2];
		s[0]="test";
		s[1]="hello";
		System.out.println(s.length);
		
		// 6. Object array is a class
		Object ob[]=new Object[3];
		ob[0]="tom";
		ob[1]= 23;
		ob[2]="1/1/1988";
	}

}
