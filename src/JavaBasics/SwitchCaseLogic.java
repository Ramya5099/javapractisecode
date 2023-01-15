package JavaBasics;

public class SwitchCaseLogic {

	public static void main(String[] args) {

		String browser ="chrome";

		switch(browser.toLowerCase()) {

		case "chrome":
	System.out.println("launch chrome");
	
	String version="105";
	switch(version) {
	case "105":
	System.out.println("launch chrome v 105");
	break;
	
	default:
		break;
	}
			break;
		case "firefox":
			System.out.println(" Launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			
		case "ie":
			System.out.println("launch ie");
			break;
			default:
			System.out.println(" Please pass the right browser..."+ browser);
			break;
			
			case "brave":
			System.out.println("launch brave");
			break;
}

	}
	
	////
	
	int marks =95;
		
	switch(marks) {
	case 90:
		
		System.out.println("GRADE A");
		
		break;
	case 80:
	
	System.out.println("Grade B");
	
	break;
	case 100:
		
	System.out.println("GRADE A++");
		
		break;
		
	deafult:
			System.out.println("Fail");
		break;
		
	}


