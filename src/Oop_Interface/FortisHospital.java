package Oop_Interface;

public class FortisHospital implements UKMedical,USMedical,IndianMedical{

	@Override
	public void ENTServices() {
		System.out.println("ENT Services");	
	}

	@Override
	public void pediaServices() {
		System.out.println("Pedia Services");	

	}

	@Override
	public void physioServices() {
		System.out.println("Physio Services");	

		
	}

	@Override
	public void cardioServices() {
		System.out.println("Cardio Services");	
		
	}

	@Override
	public void neuroServices() {
		System.out.println("Neuro Services");	
		
	}

	@Override
	public void dentalServices() {
		System.out.println( "Dental Services");	
		
	}

	@Override
	public void orthoServices() {
		System.out.println("Ortho Services");	
		
	}

}
