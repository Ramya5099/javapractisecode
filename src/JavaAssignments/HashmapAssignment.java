package JavaAssignments;

import java.util.HashMap;
import java.util.Map;

public class HashmapAssignment {
//producttype
	//name,price---generics
	
	
	
	public static Double getProdDetails(String productName)
	{
		Map<String,Double> proMap= new HashMap<String, Double>();
		proMap.put("phone", 12.33);
		proMap.put("groceries",45.77 );
		proMap.put("Toileteries", 82.33);
		proMap.put("Bath Lotions",45.77 );
		return proMap.get(productName);
	}
	
	public static String getPrName(String ProductName)
	{
		//Map<String, Double> proMap;
		String sr=proMap.get(productName);
		return sr;
	}
	public static void main(String[] args) {
//String prName= getProdName("phone");
	String pn=getPrName("phone");
	}

}
