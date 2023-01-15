package JALAAcademyCollections;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetConcept {

	public static void main(String[] args) {
HashSet<String> HM= new HashSet<>();
HM.add("Ramya");
HM.add( "Ram");
HM.add("Sam");
HM.add( "Samy");
HM.add( "Rani");
HM.add( "Tony");
HM.add( "Komal");
HM.add( "Hussain");
HM.add( "Aaha");
HM.add( "Hansi");
	//Hashset doesnt allow duplicates
HM.add("Aaha");

System.out.println("Hashset values...");  //Hashset doesnt maintain insertion order
Iterator<String> itr = HM.iterator();
while(itr.hasNext()) {
	System.out.println(itr.hasNext()+ "");
	
}
System.out.println(" ");

System.out.println(HM.clone());

System.out.println(HM.remove("Ram"));
System.out.println(HM.size());
System.out.println(HM.contains("Aaha"));



	}

}
