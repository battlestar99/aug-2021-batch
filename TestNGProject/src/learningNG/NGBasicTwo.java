package learningNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NGBasicTwo {
	
	
	
	
	
	@Test(priority=0)
	public void validateWebPage() {
		
		System.out.println("This is test one");
		
		
		Assert.assertEquals("Mike", "MikeOne");
		
	}
	
	
	@Test(priority=1)
	public void validateWebElements() {
		
		System.out.println("This is test two");
		
		Assert.assertEquals("Test", "Test");
		
	}

}
