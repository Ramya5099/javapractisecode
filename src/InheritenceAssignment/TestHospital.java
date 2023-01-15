package InheritenceAssignment;

public class TestHospital {

	public static void main(String[] args) {
		Apollo Ap =new Apollo();
		Ap.Machinery();
		Ap.Department();
		Apollo.Outpatients();
		Apollo.staff();
		
		
		Hospitals H= new Hospitals();
		H.Department();
		H.Machinery();
		
		Hospitals H1 = new Apollo();
		H1.Department();
		H1.Machinery();
		
		Apollo Ap1= (Apollo)new Hospitals();
		
	}

}
