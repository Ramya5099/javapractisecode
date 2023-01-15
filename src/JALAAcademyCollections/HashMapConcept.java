package JALAAcademyCollections;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
HashMap<Integer, String> HM= new HashMap<Integer, String>();
HM.put(1,"Ramya");
HM.put(2, "Ram");
HM.put(3,"Sam");
HM.put(4, "Samy");
HM.put(5, "Rani");
HM.put(6, "Tony");
HM.put(7, "Komal");
HM.put(8, "Hussain");
HM.put(9, "Aaha");
HM.put(10, "Hansi");

System.out.println(HM.get(5)); //fetching the value of an element
System.out.println(HM.clone()); //clone copy of HashMap
System.out.println(HM.containsKey(7));    //checking for given key in the map
System.out.println(HM.containsValue("Hussain")); //checking for given value

System.out.println(HM.isEmpty()); //checking if the map is empty or not
System.out.println(HM.size()); //size of the map
System.out.println(HM.keySet());    //printing all the keyset values
System.out.println(HM.remove(2, "Ram"));  //removing specific key value pair


HashMap<Integer, String> HM1= new HashMap<Integer, String>();
HM1.putAll(HM); // copying all the HM Map values to HM1 hashmap
System.out.println(HM1);



	}

}
