package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {

		String s="testing";
		String s1="100";
		String str= "hellpo hi this is my java code and i am so happy";
		System.out.println(str.length());
		System.out.println(s.length());
		
		int len= str.length();
		int li =0;
		int hi= len-1;
		System.out.println("LI=" +li);
		System.out.println("Hi=" +hi);
		System.out.println("length="+len);
		
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.charAt(40)); //string index out of bound  exception
	
	System.out.println(str.indexOf('i')); //first occurrence of i
	
	System.out.println(str.indexOf('i', str.indexOf('i')+1)); //second occurrence of i
	System.out.println(str.charAt(0));
	
	System.out.println(str.indexOf("java"));

	String mesg= "welcome Naveen";
	if(mesg.indexOf("Naveen")!=-1) {
		System.out.println("user is present");

	}
	else {
		System.out.println("user is not present");

	}
	
	
	// Comparison
	//string literals- SCP
	
	String t1= "hello world";
	String t2= "hello world";
	
	
	System.out.println(t1.equals(t2));
	
	System.out.println(t1.equalsIgnoreCase(t2));
	
	System.out.println(t1==t2);
	
	String t3= new String("hello naveen");
	String t4="hello naveen";
	
	String t5= new String("hello world");
	String t6= "hello world";
	
	System.out.println(t1==t6);
	
	String t8= new String("hello python");
	
	
	
    String p1= "hello testing";
	p1 = p1+"java";
	//String p3= "hello"
	System.out.println(p1);
	System.out.println(p1.toUpperCase());
	//System.out.println(p3.toUpperCase());

	//Contains
	
	String pop= "hello amazon application";
	System.out.println(pop.contains("amazon"));
	
	//trim
	
	String h1= "  hello world ";
	System.out.println(h1.trim());
	
	//replace
	
	String h2= "hello world";
	System.out.println(h2.replace(" ",""));
	
	String dob= "01-01-1988";
	System.out.println(dob.replace("-","/"));
	System.out.println(dob);
	
	// String Builder
	StringBuilder sb1= new StringBuilder("Naveen");
	
	StringBuilder sb2= new StringBuilder("Naveen");
	sb1.append("Automation");
	System.out.println(sb1); // NaveenAutomation
	
	System.out.println(sb1.equals(sb2)); //false
	
	System.out.println(sb1.toString().equals(sb2.toString())); //true
	
	//Split
	String sl= "Selenium_python_java_dotnet";
	String sp[]=sl.split("_");

	
	System.out.println(sp[0]); //Selenium
	//Split will always return the string array
	
	//1. reverse a string: first method
	String test= "Selenium";
	StringBuilder stb= new StringBuilder(test);
	stb.reverse();
	System.out.println(stb);
	
	// Second method
	 int length= test.length();
	 String rev="";
	 for(int i=length-1;i>=0;i--) {
		 rev= rev+test.charAt(i); //muineleS
		 
	 }
	 System.out.println(rev);
	
	
	 //substring-Getting a substring
	 
	 String messg= "your name is naveenAutomation123";
	 String newStr= messg.substring(7);
	 System.out.println(newStr);
	String newStr1= messg.substring(messg.indexOf("is")+3, messg.length());
	
	System.out.println(newStr1);
	}
	

}
