package JALAAcademyCollections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//String array declaration
		ArrayList<String> stNames = new ArrayList<String>();	
		//adding the elements
		stNames.add("Ram");
		
		stNames.add("JAM");
		stNames.add("Sam");
		stNames.add("tom");
		stNames.add("hello");
		stNames.add("hi");
		stNames.add("Sun");
		stNames.add("Run");
		stNames.add("tan");
		stNames.add("Ran");
		for(String e:stNames) {
			System.out.println(e);
			
		}
		stNames.add(2,"Mam"); //adding an element at specific index
		System.out.println("After adding an element at index 2..");
	stNames.remove(2); 
	stNames.set(1, "Ramya"); //updating an element using set
	System.out.println(stNames.indexOf(4));  //checking for an element presence
	System.out.println(stNames.get(5)); //getting an element using get method
	System.out.println(stNames.size());
	System.out.println(stNames.contains("hello"));
stNames.clear();

System.out.println("Array list is .." +  stNames);

	
	}

}
