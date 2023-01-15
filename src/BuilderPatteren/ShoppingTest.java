package BuilderPatteren;

public class ShoppingTest {

	public static void main(String[] args) {
 
		EcommApplication obj= new EcommApplication();
     
	obj.login("naveen@gmail.com", "naveen123")
		.search("Ipad")
		 .addToCart("ipad")
		   .payment("1234 6666 8888 9999", 890)
		     .getOrderId()
		      .logout();
	//obj.login("naveen@gmail.com", "naven123");
	  //.search("ipad")
	    //.addToCart("ipad")
	     /// .payment("1234 3444 5555 6666", 990)
	        //.getOrderId()
	          //.logout():
	System.out.println("......");
	}

}



//build pattern allows avoiding the unnecessary object creation.