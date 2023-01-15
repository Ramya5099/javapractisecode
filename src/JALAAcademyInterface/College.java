package JALAAcademyInterface;

import InterfaceAssignment.IndianEducation;
import InterfaceAssignment.UKEducation;
import InterfaceAssignment.USEducation;

public class College implements UKEducation, USEducation {

	@Override
	public void BachelorOfSurgery() {
System.out.println("UK Education-Bachelor of Surgery");		
	}

	@Override
	public void Nursing() {
		System.out.println("UK Education-Nursing");		

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
	public void Mymethod() {
		System.out.println("My method");		
		
	}
}



