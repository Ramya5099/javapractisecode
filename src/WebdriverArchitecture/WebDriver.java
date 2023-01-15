package WebdriverArchitecture;

public interface WebDriver extends SearchContext {
	@Override
	public void findElement();
	@Override
	public void findElements();

	public void get(String url);
	public void Click(String Element);
	public void sendKeys(String Element, String Value);
	public  String getText(String Element);
	public boolean isDispalyed(String Element);
	public void quit();
}
