package JavaBasics;

public class RealtimeExforMethodOverloading {

	
	public   void doPayment(upi) {
		System.out.println("enter upi number to make payment");
	}
	public  void doPayment (String cc, int cvv) {
		System.out.println(" make payment with creditcard number , cvv number");
	}
	//public void doPayment (String cc, int cvv) {
	//	System.out.println(" make payment with creditcard number , cvv number");
	//}
	public static void main(String[] args) {
		RealtimeExforMethodOverloading rm =new RealtimeExforMethodOverloading();
		System.out.println(rm.RealtimeExforMethodOverLoading("1232 3333 4444 5555", 889));
		
	}

}
