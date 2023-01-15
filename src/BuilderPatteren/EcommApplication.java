package BuilderPatteren;

public class EcommApplication {
public String str;
// return type of this application is EcommApplication. classes are always non 
//primitive we dont return int.
public EcommApplication login(String un, String pwd) {
	
	System.out.println("login with:" +un+":"+ pwd);
	  String str= "welciome naveen";
	  this.str=str;
	  return this;
}

public EcommApplication search(String productName) {
	
	System.out.println("search product:"+ productName);
	  return this;
}

public EcommApplication addToCart(String productName) {
	
	System.out.println("add to cart:" + productName);
	  return this;
}
public EcommApplication payment(String upi) {
	
	System.out.println("making payment via upi:"+ upi);
	  return this;
}
public EcommApplication payment(String cc, int cvv) {
	
	System.out.println("making payment via CC:" +cc+":"+cvv);
	  return this;
}
public EcommApplication getOrderId() {
	
	System.out.println("get orderid:"+ 12334);
	  return this;

}
public EcommApplication logout() {
	
	System.out.println("logout");
	  return this;
}
	

}
