package Constructor;

public class TestCompany {

	public static void main(String[] args) {
		
		Company C1= new Company( "Aman", "Healthinsurance","HR");
		System.out.println(C1.getUserInfo());
		C1.setStaffname("Ramya");
		System.out.println(C1.getStaffname());
	}

}
