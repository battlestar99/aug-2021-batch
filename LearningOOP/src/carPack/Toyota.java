package carPack;

public class Toyota extends Car{
	
	String input = "Without key";
	
	public void doors() {
		System.out.println("Toyota have 4 door cars");
	}
	
	public void startCar() {
		System.out.println("start automatically by "+this.input);
	}
	
	public void startCar(String input) {
		System.out.println("start automatically by "+input);
	}
	
	
}
