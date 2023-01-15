package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		//1.byte
		// range= -128 to 127;
		//size= 1 byte =8 bits;       // primitive data types= no need to create the object
		// Numeric Type= A. Integral Type: //1.Integer--byte, short, long, int
		                                   //2. Floating point--- float, double
		
		                  //B. Character: char---'A', 'B','$'
		
		// Non primitive data types: class, array, interface, abs class
	
		byte b=10;
		System.out.println(b);
		System.out.println(b+10);
		byte b1=10;
		byte b2=20;
		int b3= b1+b2;
		System.out.println(b3);
		
		// 2. short	-----> big brother of short
		// range= -32767 to 32768
		//size= 2 bytes =2*8=16 bits
		
		short sh= 400;
		short gh= 4000;
		int sum= sh+gh;
		System.out.println(sum);
		
		
		//1.integer
		// range= -2147483648  to 2147483647---> -2^31 to 2^31+1
		//size=4 bytes=4*8=32bits
		
		int i=10;
		i=20;
		int j=30;
		System.out.println(j+i);
		
		//2.double
		//size= 8 bytes=8*8=64bits
		// range upto 15 decimal digits;
		
		double d=12.33;
		double d1=34.44;
		System.out.println(d1+d);
		
		//3.char- only single digit value should be written in single quotes
		//size=2 bytes=16bits
		//range a-z= 97 to 122;
		//A-Z= 65 to 90
		//0 to 9== 48 to 57
		
		char a1= 'a';
		char c1= 'A';       // If any arthimetic operations being performed on char it will take ASCII values 
		
		System.out.println(a1+c1);
		System.out.println((int)(a1));
		
		
	  //4.Boolean
	
		boolean b4= true;
		boolean b5=false;
		
		System.out.println(b4);
		System.out.println(b5);
		
		//5. String - it is a class, not a data type
		String s= "Hello World";
		System.out.println(s);
		
		// Long
		//range: -2^63 to +2^63+2;
		//size=8 bytes=8*8=64bits;
		long l=2121212121;
		long dist= 9878794535L;
		System.out.println(dist);
		System.out.println(l);
		
		// Float size: 4bytes=4*8=32bits
		//range= upto 7 decimal digits
		float f1 = 12.33f;
		System.out.println(f1);
		
	}

}
