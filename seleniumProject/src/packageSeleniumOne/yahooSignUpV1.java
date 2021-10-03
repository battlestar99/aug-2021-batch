package packageSeleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSignUpV1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("John");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("wick");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).sendKeys("john_wick_7836338");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-password")).sendKeys("fhadfhdkh++");
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
