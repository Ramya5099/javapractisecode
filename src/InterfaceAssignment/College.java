package InterfaceAssignment;

public class College implements UKEducation, USEducation, IndianEducation {

	@Override
	public void BachelorOfSurgery() {
System.out.println("UK Education-Bachelor of Surgery");		
	}

	@Override
	public void Nursing() {
		System.out.println("UK Education-Nursing");		

	}

	@Override
	public void Architecture() {
		System.out.println("UK Education-Architecture");		
		
	}

	

	@Override
	public void TeachingAssistant() {
		System.out.println("US Education-Teaching Assistant");		
		
	}

	@Override
	public void Arts() {
		System.out.println("US Education-Arts");		
		
	}

	@Override
	public void BioTechnology() {
		System.out.println("IndianEducation----BioTechnology");
	}

	@Override
	public void LLB() {
   System.out.println("IndianEducation-----LLB");		
	}

}
