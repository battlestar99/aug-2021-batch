package packageSeleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementValidation {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		Thread.sleep(2000);
		
		WebElement contButton = driver.findElement(By.id("reg-submit-button"));
		
		boolean contdisplay = contButton.isDisplayed();
		boolean contEnable = contButton.isEnabled();
		
		System.out.println(contdisplay);
		System.out.println(contEnable);
		
		String contText = contButton.getText();
		
		System.out.println(contText);
		
		
		
		

	}

}
