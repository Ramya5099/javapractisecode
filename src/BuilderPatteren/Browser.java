package BuilderPatteren;

public class Browser {

	String name;
	double version;
	
	public void getBrowserinfo(Browser br1) 
	{
		br1.name ="Firefox";
		//System.out.println(br1.name);
		//System.out.println(br1.version);

	}
	public static void main(String[] args) {

		
		Browser br=new Browser();
		br.name= "Chrome";
		br.version=102.44;
		System.out.print(br.name); // o/p: Chrome and 102.44
		br.getBrowserinfo(br);
		
		System.out.print(br.name); //br will be given to br1 and manipulation wil be done then o/p: Firefox
	}

}
// Every broswer is having and version
//first create the obj of browser class and 
//create a method of getBrowserInfo class 
// we are giving browser reference to the method getBrowserInfo so br will
// be given to br1 (u1=u2 Cocnept) so we are passing reference. this is cal by reference.