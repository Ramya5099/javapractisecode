package WebdriverArchitecture;

public class FireFox implements WebDriver {

	public FireFox()
	{
		System.out.println("Launch browser..");
	}
	@Override
	public void findElement() {
		System.out.println("find Element");		
	}

	@Override
	public void findElements() {
		System.out.println("find Elements");		
		
	}

	@Override
	public void get(String url) {
		System.out.println("Launch url :" + url);		
		
	}

	@Override
	public void Click(String Element) {
		System.out.println("Click on Element :"+ Element);		
		
	}

	@Override
	public void sendKeys(String Element, String Value) {
		System.out.println("enter value in element :"+ Element + " "+ Value);		
		
	}

	@Override
	public String getText(String Element) {
		System.out.println("getting text of :" + Element);
		String str= "Amazon Header";

		return null;
	}

	@Override
	public boolean isDispalyed(String Element) {
		System.out.println("Element is displayigng:"+Element);		

		return true;
	}

	@Override
	public void quit() {
		System.out.println("Close the browser");		
		
	}

}
