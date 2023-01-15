package RamyaJavaPractice;

public class StringManipulation {

	
	public static void main(String[] args) {
		String s= "Hello";
		String t= "Hello";
		
	    System.out.println(s.equals(t));  // return true if both are equals 
	    
	    String s1= "  Hi Ramya ";
	    
	    System.out.println(s1.trim());  // trim the spaces
	    System.out.println(s.indexOf('H'));
	    System.out.println(s.indexOf('o')); // index of a "Character"
	    char first =s.charAt(0);  //First character of a string
	    System.out.println(first);
	    
	    String M= "hello i am here";
	    
	    System.out.println(M.contains("am"));   // contains is used to know whether string is present or not
	   String p= "Ramya";
	   StringBuilder Myname= new StringBuilder(p);
	   System.out.println(Myname.reverse());  // StringBuilder is used to reverse a string
	   
	   
	   String S2= "My Name is Ramya";
	   
	   String st= S2.substring(0,2);
	   System.out.println(st);   // Substring is used to print first characters of a string
	   System.out.println(S2.indexOf(("y",1)));
	}

}
