package JavaBasics;

public class ConditionalStatements {

	public static void main(String[] args) {

		
		System.out.println(10==20);
        int i=20; 
        int j=20;
        if(i==j)
        {
        	System.out.println("pass");
        	
        }
        else {
        	System.out.println("Fail");
        }
	
	//
        
        if(true) {
        	System.out.println("Hi");
        }
        else{  
        	//dead code
        	System.out.println("bye");
      
}

	//
        boolean flag=false;
        if(flag) {
        	System.out.println("hello");
        }
        else {
        	System.out.println("Bye");
        	
        }
	//nested if
        
    //   int marks =100;
      // if(marks>=90) {
    	//   if(marks>=95) {
    	//	   System.out.println("GRADE A++");
    	//	   if (marks==100) {
    	  // System.out.println("Eligible for scholrship");
       //}
       //else 
       //{
    	 //  System.out.println("not eligible for scholrship");
       //}
    	 //  }
      // else 
       //{
    	 //  System.out.println("Grade A");
       //}
       
     //  else 
    	   
    	//  {
    	  // System.out.println("Grade B");
       //}
    	 //  }
    	   //}
       //
    	   
       String s1= "Selenium";
       String s2= "selenium";
       if(s1.equals(s2)) {
    	   System.out.println("pass");
       }
       else {
    	   System.out.println("Fail");
       }
       
       // browser---chrome,firefox,edge
       
       String browser= "chrome";
       if(browser.equals("chrome")) {
    	   System.out.println("launch chrome");
       }
      if(browser.equals("firefox")) {
    	   System.out.println("launch firefox");
       }
       
      if(browser.equals("edge")) {
   	   System.out.println("launch edge");
      }
      else {
    	  System.out.println("Please pass the riht browser....." + browser);
    	  }	
    	   
      System.out.println("................");
	
	//
String br= "chrome";
if(br.equals("chrome")) {
	System.out.println("launch chrome");
}
else if( br.equals("edge")) {
	System.out.println("launch firefox");
}
else if(br.equals("edge")) {
	System.out.println("launch edge");
}
else {
	System.out.println("Please pass the right browser..."   + br);
}
	}
}



