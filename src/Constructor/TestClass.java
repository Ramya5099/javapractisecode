package Constructor;

public class TestClass {

	public static void main(String[] args) {
		BrowserClass b1= new BrowserClass("Chrome", "Adblock");
		System.out.println(b1.getName());
		System.out.println(b1.getPlugin());
		
		b1.setName("IE");
		b1.setPlugin("Adobe");
		
		System.out.println(b1.getName());
		System.out.println(b1.getPlugin());
		

	}

}
