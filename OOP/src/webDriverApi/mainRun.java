package webDriverApi;

public class mainRun {

	public static void main(String[] args) {

		
		WebDriver driver = new chromeDriver();
		
		WebDriver driver1= new firefoxDriver();
		
		driver.findElements();
		
		driver1.findElements();
		
		

	}

}
