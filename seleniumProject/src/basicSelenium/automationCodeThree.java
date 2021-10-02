package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationCodeThree {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.amazon.com/books-used-books-textbooks/");
		
		driver.navigate().to("https://www.amazon.com/");
		
		String url = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
		System.out.println(url);
		
		System.out.println(title);
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		

	}

}
