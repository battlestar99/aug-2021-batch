package packageSeleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classTask {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();	
		
		// step 2: click on sign in button 
		
		WebElement signinLink =driver.findElement(By.linkText("Sign in"));
		signinLink.click();
		
		// step 3: read the title and url of the new page
		
		String url = driver.getCurrentUrl(); 
		String title = driver.getTitle(); 
		
		System.out.println(url);
		System.out.println(title);
		
		// step 4: type any email in the email address text box under create an  account 
		
		WebElement emailTextBox = driver.findElement(By.name("email_create"));
		emailTextBox.sendKeys("dfjda@test.com");
		
		// step 5: find if create an account button is enabled and read the text, print 
		//the enable msg and the text in the console
		
		WebElement createButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		
		String buttonText = createButton.getText();
		boolean buttonEnable = createButton.isEnabled();
		
		System.out.println(buttonText);
		System.out.println(buttonEnable);
		
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
