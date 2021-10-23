package webDriverApi;

public class chromeDriver implements WebDriver {

	@Override
	public void findElements() {

       System.out.println("findlements in chromedriver");
		
	}

	@Override
	public void sendkeys() {
		System.out.println("sendkeys in chromedriver");
		
		
	}

	@Override
	public void click() {
		System.out.println("click in chromedriver");
		
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		System.out.println("gettext in chromedriver");
		return null;
	}

}
