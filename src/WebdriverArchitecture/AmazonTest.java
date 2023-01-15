package WebdriverArchitecture;

public class AmazonTest {
//static WebDiver driver;
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		String browser= "chrome";
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver =new FireFox();
		}
		else {
			System.out.println("Please pass the right browser");
		}
		driver.get("https://www.amazon.com");
		driver.findElement();
		driver.findElements();
driver.sendKeys("Email id", "naveen@gmail.com");
driver.sendKeys("Password", "naveen123");
driver.Click("Login button");
driver.quit();
	
	}

}
