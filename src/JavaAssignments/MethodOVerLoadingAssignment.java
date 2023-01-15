package JavaAssignments;

public class MethodOVerLoadingAssignment {

	public String phonenumber;
	String username;
	String password;
	int otp;
	

	public class FoodDelivery(phonenumber) {
	
	System.out.println("make an order with phonenumber:" + phonenumber);
	}
	public class FoodDelivery(phonenumer, password) {
		
		System.out.println("make an order with phonenumber, password:" + phonenumber+ " "+ psssword);
		}
	public class FoodDelivery(username, password) {
		
		System.out.println("make an order with username, password:" + username+ " "+ password);
		}
	public static void main(String[] args) {

		MethodOverLoadingAssignment m1= new MethodOVerLoadingAssignment();
		System.out.println(m1.FoodDelivery("NAveen", KKjjk);
	}

}
