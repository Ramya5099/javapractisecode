package JavaAssignments;

import java.util.ArrayList;

public class ArraysAssignment {

	public static void main(String[] args) {
   ArrayList ar =new ArrayList();
   ar.add("red");
   ar.add("yellow");
   ar.add("blue");
   ar.add("violet");

   ar.set(2, "red");
  
   System.out.println(ar.size());
   for (int i=0;i<ar.size();i++)
   {
	   System.out.print(ar.get(i));
	   System.out.println(ar.get(3)); //retrive a number
   }
    ar.remove(3);
    
    if(ar.contains("red")) {
    	System.out.println("red is present");
    }
    else {
    	System.out.println("red is not present");
    }
    
    for ( int i=ar.size()-1;i>=0;i--) {
    	System.out.println(i);
    	
    }
	}

}
