package webDriverApi;

public class firefoxDriver implements WebDriver {

	@Override
	public void findElements() {
		
		System.out.println("findlements in fireforxdriver");
		
	}

	@Override
	public void sendkeys() {
		System.out.println("sendkeys in fireforxdriver");
		
	}

	@Override
	public void click() {
		System.out.println("click in fireforxdriver");
		
	}

	@Override
	public String getText() {
		System.out.println("getText in fireforxdriver");
		return null;
	}

}
